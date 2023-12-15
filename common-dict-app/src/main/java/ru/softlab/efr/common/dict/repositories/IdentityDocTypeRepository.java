package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.IdentityDocTypeEntity;

/**
 * Репозиторий для работы с сущностью типов документов
 *
 * @author olshansky
 * @since 18.09.2018.
 */
public interface IdentityDocTypeRepository extends JpaRepository<IdentityDocTypeEntity, Long> {

}
