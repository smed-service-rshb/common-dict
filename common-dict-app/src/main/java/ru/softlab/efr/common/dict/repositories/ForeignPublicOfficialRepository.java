package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.ForeignPublicOfficialEntity;

/**
 * Репозиторий для работы с сущностью видов иностранных публичных должностных лиц (ИПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
public interface ForeignPublicOfficialRepository extends JpaRepository<ForeignPublicOfficialEntity, Long> {

}
