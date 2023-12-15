package ru.softlab.efr.common.dict.builder.externalsystem;

import ru.softlab.efr.common.dict.exchange.model.ExternalSystem;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;

/**
 * Класс для построения хранимой сущности данных о внешней системе
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
public class ExternalSystemEntityBuilder {

    /**
     * Построение хранимой сущности ExternalSystemEntity
     *
     * @param externalSystem данные о внешней системе
     * @return хранимая сущность ExternalSystemEntity
     */
    public static ExternalSystemEntity buildExternalSystem(ExternalSystem externalSystem) {
        ExternalSystemEntity externalSystemEntity = new ExternalSystemEntity();
        externalSystemEntity.setId(externalSystem.getId());
        externalSystemEntity.setName(externalSystem.getName());
        externalSystemEntity.setConnectTimeout(externalSystem.getConnectTimeout());
        externalSystemEntity.setFailurePeriod(externalSystem.getFailurePeriod());
        externalSystemEntity.setFailurePeriodCount(externalSystem.getFailurePeriodCount());
        return externalSystemEntity;
    }
}
