package ru.softlab.efr.common.dict.builder.currency;

import ru.softlab.efr.common.dict.exchange.model.Currency;
import ru.softlab.efr.common.dict.model.CurrencyEntity;

/**
 * Класс для построения данных о валюте
 *
 * @author Plaksiy
 * @since 01.09.2017
 */
public class CurrencyBuilder {

    /**
     * Построение данных о валюте
     *
     * @param currencyEntity хранимая сущность CurrencyEntity
     * @return данные о валюте
     */
    public static Currency buildCurrency(CurrencyEntity currencyEntity) {
        Currency currency = new Currency();
        currency.setId(currencyEntity.getId());
        currency.setLiteralISO(currencyEntity.getLiteralISO());
        currency.setDigitalISO(currencyEntity.getDigitalISO());
        currency.setCurrencyName(currencyEntity.getCurrencyName());
        currency.setFullCurrencyName(currencyEntity.getFullCurrencyName());
        currency.setCountryHolder(currencyEntity.getCountryHolder());
        return currency;
    }
}
