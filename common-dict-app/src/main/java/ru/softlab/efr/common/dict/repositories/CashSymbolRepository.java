package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.CashSymbolEntity;

/**
 * Репозиторий для работы с кассовыми символами
 *
 * @author bobkov
 * @since 30.07.2018
 */
public interface CashSymbolRepository extends JpaRepository<CashSymbolEntity, Long> {
    /**
     * Найти кассовый символ по коду
     *
     * @param code код кассового символа
     * @return хранимая сущность кассового символа
     */
    CashSymbolEntity findByCode(Long code);
}
