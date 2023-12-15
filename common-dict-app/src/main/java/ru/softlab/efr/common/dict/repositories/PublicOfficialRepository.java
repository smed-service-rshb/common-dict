package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.PublicOfficialEntity;

/**
 * Репозиторий для работы с сущностью видов публичных должностных лиц (ПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
public interface PublicOfficialRepository extends JpaRepository<PublicOfficialEntity, Long> {

}
