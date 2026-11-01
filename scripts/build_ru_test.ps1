param(
    [ValidateRange(1, 2100000000)]
    [int]$VersionCode = 1,
    [string]$OutputDirectory,
    [string]$KeyStorePath = 'I:\.codex\tools\android-localization\signing\hoyo-ru-test.p12',
    [string]$PasswordFile = 'I:\.codex\tools\android-localization\signing\hoyo-ru-test-password.txt',
    [switch]$SkipBuild
)

$ErrorActionPreference = 'Stop'
$repoRoot = Split-Path -Parent $PSScriptRoot
if (-not $OutputDirectory) { $OutputDirectory = Join-Path $repoRoot 'artifacts' }
$OutputDirectory = [IO.Path]::GetFullPath($OutputDirectory)

foreach ($requiredFile in @($KeyStorePath, $PasswordFile)) {
    if (-not (Test-Path -LiteralPath $requiredFile -PathType Leaf)) {
        throw "Signing file not found: $requiredFile. Use the existing RU test key to keep update compatibility."
    }
}

$envNames = @('JAVA_HOME', 'ANDROID_HOME', 'ANDROID_USER_HOME', 'GRADLE_USER_HOME', 'TEMP', 'TMP')
$savedEnv = @{}
foreach ($envName in $envNames) { $savedEnv[$envName] = [Environment]::GetEnvironmentVariable($envName, 'Process') }

Push-Location $repoRoot
try {
    if (-not $env:JAVA_HOME) { $env:JAVA_HOME = 'I:\.codex\tools\android-localization\jdk-21.0.13+9' }
    if (-not $env:ANDROID_HOME) { $env:ANDROID_HOME = 'I:\.codex\tools\android-localization\sdk' }
    $env:ANDROID_USER_HOME = 'I:\.codex\cache\android-localization\android-user'
    $env:GRADLE_USER_HOME = 'I:\.codex\cache\android-localization\gradle'
    $env:TEMP = 'I:\.codex\tmp\android-localization'
    $env:TMP = $env:TEMP
    New-Item -ItemType Directory -Force $OutputDirectory, $env:TEMP, $env:ANDROID_USER_HOME, $env:GRADLE_USER_HOME | Out-Null

    $javaExe = Join-Path $env:JAVA_HOME 'bin\java.exe'
    $buildTools = Join-Path $env:ANDROID_HOME 'build-tools\34.0.0'
    foreach ($requiredTool in @($javaExe, (Join-Path $buildTools 'aapt2.exe'), (Join-Path $buildTools 'zipalign.exe'), (Join-Path $buildTools 'lib\apksigner.jar'))) {
        if (-not (Test-Path -LiteralPath $requiredTool)) { throw "Build tool not found: $requiredTool" }
    }

    if (-not $SkipBuild) {
        & .\gradlew.bat :app:assembleRuTest "-PruTestVersionCode=$VersionCode" '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' --console=plain
        if ($LASTEXITCODE -ne 0) { throw 'RU test build failed.' }
    }

    $apkDirectory = Join-Path $repoRoot 'app\build\outputs\apk\ruTest'
    $metadata = Get-Content -LiteralPath (Join-Path $apkDirectory 'output-metadata.json') -Raw | ConvertFrom-Json
    $apkInfo = $metadata.elements[0]
    if ($metadata.applicationId -ne 'danggai.app.resinwidget.rutest' -or $apkInfo.versionCode -ne $VersionCode) {
        throw 'APK metadata does not match the requested RU test package/version.'
    }
    $unsignedApk = Join-Path $apkDirectory $apkInfo.outputFile
    & (Join-Path $buildTools 'zipalign.exe') -c 4 $unsignedApk
    if ($LASTEXITCODE -ne 0) { throw 'Unsigned APK alignment check failed.' }

    $outputApk = Join-Path $OutputDirectory "HoYo-Assistant-RU-Test-$($apkInfo.versionName).apk"
    & $javaExe -jar (Join-Path $buildTools 'lib\apksigner.jar') sign --ks $KeyStorePath --ks-key-alias hoyo-ru-test --ks-pass "file:$PasswordFile" --v4-signing-enabled false --out $outputApk $unsignedApk
    if ($LASTEXITCODE -ne 0) { throw 'APK signing failed.' }
    $signature = & $javaExe -jar (Join-Path $buildTools 'lib\apksigner.jar') verify --verbose --print-certs $outputApk
    if ($LASTEXITCODE -ne 0) { throw 'APK signature verification failed.' }
    $signature | Write-Output

    $badging = & (Join-Path $buildTools 'aapt2.exe') dump badging $outputApk
    if ($LASTEXITCODE -ne 0) { throw 'APK manifest inspection failed.' }
    if (-not ($badging | Select-String -SimpleMatch "name='danggai.app.resinwidget.rutest'")) { throw 'Unexpected package in signed APK.' }
    if (-not ($badging | Select-String -SimpleMatch "application-label:'HoYo Assistant RU Test'")) { throw 'Unexpected app label in signed APK.' }

    $hash = (Get-FileHash -LiteralPath $outputApk -Algorithm SHA256).Hash.ToLowerInvariant()
    $report = [ordered]@{
        apk = [IO.Path]::GetFileName($outputApk)
        app_name = 'HoYo Assistant RU Test'
        application_id = $metadata.applicationId
        version_name = $apkInfo.versionName
        version_code = $apkInfo.versionCode
        signed = $true
        sha256 = $hash
    }
    $reportPath = [IO.Path]::ChangeExtension($outputApk, '.json')
    [IO.File]::WriteAllText($reportPath, ($report | ConvertTo-Json), [Text.UTF8Encoding]::new($false))
    Write-Output "APK: $outputApk"
    Write-Output "SHA256: $hash"
}
finally {
    Pop-Location
    foreach ($envName in $envNames) {
        [Environment]::SetEnvironmentVariable($envName, $savedEnv[$envName], 'Process')
    }
}
