# Официальные термины HoYoLAB

Сверено 1 ноября 2026 года по публичным словарям mi18n, которые загружаются указанными страницами HoYoLAB. В качестве исходника использованы русские значения ключей; английские значения проверены для сопоставления смысла.

Названия игровых ресурсов, режимов и статусов берутся из этих словарей. Настройки Android, оформление виджетов и сообщения самого приложения переведены отдельно. Полный текст сайта не копируется в приложение.

## Источники

- **Genshin Impact**: [страница](https://act.hoyolab.com/app/community-game-records-sea/index.html?lang=ru-ru#/ys), [русский словарь](https://fastcdn.hoyoverse.com/mi18n/bbs_oversea/m11241040191111/m11241040191111-ru-ru.json).
- **Honkai: Star Rail**: [страница](https://act.hoyolab.com/app/community-game-records-sea/rpg/index.html?lang=ru-ru#/hsr), [русский словарь](https://webstatic.hoyoverse.com/admin/mi18n/bbs_oversea/m20230509hy150knmyo/m20230509hy150knmyo-ru-ru.json).
- **Zenless Zone Zero**: [страница](https://act.hoyolab.com/app/zzz-game-record/index.html?lang=ru-ru#/zzz), [русский словарь](https://fastcdn.hoyoverse.com/mi18n/nap_global/m20240410hy38foxb7k/m20240410hy38foxb7k-ru-ru.json).

Точные ключи, проверенные значения, SHA-256 словарей и связи с ресурсами Android сохранены в [hoyolab-ru-terms.json](../localization/hoyolab-ru-terms.json). Это небольшая выборка используемых терминов, а не полный словарь сервиса.

## Термины и сокращения

### Genshin Impact

| Ключ HoYoLAB | Официальный русский текст | Применение в приложении |
| --- | --- | --- |
| `battle_chronicle` | Боевые заслуги | `dialog_msg_dailynote_not_public_error_repeat`, `msg_toast_dailynote_error_data_not_public`, `msg_toast_widget_refresh_error` Название раздела в сообщениях приложения. |
| `daily_resin` | Первородная смола | `resin`, `push_channel_name_resin`, `push_resin_noti_title`, `widget_label_resin_fixed`, `widget_label_resin_resizable` |
| `home_coin` | Сокровища обители | `realm_currency`, `btn_home_coin_full`, `push_channel_name_realm_currency`, `push_realm_currency_title` |
| `qualitative_rheometer` | Параметрический преобразователь | `btn_param_reached`, `push_channel_name_param_trans`, `push_param_trans_title`, `parametric_transformer` В компактном виджете используется сокращение «Преобразователь». |
| `daily-task` | Ежедневные поручения | `push_channel_name_daily_commission`, `push_daily_commission_title`, `daily_commissions` В виджете сокращено до «Поручения». В официальном словаре есть также варианты daily_task и daily_task_num: «Ежедневные задания». |
| `daily_expedition` | Экспедиции | `push_channel_name_expedition`, `btn_expedition_done`, `expedition_time` |
| `daily_remain_discount` | Оставшиеся попытки сокращения расходов вдвое на этой неделе | `enemies_of_note`, `btn_weekly_boss_yet` Полная подпись HoYoLAB описывает оставшиеся скидки на получение наград. В приложении используется краткая категория еженедельных боссов. |
| `daily_title` | Заметки в реальном времени | Справка: название раздела сайта. Название раздела на сайте Genshin Impact; общие сообщения приложения используют нейтральное «данные реального времени». |

### Honkai: Star Rail

| Ключ HoYoLAB | Официальный русский текст | Применение в приложении |
| --- | --- | --- |
| `hsr_note_stamina` | Энергия Освоения | `trailblaze_power`, `push_channel_name_trail_power`, `push_trail_power_noti_title` |
| `hsr_note_reserve_stamina` | Резервная энергия Освоения | `push_reserve_full_title`, `reserve_trailblaze_power` В компактном виджете сокращено до «Резерв энергии». |
| `hsr_note_daily_training` | Ежедневная тренировка | `push_daily_training_title`, `daily_training` В компактном виджете сокращено до «Тренировка». |
| `hsr_note_aftermath` | Эхо войны | `echo_of_war`, `push_echo_of_war_title` |
| `hsr_universe` | Виртуальная вселенная | `simulated_universe` |
| `hsr_universe_season` | Расходящаяся вселенная | `divergent_universe` |
| `CWar.GamePlay` | Валютные войны | `grid_fight` |
| `hsr_note_dispatch` | Выполнение поручений | `assignment_time`, `btn_assignment_done` В приложении подписи дополнены временем или состоянием поручений. |
| `hsr_note_title` | Текущая информация | Справка: название раздела сайта. Название раздела на сайте HSR; не подменяет общее название игровых данных для всех трёх игр. |

### Zenless Zone Zero

| Ключ HoYoLAB | Официальный русский текст | Применение в приложении |
| --- | --- | --- |
| `battery_num` | Зарядка аккумулятора | `battery`, `push_battery_noti_title`, `widget_label_battery`, `push_battery_noti_description` В сообщениях о количестве используется грамматическая форма «заряд аккумулятора достиг…». |
| `bounty_commission` | Призовые заказы | `push_bounty_commission_title`, `bounty_commission_progress`, `btn_bounty_commission_yet`, `push_msg_bounty_commission_yet` |
| `bounty_commission_progress` | Прогресс призовых заказов | `bounty_commission_progress` В компактном виджете оставлено название «Призовые заказы» без слова «Прогресс». |
| `zzz_member` | Интернот-подписка | `zzz_member_card`, `push_member_card_title`, `btn_member_claim_yet`, `btn_member_expire_soon`, `push_msg_member_claim_yet`, `push_msg_member_expire_soon` |
| `card` | Счастливый билет | `scratch_card`, `scratch_card_done`, `scratch_card_no` Состояния согласованы с мужским родом слова «билет». |
| `vhs_sale` | Управление видеопрокатом | `video_store_management` В компактном виджете сокращено до «Видеопрокат». |
| `sales_no` | Ожидается открытие | `video_store_management_no` |
| `sales_doing` | Уже открыто | `video_store_management_doing` |
| `sales_done` | Доступна выручка | `video_store_management_done` |
| `daily_task_active` | Активность сегодня | `engagement_today` В компактном виджете сокращено до «Активность». |
| `weekly_task_point` | Очки в Бинго Риду | `ridu_weekly` В компактном виджете используется название «Бинго Риду», числовой прогресс отображается рядом. |
| `daily_note` | Прямо сейчас | Справка: название раздела сайта. Название раздела на сайте ZZZ; в английском словаре Sticky Notes. |

## Как поддерживать соответствие

1. Найдите нужный ключ в официальном русском словаре и проверьте его смысл по английскому значению.
2. Для полного названия обновите русский ресурс Android и, если значение изменилось у HoYoLAB, снимок в `hoyolab-ru-terms.json`.
3. Для компактного виджета можно использовать сокращение. Укажите его назначение в `related_resources` и поясните в `note`; точные совпадения перечисляются в `exact_resources`.
4. Запустите `python scripts/check_localization.py`. Проверка работает по сохранённой выборке без сетевых запросов и проверяет точные совпадения из `exact_resources`.

Словари меняются со временем. Контрольная сумма фиксирует проверенную редакцию; автоматического обновления переводов по сети нет.

## Границы проверки

- Полный каталог русских имён персонажей отсутствует в исследованных словарях. Имена в PlayableCharacters.kt в этой правке не менялись.
- Для названия COFF Café в исследованных словарях нет однозначного соответствия. Текущее название сохранено; исправлено согласование состояния «Не посещена».

Применение на экране, переносы и обрезание текста проверяются отдельно на телефоне. Форматные аргументы и разметка Android сохраняются при правках.
