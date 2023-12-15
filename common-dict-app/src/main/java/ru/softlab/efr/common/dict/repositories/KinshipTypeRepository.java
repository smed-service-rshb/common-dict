package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.KinshipTypeEntity;

/**
 * Репозиторий для работы с сущностью видов степеней родства
 *
 * @author olshansky
 * @since 19.09.2018.
 */
public interface KinshipTypeRepository extends JpaRepository<KinshipTypeEntity, Long> {

}
