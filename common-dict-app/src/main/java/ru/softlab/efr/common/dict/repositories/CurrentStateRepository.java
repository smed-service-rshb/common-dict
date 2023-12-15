package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.CurrentStateEntity;
import ru.softlab.efr.common.dict.model.enums.OperationTypeEnum;

import java.util.List;

/**
 * Репозиторий для работы с сущностью статусов выполнения операций
 *
 * @author olshansky
 * @since 20.09.2018.
 */
public interface CurrentStateRepository extends JpaRepository<CurrentStateEntity, Long> {

    CurrentStateEntity findTopByNameOrderByModifiedDesc(String name);
    CurrentStateEntity findTopByNameAndIsFinishedOrderByIdDesc(String name, Boolean isFinished);
    CurrentStateEntity findTopByNameAndStateCodeOrderByCreatedDesc(String name, String stateCode);
    Boolean existsByNameAndVersion(String name, long version);
    CurrentStateEntity findFirstById(Long id);
}
