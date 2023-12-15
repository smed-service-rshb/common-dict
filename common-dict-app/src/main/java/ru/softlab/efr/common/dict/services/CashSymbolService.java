package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.CashSymbolEntity;
import ru.softlab.efr.common.dict.repositories.CashSymbolRepository;

import javax.annotation.Resource;
import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с кассовыми символами
 *
 * @author bobkov
 * @since 30.07.2018
 */
@Service
public class CashSymbolService {
    @Resource
    private CashSymbolRepository cashSymbolRepository;

    /**
     * Возвращает запись о кассовом символе
     *
     * @param id идентификатор кассового символа
     * @return запись о кассовом символе
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public CashSymbolEntity findById(long id) {
        CashSymbolEntity cashSymbolEntity = cashSymbolRepository.findOne(id);
        if (cashSymbolEntity == null) {
            throw new EntityNotFoundException();
        }
        return cashSymbolEntity;
    }

    /**
     * Найти все записи о кассовых символах
     *
     * @param pageable флаг постраничности
     * @return список кассовых символов
     */
    @Transactional
    public Page<CashSymbolEntity> findAll(Pageable pageable) {
        return cashSymbolRepository.findAll(pageable);
    }

    /**
     * Возвращает запись о кассовом символе по коду
     *
     * @param code код кассового символа
     * @return запись о кассовом символе
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public CashSymbolEntity findByCode(Long code) {
        CashSymbolEntity cashSymbolEntity = cashSymbolRepository.findByCode(code);
        if (cashSymbolEntity == null) {
            throw new EntityNotFoundException();
        }
        return cashSymbolEntity;
    }
}
