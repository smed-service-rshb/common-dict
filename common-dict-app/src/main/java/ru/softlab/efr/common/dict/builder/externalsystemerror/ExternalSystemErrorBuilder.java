package ru.softlab.efr.common.dict.builder.externalsystemerror;

import ru.softlab.efr.common.dict.exchange.model.ExternalSystemError;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;

/**
 * Класс для построения данных ооб ошибке внешней системы
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
public class ExternalSystemErrorBuilder {

    /**
     * Построение ошибки внешней системы
     *
     * @param externalSystemErrorEntity хранимая сущность ошибки внешней системы
     * @return данные об ошибке внешней системы
     */
    public static ExternalSystemError buildExternalSystemError(ExternalSystemErrorEntity externalSystemErrorEntity) {
        ExternalSystemError externalSystemError = new ExternalSystemError();
        externalSystemError.setId(externalSystemErrorEntity.getId());
        externalSystemError.setServiceName(externalSystemErrorEntity.getServiceName());
        externalSystemError.setErrorCode(externalSystemErrorEntity.getErrorCode());
        externalSystemError.setMessage(externalSystemErrorEntity.getMessage());
        return externalSystemError;
    }
}
