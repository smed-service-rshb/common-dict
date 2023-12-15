package ru.softlab.efr.common.dict.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.softlab.efr.common.dict.model.BranchEntity;
import ru.softlab.efr.common.dict.repositories.BranchRepository;

import javax.persistence.EntityNotFoundException;

/**
 * Сервис для работы с записями подразделений
 *
 * @author Plaksiy
 * @since 19.09.2017
 */
@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    /**
     * Найти подразделение по идентификатору
     *
     * @param id идентификатор подразделения
     * @return хранимая сущность подразделения
     */
    @Transactional(rollbackFor = EntityNotFoundException.class)
    public BranchEntity findById(long id) {
        BranchEntity branchEntity = branchRepository.findOne(id);
        if (branchEntity == null) {
            throw new EntityNotFoundException();
        }
        return branchEntity;
    }

    /**
     * Найти все подразделения
     *
     * @param pageable количество страниц
     * @return список подразделений
     */
    @Transactional
    public Page<BranchEntity> findAll(Pageable pageable) {
        return branchRepository.findAll(pageable);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class)
    public BranchEntity findByCode(String code) {
        BranchEntity branchEntity = branchRepository.findByCode(code);
        if (branchEntity == null) {
            throw new EntityNotFoundException();
        }
        return branchEntity;
    }
}
