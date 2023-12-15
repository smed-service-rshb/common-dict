package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.repositories.CurrencyRepository;

import javax.annotation.Resource;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с записями о валютах
 *
 * @author Plaksiy
 * @since 30.08.2017
 */
@Service
public class CurrencyService {
    @Resource
    private CurrencyRepository currencyRepository;

    /**
     * Найти валюту по идентифкатору
     *
     * @param id идентификатор валюты
     * @return хранимая сущность валюты
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public CurrencyEntity findById(long id) {
        CurrencyEntity currencyEntity = currencyRepository.findOne(id);
        if (currencyEntity == null) {
            throw new EntityNotFoundException();
        }
        return currencyEntity;
    }

    /**
     * Получить сущность валюты по строковому идентификатору
     *
     * @param literalIsoCode строковой ISO код валюты
     * @return сущность валюты
     */
    @Transactional(readOnly = true)
    public CurrencyEntity findByIso(String literalIsoCode) {
        return currencyRepository.findByLiteralISO(literalIsoCode);
    }

    /**
     * Найти все валюты
     *
     * @param pageable количество страниц
     * @return список хранимых сущностей валют
     */
    @Transactional
    public Page<CurrencyEntity> findAll(Pageable pageable) {
        return currencyRepository.findAll(pageable);
    }

    /**
     * Создать запись о валюте
     *
     * @param currencyEntity хранимая сущность валюты
     * @return хранимая сущность валюты
     */
    @Transactional(rollbackFor = EntityExistsException.class)
    public CurrencyEntity create(CurrencyEntity currencyEntity) {
        if (currencyEntity.getId() != null && currencyRepository.findOne(currencyEntity.getId()) != null) {
            throw new EntityExistsException();
        }
        CurrencyEntity foundCurrencyByDigitalISO = currencyRepository
                .findByDigitalISO(currencyEntity.getDigitalISO());
        CurrencyEntity foundCurrencyByLiteralISO = currencyRepository
                .findByLiteralISO(currencyEntity.getLiteralISO());
        if (foundCurrencyByDigitalISO != null || foundCurrencyByLiteralISO != null) {
            throw new EntityExistsException("Валюта с введенным ISO кодом уже существует");
        }
        return currencyRepository.save(currencyEntity);
    }

    /**
     * Обновить запись о валюте
     *
     * @param currencyEntity хранимая сущность валюты
     * @return хранимая сущность валюты
     */
    @Transactional(rollbackFor = {EntityNotFoundException.class, EntityExistsException.class})
    public CurrencyEntity update(CurrencyEntity currencyEntity) {
        CurrencyEntity foundCurrencyEntity = currencyRepository
                .findOne(currencyEntity.getId());
        CurrencyEntity foundCurrencyByDigitalISO = currencyRepository
                .findByDigitalISO(currencyEntity.getDigitalISO());
        CurrencyEntity foundCurrencyByLiteralISO = currencyRepository
                .findByLiteralISO(currencyEntity.getLiteralISO());
        if (foundCurrencyEntity == null) {
            throw new EntityNotFoundException();
        }

        if (((foundCurrencyByDigitalISO != null) && (!foundCurrencyByDigitalISO.getId().equals(currencyEntity.getId())))
                || (((foundCurrencyByLiteralISO != null) && (!foundCurrencyByLiteralISO.getId().equals(currencyEntity.getId()))))) {
            throw new EntityExistsException("Валюта с введенным ISO кодом уже существует");
        }

        return currencyRepository.save(currencyEntity);
    }

    /**
     * Удалить запись о валюте
     *
     * @param id идентифкатор валюты
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public void delete(Long id) {
        CurrencyEntity currencyEntity = currencyRepository.findOne(id);
        if (currencyEntity == null) {
            throw new EntityNotFoundException();
        }
        currencyRepository.delete(currencyEntity.getId());
    }
}
