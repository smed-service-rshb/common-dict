package ru.softlab.efr.common.dict.builder.bank;

import org.apache.commons.lang.BooleanUtils;
import ru.softlab.efr.common.dict.exchange.model.Bank;
import ru.softlab.efr.common.dict.model.BankEntity;

/**
 * Класс для построения хранимой сущности данных о банке
 *
 * @author egorov
 * @since 02.05.2017.
 */
public class BankEntityBuilder {

    /**
     * Построение данных сущности BankEntity
     *
     * @param bank данные о банке
     * @return сущность BankEntity
     */
    public static BankEntity buildBank(Bank bank) {
        BankEntity bankEntity = new BankEntity();
        bankEntity.setId(bank.getId());
        bankEntity.setBic(bank.getBic());
        bankEntity.setName(bank.getName());
        bankEntity.setShortName(bank.getShortName());
        bankEntity.setCorrAccount(bank.getCorrAccount());
        bankEntity.setDescription(bank.getDescription());
        bankEntity.setSwift(bank.getSwift());
        bankEntity.setAddress(bank.getAddress());
        bankEntity.setResident(BooleanUtils.toBoolean(bank.isResident()));
        bankEntity.setDeleted(BooleanUtils.toBoolean(bank.isDeleted()));
        return bankEntity;
    }
}
