package ru.softlab.efr.common.dict.model.enums;

/**
 * Способ расчета курса валюты
 */
public enum CurrencyRateCalculationType {

    /**
     * Курс Организации равен курсу ЦБ РФ
     */
    CB_RF_RATE,
    /**
     * Курс задается Администратором
     */
    SET_BY_ADMINISTRATOR,
    /**
     * Курс ЦБ РФ с процентом
     */
    CB_RF_WITH_PERCENT

}
