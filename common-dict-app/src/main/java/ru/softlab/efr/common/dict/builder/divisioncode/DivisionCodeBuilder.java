package ru.softlab.efr.common.dict.builder.divisioncode;

import ru.softlab.efr.common.dict.exchange.model.DivisionCode;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;

/**
 * Класс для построения данных о подразделении
 *
 * @author basharin
 * @since 07.12.2017
 */
public class DivisionCodeBuilder {

    /**
     * Построение данных кода подразделения
     *
     * @param divisionCodeEntity хранимая сущность DivisionCodeEntity(код подразделения)
     * @return код подразделения
     */
    public static DivisionCode buildDivisionCode(DivisionCodeEntity divisionCodeEntity) {
        DivisionCode divisionCode = new DivisionCode();
        divisionCode.setId(divisionCodeEntity.getId());
        divisionCode.setCode(divisionCodeEntity.getCode());
        divisionCode.setDescription(divisionCodeEntity.getDescription());
        return divisionCode;
    }


}
