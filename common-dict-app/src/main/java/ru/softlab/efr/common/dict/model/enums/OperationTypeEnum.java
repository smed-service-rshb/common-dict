package ru.softlab.efr.common.dict.model.enums;

/**
 * Типы операций сохранённых в таблице current_state
 *
 * @author olshansky
 * @since 22.01.2019
 */
public enum OperationTypeEnum {

    UPDATE("Обновление справочника"),
    CHECK("Проверка клиентов по справочнику"),
    FINISHED("Процесс проверки завершён");

    private String value;

    OperationTypeEnum(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static OperationTypeEnum fromValue(String text) {
        for (OperationTypeEnum b : OperationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}