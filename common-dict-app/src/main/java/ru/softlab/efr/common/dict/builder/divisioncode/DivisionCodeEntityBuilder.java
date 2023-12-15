package ru.softlab.efr.common.dict.builder.divisioncode;

import ru.softlab.efr.common.dict.exchange.model.DivisionCode;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;

/**
 * Класс для построения хранимой сущности данных о подразделении
 *
 * @author basharin
 * @since 11.12.2017
 */
public class DivisionCodeEntityBuilder {

    /**
     * Построение хранимой сущности DivisionCodeEntity
     *
     * @param divisionCode код подразделения
     * @return хранимая сущность DivisionCodeEntity
     */
    public static DivisionCodeEntity buildDivisionCode(DivisionCode divisionCode) {
        DivisionCodeEntity entity = new DivisionCodeEntity();
        entity.setId(divisionCode.getId());
        entity.setCode(divisionCode.getCode());
        entity.setDescription(divisionCode.getDescription());
        return entity;
    }
}
