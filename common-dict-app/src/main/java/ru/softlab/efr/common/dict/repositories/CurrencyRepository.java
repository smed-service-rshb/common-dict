package ru.softlab.efr.common.dict.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.softlab.efr.common.dict.model.CurrencyEntity;

/**
 * Репозиторий для работы с валютами
 *
 * @author Plaksiy
 * @since 30.08.2017
 */
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Long> {

    /**
     * Найти валюту по цифровому коду ISO валюты
     *
     * @param digitalISO цифровой код ISO валюты
     * @return хранимая сущность валюты
     */
    CurrencyEntity findByDigitalISO(Long digitalISO);

    /**
     * Найти валюту по строковому значению ISO валюты
     *
     * @param literalISO строковое значение ISO валюты
     * @return хранимая сущность валюты
     */
    CurrencyEntity findByLiteralISO(String literalISO);
}
