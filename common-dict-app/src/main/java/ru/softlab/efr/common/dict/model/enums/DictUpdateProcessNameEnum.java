package ru.softlab.efr.common.dict.model.enums;

/**
 * Наименование процесса обновления справочников
 *
 * @author olshansky
 * @since 04.10.2018.
 */
public enum DictUpdateProcessNameEnum {

    TERRORIST("TerroristUpdate"),
    INVALID_IDENTITY_DOC("InvalidIdentityDocUpdate"),
    BLOCKAGE("BlockagesUpdate");

    private String value;

    DictUpdateProcessNameEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DictUpdateProcessNameEnum fromValue(String text) {
        for (DictUpdateProcessNameEnum b : DictUpdateProcessNameEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
