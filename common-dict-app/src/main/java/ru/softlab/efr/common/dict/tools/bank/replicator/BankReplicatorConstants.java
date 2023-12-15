package ru.softlab.efr.common.dict.tools.bank.replicator;

/**
 * Константы репликации банков
 *
 * @author egorov
 * @since 24.04.2017.
 */
public class BankReplicatorConstants {

    //названия полей в *.dbf файле банков
    public static final String BIC_FIELD_NAME = "NEWNUM";
    public static final String BIC_RCC_FIELD_NAME = "RKC";
    public static final String COR_ACC_FIELD_NAME = "KSNP";
    public static final String NAME_FIELD_NAME = "NAMEP";
    public static final String SHORT_NAME_FIELD_NAME = "NAMEN";
    public static final String IND_FIELD_NAME = "IND";
    public static final String RGN_FIELD_NAME = "RGN";
    public static final String TNP_FIELD_NAME = "TNP";
    public static final String NNP_FIELD_NAME = "NNP";
    public static final String ADR_FIELD_NAME = "ADR";
    public static final String STATUS_FIELD_NAME = "REAL";
    public static final String DATE_FIELD_NAME = "DATE_CH";

    //статусы активных банков
    public static final String ACTIVE_STATUS_BANK_1 = "ИНФО";
    public static final String ACTIVE_STATUS_BANK_2 = "ПРИС";

    //названия полей в *.dbf файле типов населенных пунктов
    public static final String TNP_VALUE_FIELD_NAME = "SHORTNAME";
    public static final String TNP_KEY_FIELD_NAME = "TNP";

    //названия полей в *.dbf файле регионов
    public static final String REG_VALUE_FIELD_NAME = "NAME";
    public static final String REG_KEY_FIELD_NAME = "RGN";

    public static final String BANK_DICT_DIR_PATH = "BANK_DICT_DIR_PATH";//код настройки директории с файлами
    public static final String DICTIONARIES_ENCODING = "Cp866";//кодировка
    public static final String BNKSEEK_FILE = "bnkseek.dbf";//банки
    public static final String TNP_FILE = "tnp.dbf";//типы населенных пунктов
    public static final String REG_FILE = "reg.dbf"; //города и области

    public static final String CODE_COUNTRY_RUSSIA = "RUS";

    public static final String FILE_NOT_FOUND_MESSAGE = "Файл %s не найден";
    public static final String ERROR_FILE_READ_MESSAGE = "Ошибка чтения файла %s";
    public static final String FIELD_NOT_FOUND_MESSAGE = "Поле %s не найдено в файле %s";
    public static final String SETTING_NOT_FOUND = "Настройка %s не найдена";

}
