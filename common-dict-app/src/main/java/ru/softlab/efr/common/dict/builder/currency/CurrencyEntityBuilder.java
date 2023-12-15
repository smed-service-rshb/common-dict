package ru.softlab.efr.common.dict.builder.currency;

import ru.softlab.efr.common.dict.exchange.model.Currency;
import ru.softlab.efr.common.dict.model.CurrencyEntity;

/**
 * Класс для построения хранимой сущности данных о валюте
 *
 * @author Plaksiy
 * @since 01.09.2017
 */
public class CurrencyEntityBuilder {

    /**
     * Построение хранимой сущности CurrencyEntity(данные о валюте)
     *
     * @param currency данные о валюте
     * @return хранимая сущность CurrencyEntity(данные о валюте)
     */
    public static CurrencyEntity buildCurrency(Currency currency) {
        CurrencyEntity currencyEntity = new CurrencyEntity();
        currencyEntity.setId(currency.getId());
        currencyEntity.setLiteralISO(currency.getLiteralISO());
        currencyEntity.setDigitalISO(currency.getDigitalISO());
        currencyEntity.setCurrencyName(currency.getCurrencyName());
        currencyEntity.setFullCurrencyName(currency.getFullCurrencyName());
        currencyEntity.setCountryHolder(currency.getCountryHolder());
        return currencyEntity;
    }
}
