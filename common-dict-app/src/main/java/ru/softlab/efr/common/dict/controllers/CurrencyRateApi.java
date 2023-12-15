/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.softlab.efr.common.dict.controllers;

import ru.softlab.efr.common.dict.exchange.model.CurrencyCbRateRs;
import ru.softlab.efr.common.dict.exchange.model.CurrencyRateData;
import ru.softlab.efr.common.dict.exchange.model.CurrencyRateDataForList;
import ru.softlab.efr.common.dict.exchange.model.CurrencyRateSettings;
import ru.softlab.efr.common.dict.exchange.model.ShortCurrencyRateData;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.validation.BindingResult;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.*;

import java.util.*;

import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * the CurrencyRate API
 */
public interface CurrencyRateApi {

    /**
     * Создать запись в справочнике курсов валют 
     * @param createRateRequest Запрос создания записи справочника  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rates",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createCurrencyRate(@Valid @RequestBody CurrencyRateData createRateRequest) throws Exception;



    /**
     * Получить активный курс валюты по идентификатору валюты 
     * @param currencyId Идентификатор валюты  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/currency/rate/active",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ShortCurrencyRateData> getActiveCurrencyRate(@NotNull  @Valid @RequestParam(value = "currencyId") Long currencyId) throws Exception;



    /**
     * Получить список курсов валют по ЦБ РФ 
     * @param literalIso ISO-код валюты
     * @param startDate Дата, с которой необходимо получить курсы. Формат ДД.ММ.ГГГГ
     * @param endDate Дата, по которую необходимо получить курсы. Формат ДД.ММ.ГГГГ  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/currency/rate/cb/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CurrencyCbRateRs> getCbCurrencyRateList(@NotNull  @Valid @RequestParam(value = "literalIso") String literalIso,@NotNull  @Valid @RequestParam(value = "startDate") String startDate,@NotNull  @Valid @RequestParam(value = "endDate") String endDate) throws Exception;



    /**
     * Получить данные курса по идентификатору записи в справочнике 
     * @param id Идентификатор записи справочника  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rate/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CurrencyRateData> getCurrencyById(@PathVariable("id") Long id) throws Exception;



    /**
     * Получить постраничный список курсов валют для отображения в списке   
     * @param pageable параметры пагинации 
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Page<CurrencyRateDataForList>> getCurrencyRateList(@PageableDefault(value = 50) Pageable pageable) throws Exception;



    /**
     * Получить насройки способа расчета курса валют   
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rates/setting",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CurrencyRateSettings> getCurrencyRateSetting() throws Exception;



    /**
     *  
     * @param id Идентификатор записи справочника
     * @param updateRateRequest Запрос обновления записи справочника  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rate/{id}",
        method = RequestMethod.PUT)
    ResponseEntity<CurrencyRateData> updateCurrencyRate(@PathVariable("id") Long id,@Valid @RequestBody CurrencyRateData updateRateRequest) throws Exception;



    /**
     * Обновить настройки способа расчета курса валют 
     * @param updateCurrencyRateSetting Данные с настройками способа расчета курса  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/rates/setting",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> updateCurrencyRateSetting(@Valid @RequestBody CurrencyRateSettings updateCurrencyRateSetting) throws Exception;


}
