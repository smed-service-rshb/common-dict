/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.softlab.efr.common.dict.controllers;

import ru.softlab.efr.common.dict.exchange.model.ExternalSystem;

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
 * the ExternalSystems API
 */
public interface ExternalSystemsApi {

    /**
     * Создание внешней системы 
     * @param externalSystem Данные о внешней системе  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ExternalSystem> createExternalSystem(@Valid @RequestBody ExternalSystem externalSystem) throws Exception;



    /**
     * Удаление внешней системы 
     * @param id Идентификатор внешней системы  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteExternalSystem(@PathVariable("id") Long id) throws Exception;



    /**
     * Редактирование внешней системы 
     * @param id Идентификатор внешней системы
     * @param externalSystem Данные о внешней системе  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<ExternalSystem> editExternalSystem(@PathVariable("id") Long id,@Valid @RequestBody ExternalSystem externalSystem) throws Exception;



    /**
     * Возвращает информацию о внешней системе 
     * @param id Идентификатор внешней системы  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ExternalSystem> getExternalSystem(@PathVariable("id") Long id) throws Exception;



    /**
     * Поиск внешней системы по идентификатору 
     * @param systemId Идентификатор системы (например \&quot;BISQUIT:6300\&quot;)  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems#bySystemId",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ExternalSystem> getExternalSystemBySystemId( @Valid @RequestParam(value = "systemId", required = false) String systemId) throws Exception;



    /**
     * Список внешних систем   
     * @param pageable параметры пагинации 
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/external-systems",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Page<ExternalSystem>> listExternalSystems(@PageableDefault(value = 50) Pageable pageable) throws Exception;


}
