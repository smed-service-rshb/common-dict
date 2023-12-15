package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.BankEntity;

import java.util.List;

/**
 * Репозиторий для работы с банками
 *
 * @author levin
 * @since 07.04.2017
 */
public interface BankRepository extends JpaRepository<BankEntity, Long> {

    /**
     * Найти банк
     *
     * @param deleted  признак удаления
     * @param pageable флаг постраничности
     * @return хранимая сущность информации о банке
     */
    Page<BankEntity> findByDeleted(Boolean deleted, Pageable pageable);

    /**
     * Найти банк
     *
     * @param deleted признак удаления
     * @return хранимая сущность информации о банке
     */
    List<BankEntity> findByDeleted(Boolean deleted);

    /**
     * Найти банк по БИК
     *
     * @param bic БИК банка
     * @return хранимая сущность банка
     */
    BankEntity findByBic(String bic);

    /**
     * Найти банки по БИК и названию
     *
     * @param pageable количество страниц
     * @param bic      БИК банка
     * @param name     название банка
     * @return спсико банков
     */
    Page<BankEntity> findByBicIgnoreCaseContainingAndNameIgnoreCaseContainingAndDeleted(String bic, String name, Boolean deleted, Pageable pageable);
}
