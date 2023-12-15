package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;

/**
 * Интерфейс, предоставляющий CRUD-методы для взаимодествия с таблицей шаблонов печатных форм
 *
 * @see JpaRepository
 */
public interface PrintTemplateRepository extends JpaRepository<PrintTemplateEntity, String> {

    /**
     * Получить контент шаблона
     *
     * @param type тип шаблона
     * @return контент
     */
    //if h2 test, then {h-schema} need
    @Query(value = "SELECT CONTENT from common_dict.PRINT_TEMPLATES where type=:type", nativeQuery = true)
    byte[] getContent(@Param("type") String type);

    /**
     * Обновить контент шаблона
     *
     * @param type    тип шаблона
     * @param content контент
     */
    @Modifying
    @Query(value = "update common_dict.PRINT_TEMPLATES set content =:content where type=:type", nativeQuery = true)
    void setContent(@Param("type") String type, @Param("content") byte[] content);
}
