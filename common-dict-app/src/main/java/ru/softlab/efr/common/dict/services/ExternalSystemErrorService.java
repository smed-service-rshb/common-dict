package ru.softlab.efr.common.dict.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;
import ru.softlab.efr.common.dict.repositories.ExternalSystemErrorRepository;

import javax.annotation.Resource;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Сервис работы с записями об ошибках внешних систем
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
@Service
public class ExternalSystemErrorService {

    @Resource
    private ExternalSystemErrorRepository externalSystemErrorRepository;

    /**
     * Найти запись ошибки внешней системы по идентификатору
     *
     * @param id идентифкатор внешней системы
     * @return запись об ошибке внешней системы
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public ExternalSystemErrorEntity findById(long id) {
        ExternalSystemErrorEntity externalSystemErrorEntity = externalSystemErrorRepository.findOne(id);
        if (externalSystemErrorEntity == null) {
            throw new EntityNotFoundException();
        }
        return externalSystemErrorEntity;
    }

    /**
     * Найти все записи об ощибках
     *
     * @param pageable количество страниц
     * @return список ошибок
     */
    @Transactional
    public Page<ExternalSystemErrorEntity> findAll(Pageable pageable) {
        return externalSystemErrorRepository.findAll(pageable);
    }

    /**
     * Создать запись об ошибке
     *
     * @param externalSystemErrorEntity хранимая сущность ошибки
     * @return хранимая сущность оишбки
     */
    @Transactional(rollbackFor = EntityExistsException.class)
    public ExternalSystemErrorEntity create(ExternalSystemErrorEntity externalSystemErrorEntity) {
        if (externalSystemErrorEntity.getId() != null && externalSystemErrorRepository.findOne(externalSystemErrorEntity.getId()) != null) {
            throw new EntityExistsException();
        }
        return externalSystemErrorRepository.save(externalSystemErrorEntity);
    }

    /**
     * Обновить заипись об ошибке
     *
     * @param externalSystemErrorEntity хранимая сущность ошибки
     * @return хранимая сущность ошибки
     */
    @Transactional(rollbackFor = {EntityNotFoundException.class})
    public ExternalSystemErrorEntity update(ExternalSystemErrorEntity externalSystemErrorEntity) {
        ExternalSystemErrorEntity foundExternalSystemErrorEntity = externalSystemErrorRepository
                .findOne(externalSystemErrorEntity.getId());
        if (foundExternalSystemErrorEntity == null) {
            throw new EntityNotFoundException();
        }
        return externalSystemErrorRepository.save(externalSystemErrorEntity);
    }

    /**
     * Удалить запись об ошибке
     *
     * @param id идентификатор ошибки
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public void delete(Long id) {
        ExternalSystemErrorEntity externalSystemErrorEntity = externalSystemErrorRepository.findOne(id);
        if (externalSystemErrorEntity == null) {
            throw new EntityNotFoundException();
        }
        externalSystemErrorRepository.delete(externalSystemErrorEntity.getId());
    }
}
