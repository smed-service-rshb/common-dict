package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.InvalidIdentityDocEntity;

import java.util.List;

/**
 * Репозиторий для работы с сущностью недействительных паспортов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
public interface InvalidIdentityDocRepository extends JpaRepository<InvalidIdentityDocEntity, Long> {

    Integer countAllByPassportSeriesNumber(String passportSeriesNumber);

    List<InvalidIdentityDocEntity> findAllByPassportSeriesNumberIn(@Param("passports") List<String> passports);

    @Query(value = "SELECT upload_invalid_identity_doc(:filePath)", nativeQuery = true)
    Integer uploadNewDict(@Param("filePath") String filePath);
}
