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

import ru.softlab.efr.common.dict.exchange.model.CashSymbol;

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
public class CashSymbolsClient {
    private static final String REQUIRED_PARAM_ERROR = "Не указан обязательный параметр '%s' при вызове %s";
    private static final String APPLICATION_NAME = "common-dict-app";
    private static final String STATUS_CODE_TEMPLATE = "status code: [%s]";

    private final MicroServiceTemplate microServiceTemplate;

    /**
     * Возвращяет экземпляр класса
     * @param microServiceTemplate - объект, реализующий интерфейс {@link MicroServiceTemplate}
     */
    public CashSymbolsClient(MicroServiceTemplate microServiceTemplate) {
        this.microServiceTemplate = microServiceTemplate;
    }


    /**
     * Возвращает информацию о кассовом символе
     * GET /dictionaries/cash-symbols/{id}
     *
     * @param id Идентификатор кассового символа (required)
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return Информация о кассовом символе
     * @throws RestClientException в случае неудачи
    */
    public CashSymbol getCashSymbol(Long id, long timeout) throws RestClientException {
        return getCashSymbol(id).get(timeout);
    }

    /**
     * Возвращает информацию о кассовом символе асинхронно
     * GET /dictionaries/cash-symbols/{id}
     *
     * @param id Идентификатор кассового символа (required)
     * @return Информация о кассовом символе
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<CashSymbol> getCashSymbol(Long id) throws RestClientException {
        return new ClientRestResult<>(getCashSymbolInternal(id), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<CashSymbol>> getCashSymbolInternal(Long id) throws RestClientException {
        if (id == null)
            throw new RestClientException(String.format(REQUIRED_PARAM_ERROR, "id", "getCashSymbol"));
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/cash-symbols/{id}")).variable("id", id);

        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<CashSymbol>(){});
    }

    /**
     * Возвращает информацию о кассовом символе по коду
     * GET /dictionaries/cash-symbols#byCode
     *
     * @param code Код кассового символа (required)
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return Информация о кассовом символе
     * @throws RestClientException в случае неудачи
    */
    public CashSymbol getCashSymbolByCode(Long code, long timeout) throws RestClientException {
        return getCashSymbolByCode(code).get(timeout);
    }

    /**
     * Возвращает информацию о кассовом символе по коду асинхронно
     * GET /dictionaries/cash-symbols#byCode
     *
     * @param code Код кассового символа (required)
     * @return Информация о кассовом символе
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<CashSymbol> getCashSymbolByCode(Long code) throws RestClientException {
        return new ClientRestResult<>(getCashSymbolByCodeInternal(code), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<CashSymbol>> getCashSymbolByCodeInternal(Long code) throws RestClientException {
        if (code == null)
            throw new RestClientException(String.format(REQUIRED_PARAM_ERROR, "code", "getCashSymbolByCode"));
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/cash-symbols#byCode"));

        if (code != null)
            uriBuilder.param("code", code);
        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<CashSymbol>(){});
    }

    /**
     * Список кассовых символов
     * GET /dictionaries/cash-symbols
     *
     * @param timeout таймаут ожидания ответа на асинхронный запрос
     * @return Постраничный вывод результатов поиска
     * @throws RestClientException в случае неудачи
    */
    public RestPageImpl<CashSymbol> listCashSymbols(Pageable pageable, long timeout) throws RestClientException {
        return listCashSymbols(pageable).get(timeout);
    }

    /**
     * Список кассовых символов асинхронно
     * GET /dictionaries/cash-symbols
     *
     * @return Постраничный вывод результатов поиска
     * @throws RestClientException в случае неудачи
    */
    public ClientRestResult<RestPageImpl<CashSymbol>> listCashSymbols(Pageable pageable) throws RestClientException {
        return new ClientRestResult<>(listCashSymbolsInternal(pageable), this::processStatusCodeErrors);
    }

    private ListenableFuture<ResponseEntity<RestPageImpl<CashSymbol>>> listCashSymbolsInternal(Pageable pageable) throws RestClientException {
        

        MicroServiceURIBuilder uriBuilder = JmsUriBuilder.service(APPLICATION_NAME)
            .path(cutComments("/dictionaries/cash-symbols"));

        addPageableParams(uriBuilder, pageable);
        RequestEntity requestEntity = RequestEntity
                  .method(HttpMethod.GET, uriBuilder.build())
                  .build();
        return microServiceTemplate.exchange(requestEntity,
                    new ParameterizedTypeReference<RestPageImpl<CashSymbol>>(){});
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
