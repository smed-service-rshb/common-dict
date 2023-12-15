package ru.softlab.efr.common.dict.builder.cashsymbol;

import ru.softlab.efr.common.dict.exchange.model.CashSymbol;
import ru.softlab.efr.common.dict.model.CashSymbolEntity;

/**
 * Класс для построения данных о кассовом символе
 *
 * @author bobkov
 * @since 30.07.2018.
 */
public class CashSymbolBuilder {

    /**
     * Построение данных о кассовом символе
     *
     * @param cashSymbolEntity хранимые данные о кассовом символе
     * @return данные о банке
     */
    public static CashSymbol buildCashSymbol(CashSymbolEntity cashSymbolEntity) {
        CashSymbol cashSymbol = new CashSymbol();
        cashSymbol.setId(cashSymbolEntity.getId());
        cashSymbol.setCode(cashSymbolEntity.getCode());
        cashSymbol.setName(cashSymbolEntity.getName());
        cashSymbol.setOperationType(cashSymbolEntity.getOperationType());
        cashSymbol.setPurposeOfPayment(cashSymbolEntity.getPurposeOfPayment());
        return cashSymbol;
    }
}