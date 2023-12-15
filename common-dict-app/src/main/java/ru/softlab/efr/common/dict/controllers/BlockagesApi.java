/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.softlab.efr.common.dict.controllers;

import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRq;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRs;
import org.springframework.core.io.Resource;
import ru.softlab.efr.common.dict.exchange.model.UpdateListStatus;

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
 * the Blockages API
 */
public interface BlockagesApi {

    /**
     * Проверка паспортных данных по справочнику блокировок/заморозок 
     * @param checkBlockagesRq Тело запроса проверки паспортных данных по справочнику блокировок/заморозок  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/blockages/check",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CheckBlockagesRs> checkBlockages(@Valid @RequestBody CheckBlockagesRq checkBlockagesRq) throws Exception;



    /**
     * Получение текущего статуса процесса обновления справочника блокировок/заморозок   
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/blockages/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UpdateListStatus> getBlockageUpdateStatus() throws Exception;



    /**
     * Запрос обновления списка блокировок/заморозок   
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/blockages/update",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UpdateListStatus> updateBlockageList() throws Exception;



    /**
     *  
     * @param content XML файл-справочник заморозок/блокировок  
     * @return Экземпляр класса {@link ResponseEntity}
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(value = "/dictionaries/blockages/update",
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadBlockages(@Valid @RequestPart(value="content", required=false) MultipartFile content) throws Exception;


}
