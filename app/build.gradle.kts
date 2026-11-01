import dependency.Versions

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

val ruTestVersionCode = providers.gradleProperty("ruTestVersionCode").orElse("1").get().toInt()
require(ruTestVersionCode in 1..2100000000)
val ruTestVersionName = "${Versions.versionName}-ru-test.$ruTestVersionCode"

android {
    compileSdk = Versions.compileSdk
    compileSdkVersion = Versions.compileSdkString

    defaultConfig {
        applicationId = "danggai.app.resinwidget"
        minSdk = Versions.minSdk
        targetSdk = Versions.compileSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        buildConfigField("boolean", "RU_TEST", "false")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isDebuggable = false
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("long", "VERSION_CODE", "${Versions.versionCode}")
            buildConfigField("String", "VERSION_NAME", "\"${Versions.versionName}\"")
        }
        getByName("debug") {
//            applicationIdSuffix = ".debug"
            isDebuggable = true
            buildConfigField("long", "VERSION_CODE", "${Versions.versionCode}")
            buildConfigField("String", "VERSION_NAME", "\"${Versions.versionName}\"")
        }
        create("ruTest") {
            initWith(getByName("release"))
            applicationIdSuffix = ".rutest"
            matchingFallbacks += listOf("release")
            signingConfig = null // Signed locally with the persistent RU test key.
            buildConfigField("boolean", "RU_TEST", "true")
            buildConfigField("long", "VERSION_CODE", "$ruTestVersionCode")
            buildConfigField("String", "VERSION_NAME", "\"$ruTestVersionName\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
    }

    namespace = "danggai.app.resinwidget"
    kapt {
        correctErrorTypes = true
    }
}

androidComponents {
    onVariants(selector().withBuildType("ruTest")) { variant ->
        variant.outputs.forEach { output ->
            output.versionCode.set(ruTestVersionCode)
            output.versionName.set(ruTestVersionName)
        }
    }
}

// This separate app does not use the upstream Firebase project or upload mappings.
tasks.configureEach {
    if (name == "processRuTestGoogleServices" || name == "uploadCrashlyticsMappingFileRuTest") {
        enabled = false
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presentation"))

// Coroutine
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    // Rx
    implementation(libs.rx.android)
    implementation(libs.rx.java)
    implementation(libs.rx.kotlin)

    // Glide - image
    implementation(libs.glide)
    kapt(libs.glide.compiler)

    // Hilt - DI
    implementation(libs.daggerHilt.android)
    kapt(libs.daggerHilt.compiler)
    implementation(libs.hilt.work)
    kapt(libs.hilt.compiler)

    // OkHttp3 & Retrofit - for network
    implementation(libs.logging.interceptor)
    implementation(libs.retrofit.gson)
    implementation(libs.retrofit)
    implementation(libs.retrofit.rxjava)

    // Sandwich - Network success/fail Handling
    implementation(libs.sandwich)

    // Firebase Crashlytics

    // Firebase Crashlytics
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.crashlytics)
}
