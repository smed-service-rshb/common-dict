/*
 * API микросервиса общих справочников
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.softlab.efr.common.client;

import ru.softlab.efr.common.dict.exchange.model.CurrentDictRs;
import ru.softlab.efr.common.dict.exchange.model.DictStatus;
import ru.softlab.efr.common.dict.exchange.model.DictStatusRs;
import ru.softlab.efr.common.dict.exchange.model.FileDateForCurrentState;

import ru.softlab.efr.infrastructure.transport.client.*;
import ru.softlab.efr.common.utilities.rest.*;
import ru.softlab.efr.common.utilities.rest.client.*;
import ru.softlab.efr.common.utilities.rest.converters.DateParser;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import ru.softlab.efr.infrastructure.transport.client.impl.JmsUriBuilder;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.*;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Содержит методы для взаимодействия с приложением common-dict-app
 **/
@Component
public class DictStatusClient {
    private static final String REQUIRED_PARAM_ERROR = "Не указан обязательный параметр '%s' при вызове %s";
    private static final String APPLICATION_NAME = "common-dict-app";
    private static final String STATUS_CODE_TEMPLATE = "status code: [%s]";

    private final MicroServiceTemplate microServiceTemplate;

    /**
     * Возвращяет экземпляр класса
     * @param microServiceTemplate - объект, реализующий интерфейс {@link MicroServiceTemplate}
     */
    public DictStatusClient(MicroServiceTemplate microServiceTemplate) {
        this.microServiceTemplate = microServiceTemplate;
    }


    /**
     * Получение идентификатора файла справочника по типу
     * GET /dictionaries/currentDict
     *
     * @param dictName Наименование справочника (required)
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public CurrentDictRs getCurrentDictIdByName(String dictName, long timeout) throws RestClientException {
        return getCurrentDictIdByName(dictName).get(timeout);
    }

    /**
     * Получение идентификатора файла справочника по типу асинхронно
     * GET /dictionaries/currentDict
     *
     * @param dictName Наименование справочника (required)
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<CurrentDictRs> getCurrentDictIdByName(String dictName) throws RestClientException {
        return new ClientRestResult<>(getCurrentDictIdByNameInternal(dictName), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<CurrentDictRs>> getCurrentDictIdByNameInternal(String dictName) throws RestClientException {
        if (dictName == null)
            throw new RestClientException(String.format(REQUIRED_PARAM_ERROR, "dictName", "getCurrentDictIdByName"));
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/currentDict"));

        if (dictName != null)
            uriBuilder.param("dictName", dictName);
        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<CurrentDictRs>(){});
    }

    /**
     * Получение текущего статуса процесса обновления/проверки справочников
     * GET /dictionaries/status
     *
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public RestPageImpl<DictStatus> getDictStatus(Pageable pageable, long timeout) throws RestClientException {
        return getDictStatus(pageable).get(timeout);
    }

    /**
     * Получение текущего статуса процесса обновления/проверки справочников асинхронно
     * GET /dictionaries/status
     *
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<RestPageImpl<DictStatus>> getDictStatus(Pageable pageable) throws RestClientException {
        return new ClientRestResult<>(getDictStatusInternal(pageable), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<RestPageImpl<DictStatus>>> getDictStatusInternal(Pageable pageable) throws RestClientException {
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/status"));

        addPageableParams(uriBuilder, pageable);
        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<RestPageImpl<DictStatus>>(){});
    }

    /**
     * Получить дату загрузки справочника по которому проводилась проверка пользователя
     * GET /dictionaries/current-state/{id}/file-date
     *
     * @param id update_id проверяемого пользователя (required)
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return Дата загрузки справочника
     * @throws RestClientException в случае неудачи
    */
    public FileDateForCurrentState getFileDate(Long id, long timeout) throws RestClientException {
        return getFileDate(id).get(timeout);
    }

    /**
     * Получить дату загрузки справочника по которому проводилась проверка пользователя асинхронно
     * GET /dictionaries/current-state/{id}/file-date
     *
     * @param id update_id проверяемого пользователя (required)
     * @return Дата загрузки справочника
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<FileDateForCurrentState> getFileDate(Long id) throws RestClientException {
        return new ClientRestResult<>(getFileDateInternal(id), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<FileDateForCurrentState>> getFileDateInternal(Long id) throws RestClientException {
        if (id == null)
            throw new RestClientException(String.format(REQUIRED_PARAM_ERROR, "id", "getFileDate"));
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/current-state/{id}/file-date")).variable("id", id);

        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<FileDateForCurrentState>(){});
    }

    /**
     * Сохранение текущего статуса процесса обновления/проверки справочников
     * POST /dictionaries/status
     *
     * @param setDictStatusRq Тело запроса сохранения текущего статуса процесса обновления/проверки справочников (required)
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public DictStatusRs setDictStatus(DictStatus setDictStatusRq, long timeout) throws RestClientException {
        return setDictStatus(setDictStatusRq).get(timeout);
    }

    /**
     * Сохранение текущего статуса процесса обновления/проверки справочников асинхронно
     * POST /dictionaries/status
     *
     * @param setDictStatusRq Тело запроса сохранения текущего статуса процесса обновления/проверки справочников (required)
     * @return 
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<DictStatusRs> setDictStatus(DictStatus setDictStatusRq) throws RestClientException {
        return new ClientRestResult<>(setDictStatusInternal(setDictStatusRq), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<DictStatusRs>> setDictStatusInternal(DictStatus setDictStatusRq) throws RestClientException {
        if (setDictStatusRq == null)
            throw new RestClientException(String.format(REQUIRED_PARAM_ERROR, "setDictStatusRq", "setDictStatus"));
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/status"));

        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.POST, uriBuilder.build())
                  .body(setDictStatusRq);
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<DictStatusRs>(){});
    }
    private String cutComments(String path) {
        return path.split("#", 2)[0];
    }

    private void addPageableParams(MicroServiceURIBuilder builder, Pageable pageable) {
        if (pageable != null) {
            builder.param("page", pageable.getPageNumber());
            builder.param("size", pageable.getPageSize());
            Sort sort = pageable.getSort();
            if (sort != null) {
                List<String> sortParams = new ArrayList<>();
                for (Sort.Order next : sort) {
                    sortParams.add(next.getProperty());
                }
                sortParams.add(sort.getOrderFor(sortParams.get(0)).getDirection().name());
                builder.param("sort", String.join(",", sortParams));
            }
        }
    }

    private void processStatusCodeErrors(Exception e) throws RestClientException {
            HttpStatus statusCode = RestUtils.getStatusCode(e);
            if (statusCode != null) {
                switch (statusCode) {
                    case INTERNAL_SERVER_ERROR:
                        throw new RestClientException(String.format(STATUS_CODE_TEMPLATE, HttpStatus.INTERNAL_SERVER_ERROR.toString()));
                    case CONFLICT:
                        throw new EntityExistsException();
                    case NOT_FOUND:
                        throw new NotFoundException();
                }
            }
            throw new RestClientException(e.toString());
    }
}
