package ru.softlab.efr.common.dict.builder.externalsystem;

import ru.softlab.efr.common.dict.exchange.model.ExternalSystem;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;

/**
 * Класс для построения данных о внешней системе
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
public class ExternalSystemBuilder {

    /**
     * Построение данных о внешней системы
     *
     * @param externalSystemEntity хранимая сущность ExternalSystem (данные о внешней системе)
     * @return данные о внешней системе
     */
    public static ExternalSystem buildExternalSystem(ExternalSystemEntity externalSystemEntity) {
        ExternalSystem externalSystem = new ExternalSystem();
        externalSystem.setId(externalSystemEntity.getId());
        externalSystem.setName(externalSystemEntity.getName());
        externalSystem.setSystemType(externalSystemEntity.getSystemType());
        externalSystem.setSystemId(externalSystemEntity.getSystemId());
        externalSystem.setConnectTimeout(externalSystemEntity.getConnectTimeout());
        externalSystem.setFailurePeriod(externalSystemEntity.getFailurePeriod());
        externalSystem.setFailurePeriodCount(externalSystemEntity.getFailurePeriodCount());
        return externalSystem;
    }
}
