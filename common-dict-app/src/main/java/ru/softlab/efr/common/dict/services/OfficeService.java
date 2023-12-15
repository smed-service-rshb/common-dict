package ru.softlab.efr.common.dict.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.OfficeEntity;
import ru.softlab.efr.common.dict.repositories.OfficeRepository;

import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с записями об офисах
 *
 * @author Plaksiy
 * @since 20.09.2017
 */
@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    /**
     * Найти запись об офисе
     *
     * @param id идентификатор офиса
     * @return хранимая сущность офиса
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public OfficeEntity findById(long id) {
        OfficeEntity officeEntity = officeRepository.findOne(id);
        if (officeEntity == null) {
            throw new EntityNotFoundException();
        }
        return officeEntity;
    }

    /**
     * Найти все записи об офисах
     *
     * @param pageable количество страниц
     * @return список офисов
     */
    @Transactional
    public Page<OfficeEntity> findAll(Pageable pageable) {
        return officeRepository.findAll(pageable);
    }
}
