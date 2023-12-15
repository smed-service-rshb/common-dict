package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;
import ru.softlab.efr.common.dict.repositories.ExternalSystemRepository;

import javax.annotation.Resource;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Сервися для работы с записями о внешних системах
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
@Service
public class ExternalSystemService {
    @Resource
    private ExternalSystemRepository externalSystemRepository;

    /**
     * Найти запись о внешней системе
     *
     * @param id идентификатор внешней системы
     * @return хранимая сущность записи
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public ExternalSystemEntity findById(long id) {
        ExternalSystemEntity externalSystemEntity = externalSystemRepository.findOne(id);
        if (externalSystemEntity == null) {
            throw new EntityNotFoundException();
        }
        return externalSystemEntity;
    }

    /**
     * Найти запись о внешней системе
     *
     * @param systemId идентификатор внешней системы
     * @return хранимая сущность записи
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public ExternalSystemEntity findBySystemId(String systemId) {
        ExternalSystemEntity externalSystemEntity = externalSystemRepository.findBySystemId(systemId);
        if (externalSystemEntity == null) {
            throw new EntityNotFoundException();
        }
        return externalSystemEntity;
    }

    /**
     * Найти все записи о внешних системах
     *
     * @param pageable количество страниц
     * @return список внешних систем
     */
    @Transactional
    public Page<ExternalSystemEntity> findAll(Pageable pageable) {
        return externalSystemRepository.findAll(pageable);
    }

    @Transactional(rollbackFor = EntityExistsException.class)
    public ExternalSystemEntity create(ExternalSystemEntity externalSystemEntity) {
        if (externalSystemEntity.getId() != null && externalSystemRepository.findOne(externalSystemEntity.getId()) != null) {
            throw new EntityExistsException();
        }
        return externalSystemRepository.save(externalSystemEntity);
    }

    /**
     * Обновить запись о внешней системе
     *
     * @param externalSystemEntity хранимая сущность внешней системы
     * @return хранимая сущность внешней системы
     */
    @Transactional(rollbackFor = {EntityNotFoundException.class})
    public ExternalSystemEntity update(ExternalSystemEntity externalSystemEntity) {
        ExternalSystemEntity foundExternalSystemEntity = externalSystemRepository
                .findOne(externalSystemEntity.getId());
        if (foundExternalSystemEntity == null) {
            throw new EntityNotFoundException();
        }
        return externalSystemRepository.save(externalSystemEntity);
    }

    /**
     * Удалить запись о внешней системе
     *
     * @param id идентификатор внешней системы
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public void delete(Long id) {
        ExternalSystemEntity externalSystemEntity = externalSystemRepository.findOne(id);
        if (externalSystemEntity == null) {
            throw new EntityNotFoundException();
        }
        externalSystemRepository.delete(externalSystemEntity.getId());
    }
}
