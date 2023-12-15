package ru.softlab.efr.common.dict.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;
import ru.softlab.efr.common.dict.repositories.DivisionCodeRepository;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с записями о подразделениях
 *
 * @author basharin
 * @since 07.12.2017
 */
@Service
public class DivisionCodeService {
    @Autowired
    private DivisionCodeRepository divisionCodeRepository;

    /**
     * Найти подразделения по идентифкатору
     *
     * @param id идентификатор подразделения
     * @return хранимая сущность подразделения
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public DivisionCodeEntity findById(long id) {
        DivisionCodeEntity divisionCodeEntity = divisionCodeRepository.findOne(id);
        if (divisionCodeEntity == null) {
            throw new EntityNotFoundException();
        }
        return divisionCodeEntity;
    }

    /**
     * Найти все подразделения
     *
     * @param pageable количество страниц
     * @return список подразделений
     */
    @Transactional
    public Page<DivisionCodeEntity> findAll(Pageable pageable) {
        return divisionCodeRepository.findAll(pageable);
    }

    /**
     * Создать запись о подразделении
     *
     * @param divisionCodeEntity хранимая сущность подразделения
     * @return хранимая сущность подразделения
     */
    public DivisionCodeEntity create(DivisionCodeEntity divisionCodeEntity) {
        if (divisionCodeEntity.getId() != null && divisionCodeRepository.findOne(divisionCodeEntity.getId()) != null) {
            throw new EntityExistsException();
        }
        return divisionCodeRepository.save(divisionCodeEntity);
    }

    /**
     * Возвращает подразделение по коду
     *
     * @param code код подразделения
     * @return хранимая сущность подразделения
     */
    public DivisionCodeEntity get(String code) {
        return divisionCodeRepository.findByCode(code);
    }
}
