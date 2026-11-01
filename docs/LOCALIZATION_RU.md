# Редактирование русской локализации

Этот форк предназначен для ручного сопровождения русского перевода HoYo Assistant. Рабочая ветка — `russian-localization`; она выбрана веткой по умолчанию в форке. Первоначальная локализация основана на версии `7.2.0` исходного проекта, коммит `b66d974b1f9c93555451c04f1e75a6e231de08ad`.

## Где находится перевод

| Что исправить | Файл |
| --- | --- |
| Интерфейс, настройки, диалоги, уведомления, подписи виджетов, формы числительных | [presentation/src/main/res/values-ru/strings.xml](../presentation/src/main/res/values-ru/strings.xml) |
| Имена персонажей | [PlayableCharacters.kt](../presentation/src/main/java/danggai/app/presentation/util/PlayableCharacters.kt), поля `name_ru` |
| Английский оригинал для сравнения | [presentation/src/main/res/values/strings.xml](../presentation/src/main/res/values/strings.xml) |

Для исправления существующих переводов обычно достаточно первых двух файлов. Добавление нового языка или изменение поведения приложения требует изменений кода и выходит за рамки обычной правки текста.

Для игровых названий используйте [проверенные термины HoYoLAB и ссылки на официальные словари](HOYOLAB_TERMS.md). Точные названия и сокращённые подписи виджетов отмечены отдельно. Проверка локализации также сравнивает полные названия с сохранённой выборкой официальных терминов.

## Как внести правку через сайт GitHub

1. Откройте нужный файл по ссылке выше. Убедитесь, что выбрана ветка `russian-localization`.
2. Нажмите кнопку редактирования с карандашом.
3. Исправьте текст. В XML оставляйте атрибут `name` прежним; для имени персонажа меняйте только значение `name_ru`.
4. Нажмите **Commit changes**, укажите короткое описание исправления и сохраните изменение непосредственно в ветку `russian-localization` вашего форка.

Сохранение коммита обновляет исходники форка. Новый APK необходимо собрать отдельно. Автоматическая сборка APK, публикация релизов и отправка pull request в исходный репозиторий не настроены.

## Правила для строк Android

- Сохраняйте подстановки `%s`, `%d`, `%1$s`, `%2$d` и их типы. Число после `%` перед `$` задаёт номер аргумента. При перестановке аргументов используйте позиционную запись, например `%1$s` и `%2$d`.
- Сохраняйте переносы `\n` и значимые пробелы `\u0020`, `\u00A0`.
- В тексте XML записывайте `&` как `&amp;`, `<` как `&lt;`. Сохраняйте существующую разметку, например `<b>…</b>`.
- В `<plurals>` нужны формы `one`, `few`, `many`, `other`. Примеры целых чисел: 1 день, 2 дня, 5 дней, 11 дней, 21 день, 22 дня.
- Для компактных виджетов выбирайте короткие подписи; после изменения проверяйте их на экране телефона.
- Строки, объявленные в основном файле с `translatable="false"`, переводить не нужно.

Пример исправления существующей строки:

```xml
<string name="save_setting">Сохранить настройки</string>
```

Пример исправления имени в `PlayableCharacters.kt`:

```kotlin
name_ru = "Камисато Аяка"
```

## Локальное редактирование и проверка

Клонирование сразу рабочей ветки:

```powershell
git clone --branch russian-localization https://github.com/DarkAssassin48/android_genshin_resin_widget.git
cd android_genshin_resin_widget
```

После исправления текста запустите проверку. Достаточно Python 3.10 или новее; дополнительные библиотеки не нужны:

```powershell
python scripts/check_localization.py
git diff --check
```

Скрипт проверяет синтаксис XML, повторяющиеся имена ресурсов, наличие русских строк, подстановки, разметку, массивы, формы числительных и наличие русских имён персонажей. Успешный результат содержит `"errors": []` и код завершения 0. Он не проверяет смысл перевода или размещение текста на экране.

При необходимости можно сохранить JSON-отчёт вне репозитория:

```powershell
python scripts/check_localization.py --report I:\.codex\tmp\localization-report.json
```

Проверка Android Lint требует настроенных JDK 21 и Android SDK Platform 36:

```powershell
.\gradlew.bat :presentation:lintRelease :app:lintRelease --init-script scripts/localization-lint.gradle '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' --console=plain
```

Эта команда проверяет только категории локализации: MissingTranslation, ExtraTranslation, StringFormatInvalid, StringFormatCount, StringFormatMatches, MissingQuantity и ImpliedQuantity.

Сохранение исправлений в своём форке:

```powershell
git add presentation/src/main/res/values-ru/strings.xml
# Если меняли имена, добавьте также PlayableCharacters.kt.
git commit -m "Исправить русский перевод"
git push origin russian-localization
```

## Получение новых исходников оригинального приложения

Русский перевод сопровождается в отдельной ветке. Для добавления изменений исходного проекта в локальную копию:

```powershell
git remote add upstream https://github.com/danggai/android_genshin_resin_widget.git
git fetch upstream
git switch russian-localization
git merge upstream/master
python scripts/check_localization.py
```

Если `upstream` уже настроен, пропустите команду `git remote add`. Перед слиянием сохраните текущие правки в коммит. Разрешите возможные конфликты, добавьте переводы новых строк и русские имена новых персонажей, затем повторите проверку и отправьте результат в свой `origin`.

Ветка `master` не обновляется автоматически. Автоматическая синхронизация с исходным репозиторием не настроена.

## Сборка APK

В текущей конфигурации release-сборка не подписана. Для локальной сборки без отправки карты обфускации в Crashlytics исходного проекта:

```powershell
.\gradlew.bat :app:assembleRelease -x :app:uploadCrashlyticsMappingFileRelease '-Dorg.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8' --console=plain
```

Результат: `app/build/outputs/apk/release/app-release-unsigned.apk`. Публикация релиза этой командой не выполняется.

Изменение перевода не требует повышения `versionCode`. Номер версии для установки обновления выбирают отдельно, с учётом подписи и уже установленной версии.

Неподписанный APK нельзя установить. Подпись собственным ключом не позволяет обновить приложение из Google Play: для этого нужна подпись установленного приложения. Для сохранения обычных официальных обновлений требуется участие разработчика исходного приложения.
