package cn.zvo.translate.tcdn.core;

/**
 * 网站管理后台的左侧菜单项的id唯一标示
 * @author 管雷鸣
 *
 */
public enum LanguageEnum {
	ENGLISH("english", "English", "英语"),
	CHINESE_SIMPLIFIED("chinese_simplified", "简体中文", "简体中文"),
	CHINESE_TRADITIONAL("chinese_traditional", "繁體中文", "繁体中文"),
	KOREAN("korean", "한어", "韩语"),
	JAPANESE("japanese", "しろうと", "日语"),
	RUSSIAN("russian","Русский язык", "俄语"),
	ARABIC("arabic", "بالعربية", "阿拉伯语"),

	GERMAN("german","deutsch","德语"),
	FRENCH("french", "Français", "法语"),
	PORTUGUESE("portuguese","português","葡萄牙语"),
	THAI("thai", "คนไทย", "泰语"),
	TURKISH("turkish", "Türkçe", "土耳其语"),
	VIETNAMESE("vietnamese", "Tiếng Việt", "越南语"),
	AFRIKAANS("afrikaans", "afrikaans", "南非荷兰语"),
	TWI("twi", "Ma frɛ", "契维语"),
	AMHARIC("amharic", "amharic", "阿姆哈拉语"),
	ASSAMESE("assamese", "assamese", "阿萨姆语"),
	AYMARA("aymara", "aymara.", "艾马拉语"),
	AZERBAIJANI("azerbaijani", "azerbaijani", "阿塞拜疆语"),
	BELARUSIAN("belarusian", "БеларускаяName", "白俄罗斯语"),
	BULGARIAN("bulgarian", "български", "保加利亚语"),
	BHOJPURI("bhojpuri", "हमार कपार दर्द करता।", "博杰普尔语"),
	BENGALI("bengali", "বেঙ্গালী", "孟加拉语"),
	BOSNIAN("bosnian", "bosnian", "波斯尼亚语"),
	CATALAN("catalan", "català", "加泰罗尼亚语"),
	CEBUANO("cebuano", "cebuano", "宿务语"),

	CORSICAN("corsican", "hinaassicurasol", "科西嘉语"),
	CZECH("czech", "český", "捷克语"),
	WELSH("welsh", "color name", "威尔士语"),
	DANISH("danish", "dansk", "丹麦语"),

	DHIVEHI("dhivehi", "ދިވާރީވް", "迪维希语"),

	GREEK("greek", "ελληνικά", "希腊语"),
	SPANISH("spanish", "Español", "西班牙语"),
	ESTONIAN("estonian", "eesti keel", "爱沙尼亚语"),
	BASQUE("basque", "baskoa", "巴斯克语"),
	PERSIAN("persian", "Persian", "波斯语"),
	FINNISH("finnish", "suomi", "芬兰语"),
	IRISH("irish", "Íris", "爱尔兰语"),

	GALICIAN("galician", "galico", "加利西亚语"),
	GUARANI("guarani", "ondoho", "瓜拉尼语"),

	GUJARATI("gujarati", "ગુજરાતી", "古吉拉特语"),
	HAUSA("hausa", "dictionary variant", "豪萨语"),
	HAWAIIAN("hawaiian", "panekeʻhaka", "夏威夷语"),
	HINDI("hindi", "हिन्दी", "印地语"),
	HMONG("hmong", "hmong", "苗语"),
	CROATIAN("croatian", "hrvatski", "克罗地亚语"),
	HUNGARIAN("hungarian", "magyar", "匈牙利语"),
	ARMENIAN("armenian", "Արմենյան", "亚美尼亚语"),
	DUTCH("dutch", "nederlands", "荷兰语"),
	ITALIAN("italian", "italiano", "意大利语"),

	INDONESIAN("indonesian", "IndonesiaName", "印尼语"),
	IGBO("igbo", "igbo", "伊博语"),
	ICELANDIC("Icelandic", "ÍslandName", "冰岛语"),
	HEBREW("Hebrew", "היברית", "希伯来语"),
	GEORGIAN("Georgian", "ჯორჯიანიName", "格鲁吉亚语"),
	KHMER("Khmer", "ខ្មែរKCharselect unicode block name", "高棉语"),
	KANNADA("Kannada", "ಕನ್ನಡ್Name", "卡纳达语"),
	CREOLE("Creole", "a n:n", "克里奥尔语"),
	KURDISH("Kurdish", "Kurdî", "库尔德语（库尔曼吉语）"),
	KYRGYZ("Kyrgyz", "Кыргыз тили", "吉尔吉斯语"),
	LATIN("Latin", "Latina", "拉丁语"),
	LUXEMBOURGISH("Luxembourgish", "LëtzebuergeschName", "卢森堡语"),
	LUGANDA("luganda", "luganda", "卢干达语"),
	LAO("Lao", "ກະຣຸນາ", "老挝语"),
	LITHUANIAN("Lithuanian", "Lietuva", "立陶宛语"),
	LATVIAN("latvian", "latviešu", "拉脱维亚语"),
	MAITHILI("Maithili", "मरातिलीName", "迈蒂利语"),
	MAORI("Maori", "Maori", "毛利语"),
	MACEDONIAN("Macedonian", "Македонски", "马其顿语"),
	MALAYALAM("malayalam", "മലമാലം", "马拉雅拉姆语"),
	MARATHI("Marathi", "मराठीName", "马拉地语"),
	MALAY("Malay", "Malay", "马来语"),
	MALTESE("Maltese", "Malti", "马耳他语"),
	BURMESE("Burmese", "ဗာရမ်", "缅甸语"),
	NEPALI("Nepali", "नेपालीName", "尼泊尔语"),
	NORWEGIAN("Norwegian", "Norge", "挪威语"),
	NYANJA("Nyanja", "potakuyan", "齐切瓦语"),
	OROMO("Oromo", "adeta", "奥罗莫语"),
	PUNJABI("Punjabi", "ਪੰਜਾਬੀName", "旁遮普语"),
	POLISH("Polish", "Polski", "波兰语"),
	PASHTO("Pashto", "پښتوName", "普什图语"),
	QUECHUA("Quechua", "Quechua", "克丘亚语"),
	ROMANIAN("Romanian", "Română", "罗马尼亚语"),
	KINYARWANDA("Kinyarwanda", "Kinyarwanda", "卢旺达语"),
	SANSKRIT("Sanskrit", "Sanskrit", "梵语"),
	SINDHI("Sindhi", "سنڌي", "信德语"),
	SINGAPORE("Singapore", "සිංගාපුර්", "僧伽罗语"),
	SLOVAK("Slovak", "Slovenská", "斯洛伐克语"),
	SLOVENE("Slovene", "slovenščina", "斯洛文尼亚语"),
	SAMOAN("Samoan", "lifiava", "萨摩亚语"),
	SHONA("Shona", "Shona", "修纳语"),
	SOMALI("Somali", "Soomaali", "索马里语"),
	ALBANIAN("albanian", "albanian", "阿尔巴尼亚语"),
	SWEDISH("Swedish", "Svenska", "瑞典语"),
	SWAHILI("Swahili", "Kiswahili", "斯瓦希里语"),
	TAMIL("Tamil", "தாமில்", "泰米尔语"),
	TELUGU("Telugu", "తెలుగుQFontDatabase", "泰卢固语"),
	TAJIK("Tajik", "ТаjikӣName", "塔吉克语"),
	TURKMEN("Turkmen", "Türkmençe", "土库曼语"),
	FILIPINO("Filipino", "Pilipino", "菲律宾语"),
	TATAR("Tatar", "Татар", "鞑靼语"),
	UKRAINIAN("Ukrainian", "УкраїнськаName", "乌克兰语"),
	URDU("Urdu", "اوردو", "乌尔都语"),
	YIDDISH("Yiddish", "ייַדיש", "意第绪语"),
	YORUBA("Yoruba", "Yoruba", "约鲁巴语"),

    //第一次百度没搜索出来的换谷歌搜索
    JAVANESE("Javanese", "basa jawa", "印尼爪哇语"),
    FRISIAN("frisian", "frysk", "弗里西语"),
    SCOTTISH_GAELIC("scottish gaelic","Gàidhlig na h-Alba","苏格兰盖尔语"),//谷歌
	EWE("ewe", "Eʋegbe", "埃维语"),
	DOGRID("dogrid", "कुकुरमुत्ता", "多格来语"),
	KURDISH_SORANI("kurdish_sorani", "کوردی سۆرانی", "库尔德语（索拉尼)"),
	GONGEN("gongen", "गोंगेन हें नांव", "贡根语"),
	BAMBARA("bambara", "Bamanankan", "班巴拉语"),
	HAITIAN_CREOLE("haitian creole", "Kreyòl ayisyen", "海地克里奥尔语"),
	MIZO("Mizo", "Mizo tawng", "米佐语"),
	SERBIAN("Serbian", "Српски", "塞尔维亚语"),
	ILOCANO("Ilocano", "Ilocano", "伊洛卡诺语"),
	ORIYA("Oriya", "ଓଡିଆ", "奥利亚语"),
    AFRIKAANS_XHOSA("Afrikaans Xhosa", "Afrikaans isiXhosa", "南非科萨语"),
	SOUTH_AFRICAN_ZULU("South African Zulu", "IsiZulu saseNingizimu Afrika", "南非祖鲁语"),
	UZBEK("Uzbek", "o'zbek", "乌兹别克语"),
	KAZAKH("Kazakh", "қазақ", "哈萨克语"),
	LINGALA("Lingala", "Lingala", "林格拉语"),
	MALAGASY("Malagasy", "Malagasy", "马尔加什语"),
	MONGOLIAN("Mongolian", "Монгол", "蒙古语"),
	MEITEI("Meitei", "ꯃꯦꯏꯇꯦꯏ꯫", "梅泰语（曼尼普尔语）"),
	SEPETI("Sepeti", "Sepeti", "塞佩蒂语"),
	SESOTHO("sesotho", "sesotho", "塞索托语"),
	SUNDANESE("Sundanese", "basa Sunda", "印尼巽他语"),
	TIGRI("Tigri", "ትግርኛ", "蒂格尼亚语"),
	UYGHUR("Uyghur", "ئۇيغۇر", "维吾尔语"),
	ZONGJIA("zongjia", "zongjia", "宗加语"),



    //    1、获取所有的小牛数据（386条）
    //    2、跟上面所有的对比，删除小牛里重复的
    //    3、去重后的小牛，在百度谷歌检索是否存在

    //	------------------------------小牛start-------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    TETUN("tetum", "tetum", "德顿语"),
    BASHKIR("bashkir", "Был беҙҙең проблема түгел.", "巴什基尔语"),
    BERBER("berber", "tamaziɣt", "柏柏尔语"),
    BISLAMA("bislama", "asaft", "比斯拉马语"),
    BRETON("breton", "breton", "布列塔尼语"),
    CHUVASH("chuvash", "шавӑш", "楚瓦什语"),
    XITSONGA("xitsonga", "xitsonga", "聪加语"),
    FAROESE("faroese","føroyskt","法罗语"),
    KIKONGO("kikongo","ngiambudi mu diambu","刚果语"),
    MONTENEGRIN("montenegrin","montenegrin","黑山语"),
    HAKHA_CHIN("hakha chin","Kutbenghthawng.","哈卡钦语"),
    KABYLE("kabyle","kabyle","卡拜尔语"),
    CRIMEAN_TATAR("crimean tatar","kriz tatar","克里米亚鞑靼语"),
    LINGALAJIA("lingala","ukkk","林加拉语"),
    ROMANI("romani","romani","罗姆语"),
    MARSHALLESE("marshallese","kotkin bob","马绍尔语"),
    MAURITIAN_CREOLE("mauritian creole","pou ki ninport kisannla kapavsanti enn koneksion ek li.","毛里求斯克里奥尔语"),
    PAPIAMENTO("papiamento","papiamento","帕皮阿门托语"),
    ESPERANTO("esperanto","Esperanto","世界语"),
    TAGALOG("tagalog","tagalog","他加禄语"),
    VENDA("venda","mitambo na zwinyanyusi","文达语"),
    WOLOF("wolof","bukki","沃洛夫语"),
    SYRIAC("syriac","ܓܙܽܘܪܝܐܳܐ","叙利亚语"),
    HILIGAYNON("hiligaynon","Indi ko ini maubra tanan.","希利盖农语"),
    ACEH("aceh","aceh","亚齐语"),
    CANTONESE("cantonese","广东话","粤语");//中文（粤语）


    //百度/谷歌---Null---start----------------------------------------
    //百度/谷歌---Null---start----------------------------------------
    //百度/谷歌---Null---start----------------------------------------
//    ACHUAR("achuar", "", "阿丘雅语"),
//    AGUARUNA("aguaruna", "", "阿瓜鲁纳语"),
//    AKAWAIO("akawaio", "", "阿卡瓦伊语"),
//    AMUZGO("amuzgo", "", "阿穆斯戈语"),
//    OJIBWA("ojibwa", "", "奥吉布瓦语"),
//    OSSETIC("ossetic", "", "奥赛梯语"),
//    AYANGAN_IFUGAO("ayangan ifugao", "", "阿雅安伊富高语"),
//    ACATECO("acateco", "", "阿卡特克语"),
//    ANTIPOLO_IFUGAO("antipolo ifugao", "", "安蒂波洛伊富高语"),
//    ACHI("achi", "", "阿奇语"),
//    AMBAI("ambai", "", "安拜语"),
//    OROKO("oroko", "", "奥罗科语"),
//    ADHOLA("adhola", "", "阿多拉语"),
//    AGNI_SANVI("agni sanvi", "", "阿格尼桑维语"),
//    ASHENINKA("asheninka", "", "阿舍宁卡语"),
//    EFIK("efik", "", "埃菲克语"),
//    ACHOLI("acholi", "", "阿乔利语"),
//    ESAN("esan", "", "埃桑语"),
//    EDO("edo", "", "埃多语"),
//    TOK_PISIN("tok pisin", "", "巴布亚皮钦语"),
//    BARASANA("barasana", "", "巴拉萨纳语"),
//    HMONG("hmong", "", "白苗文"),
//    BEMBA("bemba", "", "别姆巴语"),
//    POTAWATOMI("potawatomi", "", "波塔瓦托米语"),
//    BOKONQI("bokonqi", "", "波孔奇语"),
//    NORTHERN_MAM("northern mam", "", "北部马姆语"),
//    BARIBA("bariba", "", "巴里巴语"),
//    BOKOBARU("bokobaru", "", "博科巴鲁语"),
//    BUSA("busa", "", "布萨语"),
//    BOLA("bola", "", "波拉语"),
//    BARIAI("bariai", "", "巴里亚语"),
//    BANTOANON("bantoanon", "", "班通安隆语"),
//    BANDIAL("bandial", "", "班迪亚勒语"),
//    BAKA("baka", "", "巴卡语"),
//    BAMBAM("bambam", "", "邦邦语"),
//    BARI("bari", "", "巴里语"),
//    BUALKHAW_CHIN("bualkhaw chin", "", "布阿尔考钦语"),
//    NORTHERN_GREBO("northern grebo", "", "北部格雷博语"),
//    BASAA("basaa", "", "巴萨语"),
//    BULU("bulu", "", "布卢语"),
//    PANGASINAN("pangasinan", "", "邦阿西楠语"),
//    BAOLE("baole", "", "鲍勒语"),
//    BIAK("biak", "", "比亚克语"),
//    BATAK_KARO("batak karo", "", "巴塔克卡罗语"),
//    POHNPEIAN("pohnpeian", "", "波纳佩语"),
//    BELIZEAN_CREOLE("belizean creole", "", "伯利兹克里奥尔语"),
//    PARAGUAYAN_GUARANÍ("paraguayan guaraní", "", "巴拉圭瓜拉尼语"),
//    CHAMORRO("chamorro", "", "查莫罗语"),
//    TSWANA("tswana", "", "茨瓦纳语"),
//    CHECHEN("chechen", "", "车臣语"),
//    CHAKMA("chakma", "", "查克玛语"),
//    CHIRU("chiru", "", "茨鲁语"),
//    TSWA("tswa", "", "茨瓦语"),
//    DINKA("dinka", "", "丁卡语"),
//    DYULA("dyula", "", "迪尤拉语"),
//    DITAMMARI("ditammari", "", "迪塔马利语"),
//    DADIBI("dadibi", "", "达迪比语"),
//    TIMUGON_MURUT("timugon murut", "", "蒂穆贡-穆鲁特语"),
//    EASTERN_CAGAYAN_AGTA("eastern cagayan agta","","东部卡加延-阿格塔语"),
//    DANGME("dangme","","丹美语"),
//    DUALA("duala","","杜阿拉语"),
//    TETUN_DILI("tetun dili","","帝力德顿语"),
//    DREHU("drehu","","德鲁语"),
//    TIV("tiv","","蒂夫语"),
//    NDYUKA("ndyuka","","恩都卡语"),
//    ENXET("enxet","","恩舍特语"),
//    NZEMA("nzema","","恩泽马语"),
//    NGAJU("ngaju","","恩加朱语"),
//    NKORE("nkore","","恩科里语"),
//    NDAU("ndau","","恩道语"),
//    NDONGA("ndonga","","恩敦加语"),
//    FIJIAN("fijian","","斐济语"),
//    FALAM_CHIN("falam chin","","法兰钦语"),
//    FRAFRA("frafra","","法拉法拉语"),
//    CAPE_VERDEAN_CREOLE("cape verdean creole","","佛得角克里奥尔语"),
//    QUICHUA("quichua","","盖丘亚语"),
//    GUAJARA("guajara","","瓜哈哈拉语"),
//    GOFFA("goffa","","果发语"),
//    KASEM("kasem","","格森语"),
//    GBAYA("gbaya","","格巴亚语"),
//    GUN("gun","","龚语"),
//    CONGO_SWAHILI("congo swahili","","刚果斯瓦希里语"),
//    GUIMI("guimi","","圭米语"),
//    KAZAKH_CYRILLIC("kazakh(cyrillic)","","哈萨克语(西里尔)"),
//    HULI("huli","","胡里语"),
//    HALBI("halbi","","亥比语"),
//    HERERO("herero","","赫雷罗语"),
//    KICHE("kiche","","基切语"),
//    GALELA("galela","","加莱拉语"),
//    KIRIBATI("kiribati","","基里巴斯语"),
//    JINGPHO("jingpho","","景颇语"),
//    GA("ga","","加语"),
//    KIKUYU("kikuyu","","基库尤语"),
//    KIMBUNDU("kimbundu","","金邦杜语"),
//    GARIFUNA("garifuna","","加利富纳语"),
//    CABECAR("cabecar","","卡韦卡尔语"),
//    CAKCHIQUEL("cakchiquel","","卡克奇克尔语"),
//    QEQCHI("qeqchi","","凯克其语"),
//    CAMPA("campa","","坎帕语"),
//    COPTIC("coptic","","科普特语"),
//    CAMSA("camsa","","科奇语"),
//    QUERETARO_OTOMI("queretaro otomi","","克雷塔罗奥托米语"),
//    KURDISH_KURMANJI("kurdish(kurmanji)","","库尔德语(库尔曼奇语)"),
//    KUANUA("kuanua","","库阿努阿语"),
//    CUSCO_QUECHUA("cusco quechua","","库斯科克丘亚语"),
//    KAPINGAMARANGI("kapingamarangi","","卡平阿马朗伊语"),
//    KALMYK_OIRAT("kalmyk-oirat","","卡尔梅克卫拉特语"),
//    KELIKO("keliko","","克利科语"),
//    KAKWA("kakwa","","卡库瓦语"),
//    KAQCHIKEL("kaqchikel","","喀克其奎语"),
//    KAULONG("kaulong","","卡乌龙语"),
//    KULUNG("kulung","","库隆语"),
//    KANAR_HIGHLAND_QUICHUA("Kanar Heights Kichua","","卡纳尔高地-基丘亚语"),
//    COOK_ISLANDS_MAORI(" cook islands maori","","库克群岛毛利语"),
//    KABIYE("kabiye","","卡比耶语"),
//    KAMBA("kamba","","卡姆巴语"),
//    KAONDE("kaonde","","卡昂多语"),
//    CAMEROONIAN_PIDGIN("cameroonian pidgin","","喀麦隆皮钦语"),
//    KIRUNDI("kirundi","","隆迪语"),
//    LUKPA("lukpa","","卢克帕语"),
//    LOMWE("lomwe","","隆韦语"),
//    ROVIANA("roviana","","罗维那语"),
//    LACID("lacid","","勒期语"),
//    LINGAO("lingao","","临高语"),
//    LOZI("lozi","","罗子语"),
//    LUBA_KASAI("luba-kasai","","卢巴开赛语"),
//    LUBA_KATANGA("luba-katanga","","卢巴-加丹加语"),
//    LUNDA("lunda","","隆打语"),
//    RUUND("ruund","","卢乌德语"),
//    LUVALE("luvale","","卢瓦来语"),
//    MANX("manx","","马恩岛语"),
//    MARI("mari","","马里语"),
//    MAM("mam","","马姆语"),
//    MONGOLIAN_CYRILLIC("mongolian(cyrillic)","","蒙古语(西里尔)"),
//    MOTU("motu","","摩图语"),
//    MARANAO("maranao","","马拉瑙语"),
//    MAALE("maale","","马勒语"),
//    MADURESE("madurese","","马都拉语"),
//    MOSSI("mossi","","莫西语"),
//    MUTHUVAN("muthuvan","","穆图凡语"),
//    UMBUNDU("umbundu","","姆班杜语"),
//    MAPUCHE("mapuche","","马普切语"),
//    NAHUATL("nahuatl","","纳瓦特尔语"),
//    SOUTH_AZERBAIJANI("south azerbaijani","","南阿塞拜疆语"),
//    SOUTH_BOLIVIAN_QUECHUA("south bolivian quechua","","南玻利维亚克丘亚语"),
//    LUN_BAWANG("lun bawang","","弄巴湾语"),
//    NIGERIAN_FULFULDE("nigerian fulfulde","","尼日利亚富拉语"),
//    NUMANGGANG("numanggang","","努曼干语"),
//    NATENI("nateni","","纳特尼语"),
//    NYAKYUSA("nyakyusa","","尼亚库萨语"),
//    NIUEAN("niuean","","纽埃语"),
//    NIAS("nias","","尼亚斯语"),
//    NYEMBA("nyemba","","涅姆巴语"),
//    NYUNGWE("nyungwe","","尼荣圭语"),
//    NAVAJO("navajo","","纳瓦霍语"),
//    NYANEKA("nyaneka","","尼亚内卡语"),
//    NIGERIAN_PIDGIN("nigerian pidgin","","尼日利亚皮钦语"),
//    PAITE("paite","","派特语"),
//    PELE_ATA("pele-ata","","佩勒-阿塔语"),
//    PIJIN("pijin","","皮京语"),
//    CHEROKEE("cherokee","","切诺基语"),
//    CHINANTEC("chinantec","","奇南特克语"),
//    ZIMANE("zimane","","齐马内语"),
//    CHOKWE("chokwe","","乔奎语"),
//    CHOPI("chopi","","乔皮语"),
//    CHUUKESE("chuukese","","丘克语"),
//    SEYCHELLES_CREOLE("seychelles creole","","塞舌尔克里奥尔语"),
//    SANGO("sango","","桑戈语"),
//    HILL_MARI("hill mari","","山地马里语"),
//    SHUAR("shuar","","舒阿尔语"),
//    SUAU("suau","","苏奥语"),
//    SAMBERIGI("samberigi","","桑贝里吉语"),
//    SABAOT("sabaot","","萨鲍特语"),
//    SAN_MATEO_DEL_MAR_HUAVE("san mateo del mar huave","","圣马特奥德马尔-瓦维语"),
//    KISIHA("kisiha","","斯哈语"),
//    SARAMACCAN("saramaccan","","萨拉马坎语"),
//    SANGIR("sangir","","桑格语"),
//    SENA("sena","","塞纳语"),
//    SAN_SALVADOR_KONGO("san salvador kongo","","圣萨尔瓦多刚果语"),
//    SONGE("songe","","松格语"),
//    TZOTZIL("tzotzil","","索西语"),
//    TAHITIAN("tahitian","","塔希提语"),
//    TONGAN("tongan","","汤加语"),
//    TIGRE("tigre","","提格雷语"),
//    TAMAJAQ("tamajaq","","图阿雷格语"),
//    TAMPULMA("tampulma","","坦普尔马语"),
//    TEDIM_CHIN("tedim chin","","特丁钦语"),
//    TUVAN("tuvan","","图瓦语"),
//    TUMA_IRUMU("tuma-irumu","","图马伊鲁穆语"),
//    TENNET("tennet","","腾内特语"),
//    TUNGAG("tungag","","通加格语"),
//    TESO("teso","","特索语"),
//    TUVALUAN("tuvaluan","","图瓦卢语"),
//    TETELA("tetela","","特特拉语"),
//    TUMBUKA("tumbuka","","通布卡语"),
//    TOJOLABAL("tojolabal","","托霍拉瓦尔语"),
//    TOORO("tooro","","土柔语"),
//    WOLAYTTA("wolaytta","","瓦拉莫语"),
//    WARAY("waray","","瓦瑞语"),
//    UDMURT("udmurt","","乌德穆尔特语"),
//    UMA("uma","","乌玛语"),
//    USPANTECO("uspanteco","","乌斯潘坦语"),
//    WALI("wali","","瓦利语"),
//    WA("wa","","佤语"),
//    WASKIA("waskia","","瓦吉语"),
//    WARIS("waris","","瓦里斯语"),
//    VUNJO("vunjo","","文约语"),
//    WALLISIAN("wallisian","","瓦利斯语"),
//    URHOBO("urhobo","","乌尔霍博语"),
//    HUAUTLA_MAZATEC("huautla mazatec","","瓦乌特拉马萨特克语"),
//    WAYUU("wayuu","","瓦尤语"),
//    TACHELHIT("tachelhit","","希尔哈语"),
//    HAWAIIAN_CREOLE_ENGLISH("hawaiian creole english","","夏威夷克里奥尔英语"),
//    HIRI_MOTU("hiri motu","","希里莫图语"),
//    WESTERN_LAWA("western lawa","","西部拉威语"),
//    SIDAMO("sidamo","","锡达莫语"),
//    WESTERN_BUKIDNON_MANOBO("western bukidnon manobo","","西布基农马诺布语"),
//    SHIPIBO("shipibo","","西皮沃语"),
//    SIROI("siroi","","西罗伊语"),
//    WESTERN_BOLIVIAN_GUARANI("western bolivian guarani","","西部玻利维亚瓜拉尼语"),
//    WESTERN_KAYAH("western kayah","","西部克耶语"),
//    JAKALTEKO("jakalteko","","雅加达语"),
//    YUCATEC_MAYA("yucatec maya","","尤卡坦玛雅语"),
//    IKA("ika","","伊卡语"),
//    IZI("izi","","伊兹语"),
//    YOM("yom","","约姆语"),
//    YABEM("yabem","","雅比姆语"),
//    YONGKOM("yongkom","","永贡语"),
//    YONGBEI_ZHUANG("yongbei zhuang","","邕北壮语"),
//    YIPMA("yipma","","伊普马语"),
//    ISOKO("isoko","","伊索科语"),
//    IBAN("iban","","伊班语"),
//    IBANAG("ibanag","","伊巴纳格语"),
//    YAPESE("yapese","","雅浦语"),
//    TIBETAN("tibetan","","藏语"),
//    ZARMA("zarma","","哲尔马语"),
//    DZONGKHA("dzongkha","","宗喀语"),
//    CENTRAL_IFUGAO("central ifugao","","中部伊富高语"),
//    ZOTUNG_CHIN("zotung chin","","佐通钦语"),
//    CENTRAL_DUSUN("central dusun","","中部杜顺语"),
//    CENTRAL_BIKOL("central bikol","","中比科尔语"),
//    TZELTAL("tzeltal","","泽塔尔语"),
//    ZANDE("zande","","赞德语");

    //百度/谷歌---Null---end----------------------------------------
    //百度/谷歌---Null---end----------------------------------------
    //百度/谷歌---Null---end----------------------------------------


    //	---------------------------------小牛end-------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------
    //	----------------------------------------------------------------------------------

	/*
	 
	 	待补充
	 	内容参考 cn.zvo.translate.service.google.ServiceInterfaceImplement
	 	语种(语种Key)
	  
	 */
	
	
	
	
	
	
	
	
	public final String id;		//语言名，如 english、chinese_simplified、chinese_traditional
	public final String name;		//文字说明，对应语种的文字说明，如 english、简体中文、繁体中文、한어
	public final String chinese_name;	//中文的说明，以中文方式的语种说明
	
	private LanguageEnum(String id, String name, String chinese_name) { 
		this.name = name;
		this.id = id;
		this.chinese_name = chinese_name;
	}
	
	public static void main(String[] args) {

		LanguageEnum[] languages = LanguageEnum.values();
        for (int i = 0; i < languages.length; i++) {
        	System.out.println(languages[i].id +" - "+languages[i].name);
        }
		
	}
}
