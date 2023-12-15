package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.BankEntity;
import ru.softlab.efr.common.dict.repositories.BankRepository;

import javax.annotation.Resource;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Сервис для работы с записями банков
 *
 * @author levin
 * @since 05.04.2017
 */
@Service
public class BankService {
    @Resource
    private BankRepository bankRepository;

    /**
     * Возвращает запись о банке
     *
     * @param id идентификатор банка
     * @return запись о банке
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public BankEntity findById(long id) {
        BankEntity bankEntity = bankRepository.findOne(id);
        if (bankEntity == null || bankEntity.isDeleted()) {
            throw new EntityNotFoundException();
        }
        return bankEntity;
    }

    /**
     * Найти все записи о банках
     *
     * @param pageable флаг постраничности
     * @return список банков
     */
    @Transactional
    private Page<BankEntity> findAll(Pageable pageable) {
        return bankRepository.findByDeleted(false, pageable);
    }

    /**
     * Обновить запись о банке
     *
     * @param bankEntity хранимая сущность банка
     * @return хранимая сущность банка
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public BankEntity update(BankEntity bankEntity) {
        BankEntity updatedBank = bankRepository.findOne(bankEntity.getId());
        if (updatedBank == null) {
            throw new EntityNotFoundException();
        }
        return bankRepository.save(bankEntity);
    }

    /**
     * Создать запись о банке
     *
     * @param bankEntity хранимая сущность банка
     * @return хранимая сущность банка
     */
    @Transactional(rollbackFor = EntityExistsException.class)
    public BankEntity create(BankEntity bankEntity) {
        if (bankEntity.getId() != null && bankRepository.findOne(bankEntity.getId()) != null) {
            throw new EntityExistsException();
        }
        return bankRepository.save(bankEntity);
    }

    /**
     * Найти банк по БИК
     *
     * @param BIC БИК банка
     * @return хранимая сущность банка
     */
    @Transactional
    public BankEntity findByBIC(String BIC) {
        return bankRepository.findByBic(BIC);
    }

    /**
     * Возвращает список активных банков
     *
     * @return список банков
     */
    @Transactional
    public List<BankEntity> findActiveBanks() {
        return bankRepository.findByDeleted(false);
    }

    /**
     * Найти банки по БИК и названию
     *
     * @param pageable количество страниц
     * @param bic      БИК банка
     * @param name     название банка
     * @return спсико банков
     */
    @Transactional
    public Page<BankEntity> findBanks(Pageable pageable, String bic, String name) {
        if ((bic == null) && (name == null)) {
            return findAll(pageable);
        } else {
            return bankRepository.findByBicIgnoreCaseContainingAndNameIgnoreCaseContainingAndDeleted(bic == null ? "" : bic, name == null ? "" : name, false, pageable);
        }
    }

}
