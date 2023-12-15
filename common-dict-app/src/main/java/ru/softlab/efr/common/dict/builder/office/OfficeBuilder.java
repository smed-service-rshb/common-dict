package ru.softlab.efr.common.dict.builder.office;

import ru.softlab.efr.common.dict.exchange.model.Office;
import ru.softlab.efr.common.dict.model.OfficeEntity;

/**
 * Класс для построения данных об офисе
 *
 * @author Plaksiy
 * @since 20.09.2017
 */
public class OfficeBuilder {

    /**
     * Построение данных об офисе
     *
     * @param officeEntity хранимая сущность OfficeEntity
     * @return данные об офисе
     */
    public static Office buildOffice(OfficeEntity officeEntity) {
        Office office = new Office();
        office.setId(officeEntity.getId());
        office.setRfId(officeEntity.getRfId());
        office.setSimpleName(officeEntity.getSimpleName());
        office.setOfficialName(officeEntity.getOfficialName());
        office.setPostAddress(officeEntity.getPostAddress());
        office.setPhone(officeEntity.getPhone());
        office.setStartTime(officeEntity.getStartTime());
        office.setEndTime(officeEntity.getEndTime());
        return office;
    }
}
