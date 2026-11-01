package danggai.app.presentation.util

import danggai.app.presentation.R
import danggai.domain.local.Elements
import danggai.domain.local.LocalCharacter
import danggai.domain.local.TalentArea
import danggai.domain.local.TalentDate
import danggai.domain.util.Constant

val PlayableCharacters: List<LocalCharacter> = listOf(
    LocalCharacter(
        Constant.ID_AYAKA,
        "카미사토 아야카",
        "Kamisato Ayaka",
        5,
        Elements.CRYO,
        TalentArea.INAZUMA,
        TalentDate.TUE_FRI,
        R.drawable.icon_ayaka,
        name_ru = "Камисато Аяка"
    ),

    LocalCharacter(
        Constant.ID_JEAN,
        "진",
        "Jean",
        5,
        Elements.ANEMO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_jean,
        name_ru = "Джинн"
    ),

//    LocalCharacter(
//        Constant.ID_AITHER,
//        "아이테르",
//        "Aither",
//        5,
//        Elements.ANEMO,
//        TalentArea.MONDSTADT,
//        TalentDate.ALL,
//        R.drawable.icon_aither
//    ),
//
//    LocalCharacter(
//        Constant.ID_AITHER,
//        "아이테르",
//        "Aither",
//        5,
//        Elements.GEO,
//        TalentArea.LIYUE,
//        TalentDate.ALL,
//        R.drawable.icon_aither
//    ),
//
//    LocalCharacter(
//        Constant.ID_AITHER,
//        "아이테르",
//        "Aither",
//        5,
//        Elements.ELECTRO,
//        TalentArea.INAZUMA,
//        TalentDate.ALL,
//        R.drawable.icon_aither
//    ),

    LocalCharacter(
        Constant.ID_LISA,
        "리사",
        "Lisa",
        4,
        Elements.ELECTRO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_lisa,
        name_ru = "Лиза"
    ),

//    LocalCharacter(
//        Constant.ID_LUMINE,
//        "루미네",
//        "Lumine",
//        5,
//        Elements.ANEMO,
//        TalentArea.MONDSTADT,
//        TalentDate.ALL,
//        R.drawable.icon_lumine
//    ),
//
//    LocalCharacter(
//        Constant.ID_LUMINE,
//        "루미네",
//        "Lumine",
//        5,
//        Elements.GEO,
//        TalentArea.LIYUE,
//        TalentDate.ALL,
//        R.drawable.icon_lumine
//    ),
//
//    LocalCharacter(
//        Constant.ID_LUMINE,
//        "루미네",
//        "Lumine",
//        5,
//        Elements.ELECTRO,
//        TalentArea.INAZUMA,
//        TalentDate.ALL,
//        R.drawable.icon_lumine
//    ),

    LocalCharacter(
        Constant.ID_BARBARA,
        "바바라",
        "Barbara",
        4,
        Elements.HYDRO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_barbara,
        name_ru = "Барбара"
    ),

    LocalCharacter(
        Constant.ID_KEAYA,
        "케이아",
        "Keaya",
        4,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_keaya,
        name_ru = "Кэйа"
    ),

    LocalCharacter(
        Constant.ID_DILUC,
        "다이루크",
        "Diluc",
        5,
        Elements.PYRO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_diluc,
        name_ru = "Дилюк"
    ),

    LocalCharacter(
        Constant.ID_RAZOR,
        "레이저",
        "Razor",
        4,
        Elements.ELECTRO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_razor,
        name_ru = "Рэйзор"
    ),

    LocalCharacter(
        Constant.ID_AMBER,
        "엠버",
        "Amber",
        4,
        Elements.PYRO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_amber,
        name_ru = "Эмбер"
    ),

    LocalCharacter(
        Constant.ID_VENTI,
        "벤티",
        "Venti",
        5,
        Elements.ANEMO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_venti,
        name_ru = "Венти"
    ),

    LocalCharacter(
        Constant.ID_XIANGLING,
        "향릉",
        "Xiangling",
        4,
        Elements.PYRO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_xiangling,
        name_ru = "Сян Лин"
    ),

    LocalCharacter(
        Constant.ID_BEIDOU,
        "북두",
        "Beidou",
        4,
        Elements.ELECTRO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_beidou,
        name_ru = "Бэй Доу"
    ),

    LocalCharacter(
        Constant.ID_XINGQIU,
        "행추",
        "Xingqiu",
        4,
        Elements.HYDRO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_xingqiu,
        name_ru = "Син Цю"
    ),

    LocalCharacter(
        Constant.ID_XIAO,
        "소",
        "Xiao",
        5,
        Elements.ANEMO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_xiao,
        name_ru = "Сяо"
    ),

    LocalCharacter(
        Constant.ID_NINGGUANG,
        "응광",
        "Ningguang",
        4,
        Elements.GEO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_ningguang,
        name_ru = "Нин Гуан"
    ),

    LocalCharacter(
        Constant.ID_KLEE,
        "클레",
        "Klee",
        5,
        Elements.PYRO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_klee,
        name_ru = "Кли"
    ),

    LocalCharacter(
        Constant.ID_ZHONGLI,
        "종려",
        "Zhongli",
        5,
        Elements.GEO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_zhongli,
        name_ru = "Чжун Ли"
    ),

    LocalCharacter(
        Constant.ID_FISCHL,
        "피슬",
        "Fischl",
        4,
        Elements.ELECTRO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_fischl,
        name_ru = "Фишль"
    ),

    LocalCharacter(
        Constant.ID_BENNETT,
        "베넷",
        "Bennett",
        4,
        Elements.PYRO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_bennett,
        name_ru = "Беннет"
    ),

    LocalCharacter(
        Constant.ID_CHILDE,
        "타르탈리아",
        "Childe",
        5,
        Elements.HYDRO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_childe,
        name_ru = "Тарталья"
    ),

    LocalCharacter(
        Constant.ID_NOELLE,
        "노엘",
        "Noelle",
        4,
        Elements.GEO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_noelle,
        name_ru = "Ноэлль"
    ),

    LocalCharacter(
        Constant.ID_QIQI,
        "치치",
        "Qiqi",
        5,
        Elements.CRYO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_qiqi,
        name_ru = "Ци Ци"
    ),

    LocalCharacter(
        Constant.ID_CHONGYUN,
        "중운",
        "Chongyun",
        4,
        Elements.CRYO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_chongyun,
        name_ru = "Чун Юнь"
    ),

    LocalCharacter(
        Constant.ID_GANYU,
        "감우",
        "Ganyu",
        5,
        Elements.CRYO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_ganyu,
        name_ru = "Гань Юй"
    ),

    LocalCharacter(
        Constant.ID_ALBEDO,
        "알베도",
        "Albedo",
        5,
        Elements.GEO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_albedo,
        name_ru = "Альбедо"
    ),

    LocalCharacter(
        Constant.ID_DIONA,
        "디오나",
        "Diona",
        4,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_diona,
        name_ru = "Диона"
    ),

    LocalCharacter(
        Constant.ID_MONA,
        "모나",
        "Mona",
        5,
        Elements.HYDRO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_mona,
        name_ru = "Мона"
    ),

    LocalCharacter(
        Constant.ID_KEQING,
        "각청",
        "Keqing",
        5,
        Elements.ELECTRO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_keqing,
        name_ru = "Кэ Цин"
    ),

    LocalCharacter(
        Constant.ID_SUCROSE,
        "설탕",
        "Sucrose",
        4,
        Elements.ANEMO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_sucrose,
        name_ru = "Сахароза"
    ),

    LocalCharacter(
        Constant.ID_XINYAN,
        "신염",
        "Xinyan",
        4,
        Elements.PYRO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_xinyan,
        name_ru = "Синь Янь"
    ),

    LocalCharacter(
        Constant.ID_ROSARIA,
        "로자리아",
        "Rosaria",
        4,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_rosaria,
        name_ru = "Розария"
    ),

    LocalCharacter(
        Constant.ID_HUTAO,
        "호두",
        "Hu Tao",
        5,
        Elements.PYRO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_hutao,
        name_ru = "Ху Тао"
    ),

    LocalCharacter(
        Constant.ID_KAZUHA,
        "카에데하라 카즈하",
        "Kaedehara Kazuha",
        5,
        Elements.ANEMO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_kazuha,
        name_ru = "Кадзуха"
    ),

    LocalCharacter(
        Constant.ID_YANFEI,
        "연비",
        "Yanfei",
        4,
        Elements.PYRO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_yanfei,
        name_ru = "Янь Фэй"
    ),

    LocalCharacter(
        Constant.ID_YOIMIYA,
        "요이미야",
        "Yoimiya",
        5,
        Elements.PYRO,
        TalentArea.INAZUMA,
        TalentDate.MON_THU,
        R.drawable.icon_yoimiya,
        name_ru = "Ёимия"
    ),

    LocalCharacter(
        Constant.ID_THOMA,
        "토마",
        "Thoma",
        4,
        Elements.PYRO,
        TalentArea.INAZUMA,
        TalentDate.MON_THU,
        R.drawable.icon_thoma,
        name_ru = "Тома"
    ),

    LocalCharacter(
        Constant.ID_EULA,
        "유라",
        "Eula",
        5,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_eula,
        name_ru = "Эола"
    ),

    LocalCharacter(
        Constant.ID_RAIDEN,
        "라이덴 쇼군",
        "Radien Shogun",
        5,
        Elements.ELECTRO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_raiden,
        name_ru = "Сёгун Райдэн"
    ),

    LocalCharacter(
        Constant.ID_SAYU,
        "사유",
        "Sayu",
        4,
        Elements.ANEMO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_sayu,
        name_ru = "Саю"
    ),

    LocalCharacter(
        Constant.ID_KOKOMI,
        "산고노미야 코코미",
        "Sangonomiya Kokomi",
        5,
        Elements.HYDRO,
        TalentArea.INAZUMA,
        TalentDate.MON_THU,
        R.drawable.icon_kokomi,
        name_ru = "Сангономия Кокоми"
    ),

    LocalCharacter(
        Constant.ID_GOROU,
        "고로",
        "Gorou",
        4,
        Elements.GEO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_gorou,
        name_ru = "Горо"
    ),

    LocalCharacter(
        Constant.ID_SARA,
        "쿠죠 사라",
        "Kujou Sara",
        4,
        Elements.ELECTRO,
        TalentArea.INAZUMA,
        TalentDate.TUE_FRI,
        R.drawable.icon_sara,
        name_ru = "Кудзё Сара"
    ),

    LocalCharacter(
        Constant.ID_ITTO,
        "아라타키 이토",
        "Arataki Itto",
        5,
        Elements.GEO,
        TalentArea.INAZUMA,
        TalentDate.TUE_FRI,
        R.drawable.icon_itto,
        name_ru = "Аратаки Итто"
    ),

    LocalCharacter(
        Constant.ID_YAE,
        "야에 미코",
        "Yae Miko",
        5,
        Elements.ELECTRO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_yae,
        name_ru = "Яэ Мико"
    ),

    LocalCharacter(
        Constant.ID_HEIZOU,
        "시카노인 헤이조",
        "Shikanoin Heizou",
        4,
        Elements.ANEMO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_heizou,
        name_ru = "Сиканоин Хэйдзо"
    ),

    LocalCharacter(
        Constant.ID_YERAN,
        "야란",
        "Yeran",
        5,
        Elements.HYDRO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_yeran,
        name_ru = "Е Лань"
    ),

    LocalCharacter(
        Constant.ID_ALOY,
        "에일로이",
        "Aloy",
        105,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_aloy,
        name_ru = "Элой"
    ),

    LocalCharacter(
        Constant.ID_SHENHE,
        "신학",
        "Shenhe",
        5,
        Elements.CRYO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_shenhe,
        name_ru = "Шэнь Хэ"
    ),

    LocalCharacter(
        Constant.ID_YUNJIN,
        "운근",
        "Yun Jin",
        4,
        Elements.GEO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_yunjin,
        name_ru = "Юнь Цзинь"
    ),

    LocalCharacter(
        Constant.ID_KUKI,
        "쿠키 시노부",
        "Kuki Shinobu",
        4,
        Elements.ELECTRO,
        TalentArea.INAZUMA,
        TalentDate.TUE_FRI,
        R.drawable.icon_kuki,
        name_ru = "Куки Синобу"
    ),

    LocalCharacter(
        Constant.ID_AYATO,
        "카미사토 아야토",
        "Kamisato Ayato",
        5,
        Elements.HYDRO,
        TalentArea.INAZUMA,
        TalentDate.TUE_FRI,
        R.drawable.icon_ayato,
        name_ru = "Камисато Аято"
    ),

    LocalCharacter(
        Constant.ID_COLLEI,
        "콜레이",
        "Collei",
        4,
        Elements.DENDRO,
        TalentArea.SUMERU,
        TalentDate.WED_SAT,
        R.drawable.icon_collei,
        name_ru = "Коллеи"
    ),

    LocalCharacter(
        Constant.ID_DORI,
        "도리",
        "Dori",
        4,
        Elements.ELECTRO,
        TalentArea.SUMERU,
        TalentDate.TUE_FRI,
        R.drawable.icon_dori,
        name_ru = "Дори"
    ),

    LocalCharacter(
        Constant.ID_TIGHNARI,
        "타이나리",
        "Tighnari",
        5,
        Elements.DENDRO,
        TalentArea.SUMERU,
        TalentDate.MON_THU,
        R.drawable.icon_tighnari,
        name_ru = "Тигнари"
    ),

    LocalCharacter(
        Constant.ID_NILOU,
        "닐루",
        "Nilou",
        5,
        Elements.HYDRO,
        TalentArea.SUMERU,
        TalentDate.WED_SAT,
        R.drawable.icon_nilou,
        name_ru = "Нилу"
    ),

    LocalCharacter(
        Constant.ID_CYNO,
        "사이노",
        "Cyno",
        5,
        Elements.ELECTRO,
        TalentArea.SUMERU,
        TalentDate.MON_THU,
        R.drawable.icon_cyno,
        name_ru = "Сайно"
    ),

    LocalCharacter(
        Constant.ID_CANDACE,
        "캔디스",
        "Candace",
        4,
        Elements.HYDRO,
        TalentArea.SUMERU,
        TalentDate.MON_THU,
        R.drawable.icon_candace,
        name_ru = "Кандакия"
    ),

    LocalCharacter(
        Constant.ID_NAHIDA,
        "나히다",
        "Nahida",
        5,
        Elements.DENDRO,
        TalentArea.SUMERU,
        TalentDate.TUE_FRI,
        R.drawable.icon_nahida,
        name_ru = "Нахида"
    ),

    LocalCharacter(
        Constant.ID_LAYLA,
        "레일라",
        "Layla",
        4,
        Elements.CRYO,
        TalentArea.SUMERU,
        TalentDate.TUE_FRI,
        R.drawable.icon_layla,
        name_ru = "Лайла"
    ),

    LocalCharacter(
        Constant.ID_WANDERER,
        "방랑자",
        "The Wanderer",
        5,
        Elements.ANEMO,
        TalentArea.SUMERU,
        TalentDate.WED_SAT,
        R.drawable.icon_wanderer,
        name_ru = "Странник"
    ),

    LocalCharacter(
        Constant.ID_FARUZAN,
        "파루잔",
        "Faruzan",
        4,
        Elements.ANEMO,
        TalentArea.SUMERU,
        TalentDate.MON_THU,
        R.drawable.icon_faruzan,
        name_ru = "Фарузан"
    ),

    LocalCharacter(
        Constant.ID_YAOYAO,
        "요요",
        "Yaoyao",
        4,
        Elements.DENDRO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_yaoyao,
        name_ru = "Яо Яо"
    ),

    LocalCharacter(
        Constant.ID_ALHAITHAM,
        "알하이탐",
        "Alhaitham",
        5,
        Elements.DENDRO,
        TalentArea.SUMERU,
        TalentDate.TUE_FRI,
        R.drawable.icon_alhaitham,
        name_ru = "Аль-Хайтам"
    ),

    LocalCharacter(
        Constant.ID_DEHYA,
        "데히야",
        "Dehya",
        5,
        Elements.PYRO,
        TalentArea.SUMERU,
        TalentDate.WED_SAT,
        R.drawable.icon_dehya,
        name_ru = "Дэхья"
    ),

    LocalCharacter(
        Constant.ID_MIKA,
        "미카",
        "Mika",
        4,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_mika,
        name_ru = "Мика"
    ),

    LocalCharacter(
        Constant.ID_KAVEH,
        "카베",
        "Kaveh",
        4,
        Elements.DENDRO,
        TalentArea.SUMERU,
        TalentDate.TUE_FRI,
        R.drawable.icon_kaveh,
        name_ru = "Кавех"
    ),

    LocalCharacter(
        Constant.ID_BAIZHUER,
        "백출",
        "Baizhuer",
        5,
        Elements.DENDRO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_baizhuer,
        name_ru = "Бай Чжу"
    ),

    LocalCharacter(
        Constant.ID_KIRARA,
        "키라라",
        "Kirara",
        4,
        Elements.DENDRO,
        TalentArea.INAZUMA,
        TalentDate.MON_THU,
        R.drawable.icon_kirara,
        name_ru = "Кирара"
    ),

    LocalCharacter(
        Constant.ID_LYNETTE,
        "리넷",
        "Lynette",
        4,
        Elements.ANEMO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_lynette,
        name_ru = "Линетт"
    ),

    LocalCharacter(
        Constant.ID_LYNEY,
        "리니",
        "Lyney",
        5,
        Elements.PYRO,
        TalentArea.FONTAINE,
        TalentDate.MON_THU,
        R.drawable.icon_lyney,
        name_ru = "Лини"
    ),

    LocalCharacter(
        Constant.ID_FREMINET,
        "프리미네",
        "Freminet",
        4,
        Elements.CRYO,
        TalentArea.FONTAINE,
        TalentDate.TUE_FRI,
        R.drawable.icon_freminet,
        name_ru = "Фремине"
    ),

    LocalCharacter(
        Constant.ID_WRIOTHESLEY,
        "라이오슬리",
        "Wriothesley",
        5,
        Elements.CRYO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_wriothesley,
        name_ru = "Ризли"
    ),

    LocalCharacter(
        Constant.ID_NEUVILLETTE,
        "느비예트",
        "Neuvillette",
        5,
        Elements.HYDRO,
        TalentArea.FONTAINE,
        TalentDate.MON_THU,
        R.drawable.icon_neuvillette,
        name_ru = "Нёвиллет"
    ),

    LocalCharacter(
        Constant.ID_CHARLOTTE,
        "샤를로트",
        "Charlotte",
        4,
        Elements.CRYO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_charlotte,
        name_ru = "Шарлотта"
    ),

    LocalCharacter(
        Constant.ID_FURINA,
        "푸리나",
        "Furina",
        5,
        Elements.HYDRO,
        TalentArea.FONTAINE,
        TalentDate.TUE_FRI,
        R.drawable.icon_furina,
        name_ru = "Фурина"
    ),

    LocalCharacter(
        Constant.ID_CHEVREUSE,
        "슈브르즈",
        "Chevreuse",
        4,
        Elements.PYRO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_chevreuse,
        name_ru = "Шеврёз"
    ),

    LocalCharacter(
        Constant.ID_NAVIA,
        "나비아",
        "Navia",
        5,
        Elements.GEO,
        TalentArea.FONTAINE,
        TalentDate.MON_THU,
        R.drawable.icon_navia,
        name_ru = "Навия"
    ),

    LocalCharacter(
        Constant.ID_GAMING,
        "가명",
        "Gaming",
        4,
        Elements.PYRO,
        TalentArea.LIYUE,
        TalentDate.MON_THU,
        R.drawable.icon_gaming,
        name_ru = "Ка Мин"
    ),

    LocalCharacter(
        Constant.ID_XIANYUN,
        "한운",
        "Xianyun",
        5,
        Elements.ANEMO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_xianyun,
        name_ru = "Сянь Юнь"
    ),

    LocalCharacter(
        Constant.ID_CHIORI,
        "치오리",
        "Chiori",
        5,
        Elements.GEO,
        TalentArea.INAZUMA,
        TalentDate.WED_SAT,
        R.drawable.icon_chiori,
        name_ru = "Тиори"
    ),

    LocalCharacter(
        Constant.ID_SIGEWINNE,
        "시그윈",
        "Sigewinne",
        5,
        Elements.HYDRO,
        TalentArea.FONTAINE,
        TalentDate.MON_THU,
        R.drawable.icon_sigewinne,
        name_ru = "Сиджвин"
    ),

    LocalCharacter(
        Constant.ID_ARLECCHINO,
        "아를레키노",
        "Arlecchino",
        5,
        Elements.PYRO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_arlecchino,
        name_ru = "Арлекино"
    ),

    LocalCharacter(
        Constant.ID_SETHOS,
        "세토스",
        "Sethos",
        4,
        Elements.ELECTRO,
        TalentArea.SUMERU,
        TalentDate.WED_SAT,
        R.drawable.icon_sethos,
        name_ru = "Сетос"
    ),

    LocalCharacter(
        Constant.ID_CLORINDE,
        "클로린드",
        "Clorinde",
        5,
        Elements.ELECTRO,
        TalentArea.FONTAINE,
        TalentDate.TUE_FRI,
        R.drawable.icon_clorinde,
        name_ru = "Клоринда"
    ),

    LocalCharacter(
        Constant.ID_EMILIE,
        "에밀리",
        "Emilie",
        5,
        Elements.DENDRO,
        TalentArea.FONTAINE,
        TalentDate.WED_SAT,
        R.drawable.icon_emilie,
        name_ru = "Эмилия"
    ),

    LocalCharacter(
        Constant.ID_KACHINA,
        "카치나",
        "Kachina",
        4,
        Elements.GEO,
        TalentArea.NATLAN,
        TalentDate.WED_SAT,
        R.drawable.icon_kachina,
        name_ru = "Качина"
    ),

    LocalCharacter(
        Constant.ID_KINICH,
        "키니치",
        "Kinich",
        5,
        Elements.DENDRO,
        TalentArea.NATLAN,
        TalentDate.TUE_FRI,
        R.drawable.icon_kinich,
        name_ru = "Кинич"
    ),

    LocalCharacter(
        Constant.ID_MUALANI,
        "말라니",
        "Mualani",
        5,
        Elements.HYDRO,
        TalentArea.NATLAN,
        TalentDate.MON_THU,
        R.drawable.icon_mualani,
        name_ru = "Муалани"
    ),

    LocalCharacter(
        Constant.ID_XILONEN,
        "실로닌",
        "Xilonen",
        5,
        Elements.GEO,
        TalentArea.NATLAN,
        TalentDate.TUE_FRI,
        R.drawable.icon_xilonen,
        name_ru = "Шилонен"
    ),

    LocalCharacter(
        Constant.ID_CHASCA,
        "차스카",
        "Chasca",
        5,
        Elements.ANEMO,
        TalentArea.NATLAN,
        TalentDate.WED_SAT,
        R.drawable.icon_chasca,
        name_ru = "Часка"
    ),

    LocalCharacter(
        Constant.ID_ORORON,
        "올로룬",
        "Ororon",
        4,
        Elements.ELECTRO,
        TalentArea.NATLAN,
        TalentDate.TUE_FRI,
        R.drawable.icon_ororon,
        name_ru = "Оророн"
    ),

    LocalCharacter(
        Constant.ID_MAVUIKA,
        "마비카",
        "Mavuika",
        5,
        Elements.PYRO,
        TalentArea.NATLAN,
        TalentDate.MON_THU,
        R.drawable.icon_mavuika,
        name_ru = "Мавуика"
    ),

    LocalCharacter(
        Constant.ID_CITLALI,
        "시틀라리",
        "Citlali",
        5,
        Elements.CRYO,
        TalentArea.NATLAN,
        TalentDate.TUE_FRI,
        R.drawable.icon_citlali,
        name_ru = "Ситлали"
    ),

    LocalCharacter(
        Constant.ID_LANYAN,
        "남연",
        "Lan Yan",
        4,
        Elements.ANEMO,
        TalentArea.LIYUE,
        TalentDate.TUE_FRI,
        R.drawable.icon_lanyan,
        name_ru = "Лань Янь"
    ),

    LocalCharacter(
        Constant.ID_MIZUKI,
        "유메미즈키 미즈키",
        "Yumemizuki Mizuki",
        5,
        Elements.ANEMO,
        TalentArea.INAZUMA,
        TalentDate.MON_THU,
        R.drawable.icon_mizuki,
        name_ru = "Юмэмидзуки Мидзуки"
    ),

    LocalCharacter(
        Constant.ID_VARESA,
        "바레사",
        "Varesa",
        5,
        Elements.ELECTRO,
        TalentArea.NATLAN,
        TalentDate.WED_SAT,
        R.drawable.icon_varesa,
        name_ru = "Вареса"
    ),

    LocalCharacter(
        Constant.ID_IANSAN,
        "얀사",
        "Iansan",
        4,
        Elements.ELECTRO,
        TalentArea.NATLAN,
        TalentDate.MON_THU,
        R.drawable.icon_iansan,
        name_ru = "Иансан"
    ),

    LocalCharacter(
        Constant.ID_IFA,
        "이파",
        "Ifa",
        4,
        Elements.ANEMO,
        TalentArea.NATLAN,
        TalentDate.WED_SAT,
        R.drawable.icon_ifa,
        name_ru = "Ифа"
    ),

    LocalCharacter(
        Constant.ID_ESCOFFIER,
        "에스코피에",
        "Escoffier",
        5,
        Elements.CRYO,
        TalentArea.FONTAINE,
        TalentDate.TUE_FRI,
        R.drawable.icon_escoffier,
        name_ru = "Эскофье"
    ),

    LocalCharacter(
        Constant.ID_SKIRK,
        "스커크",
        "Skirk",
        5,
        Elements.CRYO,
        TalentArea.NATLAN,
        TalentDate.MON_THU,
        R.drawable.icon_skirk,
        name_ru = "Скирк"
    ),

    LocalCharacter(
        Constant.ID_DAHLIA,
        "달리아",
        "Dahlia",
        4,
        Elements.HYDRO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_dahlia,
        name_ru = "Далия"
    ),

    LocalCharacter(
        Constant.ID_INEFFA,
        "이네파",
        "Ineffa",
        5,
        Elements.ELECTRO,
        TalentArea.NATLAN,
        TalentDate.WED_SAT,
        R.drawable.icon_ineffa,
        name_ru = "Инеффа"
    ),

    LocalCharacter(
        Constant.ID_LAUMA,
        "라우마",
        "Lauma",
        5,
        Elements.DENDRO,
        TalentArea.NODKRAI,
        TalentDate.MON_THU,
        R.drawable.icon_lauma,
        name_ru = "Лаума"
    ),

    LocalCharacter(
        Constant.ID_FLINS,
        "플린스",
        "Flins",
        5,
        Elements.HYDRO,
        TalentArea.NODKRAI,
        TalentDate.WED_SAT,
        R.drawable.icon_flins,
        name_ru = "Флинс"
    ),

    LocalCharacter(
        Constant.ID_AINO,
        "아이노",
        "Aino",
        4,
        Elements.ELECTRO,
        TalentArea.NODKRAI,
        TalentDate.TUE_FRI,
        R.drawable.icon_aino,
        name_ru = "Айно"
    ),

    LocalCharacter(
        Constant.ID_NEFER,
        "네페르",
        "Nefer",
        5,
        Elements.DENDRO,
        TalentArea.NODKRAI,
        TalentDate.TUE_FRI,
        R.drawable.icon_nefer,
        name_ru = "Нефер"
    ),

    LocalCharacter(
        Constant.ID_DURIN,
        "두린",
        "Durin",
        5,
        Elements.PYRO,
        TalentArea.MONDSTADT,
        TalentDate.WED_SAT,
        R.drawable.icon_durin,
        name_ru = "Дурин"
    ),

    LocalCharacter(
        Constant.ID_JAHODA,
        "야호다",
        "Jahoda",
        4,
        Elements.ANEMO,
        TalentArea.NODKRAI,
        TalentDate.WED_SAT,
        R.drawable.icon_jahoda,
        name_ru = "Ягода"
    ),

    LocalCharacter(
        Constant.ID_COLUMBINA,
        "콜롬비나",
        "Columbina",
        5,
        Elements.HYDRO,
        TalentArea.NODKRAI,
        TalentDate.MON_THU,
        R.drawable.icon_columbina,
        name_ru = "Коломбина"
    ),

    LocalCharacter(
        Constant.ID_ZIBAI,
        "자백",
        "Zibai",
        5,
        Elements.GEO,
        TalentArea.LIYUE,
        TalentDate.WED_SAT,
        R.drawable.icon_zibai,
        name_ru = "Цзы Бай"
    ),

    LocalCharacter(
        Constant.ID_ILLUGA,
        "일루가",
        "Illuga",
        4,
        Elements.GEO,
        TalentArea.NODKRAI,
        TalentDate.TUE_FRI,
        R.drawable.icon_illuga,
        name_ru = "Иллуги"
    ),

    LocalCharacter(
        Constant.ID_VARKA,
        "바르카",
        "Varka",
        5,
        Elements.ANEMO,
        TalentArea.MONDSTADT,
        TalentDate.MON_THU,
        R.drawable.icon_varka,
        name_ru = "Варка"
    ),

    LocalCharacter(
        Constant.ID_LINNEA,
        "린네아",
        "Linnea",
        5,
        Elements.GEO,
        TalentArea.NODKRAI,
        TalentDate.WED_SAT,
        R.drawable.icon_linnea,
        name_ru = "Линнея"
    ),
    LocalCharacter(
        Constant.ID_PRUNE,
        "프루네",
        "Prune",
        4,
        Elements.ANEMO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_prune,
        name_ru = "Прюн"
    ),
    LocalCharacter(
        Constant.ID_NICOLE,
        "니콜",
        "Nicole",
        5,
        Elements.PYRO,
        TalentArea.NODKRAI,
        TalentDate.TUE_FRI,
        R.drawable.icon_nicole,
        name_ru = "Николь"
    ),
    LocalCharacter(
        Constant.ID_LOHEN,
        "로엔",
        "Lohen",
        5,
        Elements.CRYO,
        TalentArea.MONDSTADT,
        TalentDate.TUE_FRI,
        R.drawable.icon_lohen,
        name_ru = "Лоэн"
    ),
    LocalCharacter(
        Constant.ID_SANDRONE,
        "산드로네",
        "Sandrone",
        5,
        Elements.CRYO,
        TalentArea.NODKRAI,
        TalentDate.WED_SAT,
        R.drawable.icon_sandrone,
        name_ru = "Сандроне"
    ),
    LocalCharacter(
        Constant.ID_ODETTE,
        "오데트",
        "Odette",
        5,
        Elements.CRYO,
        TalentArea.SNEZHNAYA,
        TalentDate.MON_THU,
        R.drawable.icon_odette,
        name_ru = "Одетта"
    ),
    LocalCharacter(
        Constant.ID_ALYOSHA,
        "알료샤",
        "Alyosha",
        4,
        Elements.ELECTRO,
        TalentArea.SNEZHNAYA,
        TalentDate.TUE_FRI,
        R.drawable.icon_alyosha,
        name_ru = "Алёша"
    ),
    LocalCharacter(
        Constant.ID_VESNA,
        "베스나",
        "Vesna",
        5,
        Elements.ANEMO,
        TalentArea.SNEZHNAYA,
        TalentDate.WED_SAT,
        R.drawable.icon_vesna,
        name_ru = "Весна"
    ),
    LocalCharacter(
        Constant.ID_VODYANITSA,
        "보댜니차",
        "Vodyanitsa",
        5,
        Elements.HYDRO,
        TalentArea.SNEZHNAYA,
        TalentDate.TUE_FRI,
        R.drawable.icon_vodyanitsa,
        name_ru = "Водяница"
    ),
    LocalCharacter(
        Constant.ID_MITYA,
        "미탸",
        "Mitya",
        5,
        Elements.ELECTRO,
        TalentArea.SNEZHNAYA,
        TalentDate.MON_THU,
        R.drawable.icon_mitya,
        name_ru = "Митя"
    ),
    LocalCharacter(
        Constant.ID_VALERIY,
        "발레리",
        "Valeriy",
        4,
        Elements.ELECTRO,
        TalentArea.SNEZHNAYA,
        TalentDate.WED_SAT,
        R.drawable.icon_valeriy,
        name_ru = "Валерий"
    )
)
