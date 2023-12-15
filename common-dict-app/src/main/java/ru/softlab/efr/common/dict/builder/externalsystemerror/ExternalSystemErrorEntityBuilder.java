package ru.softlab.efr.common.dict.builder.externalsystemerror;

import ru.softlab.efr.common.dict.exchange.model.ExternalSystemError;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;

/**
 * Класс для построения хранимой сущности данных об ошибке внешней системы
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
public class ExternalSystemErrorEntityBuilder {

    /**
     * Построение хранимой сущности ExternalSystemErrorEntity
     *
     * @param externalSystemError данные об ошибке внешней системы
     * @return хранимая сущность ExternalSystemErrorEntity
     */
    public static ExternalSystemErrorEntity buildExternalSystemError(ExternalSystemError externalSystemError) {
        ExternalSystemErrorEntity externalSystemErrorEntity = new ExternalSystemErrorEntity();
        externalSystemErrorEntity.setId(externalSystemError.getId());
        externalSystemErrorEntity.setServiceName(externalSystemError.getServiceName());
        externalSystemErrorEntity.setErrorCode(externalSystemError.getErrorCode());
        externalSystemErrorEntity.setMessage(externalSystemError.getMessage());
        return externalSystemErrorEntity;
    }
}
