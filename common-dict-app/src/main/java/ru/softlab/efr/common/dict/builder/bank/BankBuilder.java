package ru.softlab.efr.common.dict.builder.bank;

import org.springframework.util.StringUtils;
import ru.softlab.efr.common.dict.exchange.model.Bank;
import ru.softlab.efr.common.dict.model.BankEntity;

/**
 * Класс для построения данных о банке
 *
 * @author egorov
 * @since 02.05.2017.
 */
public class BankBuilder {

    /**
     * Построение данных о банке
     *
     * @param bankEntity хранимые данные о банке
     * @return данные о банке
     */
    public static Bank buildBank(BankEntity bankEntity) {
        Bank bank = new Bank();
        bank.setId(bankEntity.getId());
        bank.setBic(bankEntity.getBic());
        bank.setName(bankEntity.getName());
        bank.setShortName(bankEntity.getShortName());
        bank.setCorrAccount(bankEntity.getCorrAccount());
        bank.setDescription(bankEntity.getDescription());
        bank.setSwift(bankEntity.getSwift());
        bank.setAddress(bankEntity.getAddress());
        bank.setChangedByHand(!StringUtils.isEmpty(bankEntity.isChangedByHand()));
        bank.setResident(bankEntity.isResident());
        bank.setDeleted(bankEntity.isDeleted());
        return bank;
    }
}
