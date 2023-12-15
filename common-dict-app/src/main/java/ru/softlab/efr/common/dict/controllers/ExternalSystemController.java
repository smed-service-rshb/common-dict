package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.softlab.efr.common.dict.builder.externalsystem.ExternalSystemBuilder;
import ru.softlab.efr.common.dict.builder.externalsystem.ExternalSystemEntityBuilder;
import ru.softlab.efr.common.dict.exchange.model.ExternalSystem;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;
import ru.softlab.efr.common.dict.services.ExternalSystemService;
import ru.softlab.efr.common.permissions.ExternalSystemsPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Контроллер внешних систем
 *
 * @author Plaksiy
 * @since 12.09.2017
 */
@RestController
@RequestMapping("/dictionaries/external-systems")
public class ExternalSystemController implements ExternalSystemsApi {

    private final ExternalSystemService externalSystemService;

    @Autowired
    public ExternalSystemController(ExternalSystemService externalSystemService) {
        this.externalSystemService = externalSystemService;
    }

    /**
     * Возвращает список внешних систем
     *
     * @param pageable количество страниц
     * @return список внешних систем
     */
    @HasPermission(ExternalSystemsPermissions.EXTERNAL_SYSTEMS_LIST)
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<ExternalSystem>> listExternalSystems(@PageableDefault(value = 50) Pageable pageable) {
        Page<ExternalSystemEntity> currencyEntities = externalSystemService.findAll(pageable);
        return ResponseEntity.ok(currencyEntities.map(ExternalSystemBuilder::buildExternalSystem));
    }

    /**
     * Возвращает внешнюю систему по идентификатору
     *
     * @param id идентификатор внешней системы
     * @return данные о внешней системе
     */
    @HasPermission(ExternalSystemsPermissions.GET_EXTERNAL_SYSTEM)
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<ExternalSystem> getExternalSystem(@PathVariable("id") Long id) {
        ExternalSystemEntity externalSystemEntity;
        try {
            externalSystemEntity = externalSystemService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ExternalSystemBuilder.buildExternalSystem(externalSystemEntity));
    }

    /**
     * Возвращает внешнюю систему по идентификатору вида BISQUIT:6300
     *
     * @param systemId идентификатор внешней системы
     * @return данные о внешней системе
     */
    @HasPermission(ExternalSystemsPermissions.GET_EXTERNAL_SYSTEM)
    @RequestMapping(method = RequestMethod.GET, params = "systemId")
    @Override
    public ResponseEntity<ExternalSystem> getExternalSystemBySystemId(@RequestParam("systemId") String systemId) {
        ExternalSystemEntity externalSystemEntity;
        try {
            externalSystemEntity = externalSystemService.findBySystemId(systemId);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ExternalSystemBuilder.buildExternalSystem(externalSystemEntity));
    }

    /**
     * Создать запись о внешней системе
     *
     * @param externalSystemData данные о внешней системе
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.CREATE_EXTERNAL_SYSTEM)
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ExternalSystem> createExternalSystem(@RequestBody ExternalSystem externalSystemData) {
        try {
            ExternalSystemEntity externalSystemEntity = externalSystemService.create(ExternalSystemEntityBuilder.buildExternalSystem(externalSystemData));
            return ResponseEntity
                    .created(UriComponentsBuilder.fromUriString("/dictionaries/external-systems/{id}").buildAndExpand(externalSystemEntity.getId()).toUri())
                    .body(ExternalSystemBuilder.buildExternalSystem(externalSystemEntity));
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Редактировать запись о внешней системе
     *
     * @param id                 идентификатор системы
     * @param externalSystemData данные о внешней системе
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.EDIT_EXTERNAL_SYSTEM)
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<ExternalSystem> editExternalSystem(
            @PathVariable("id") Long id,
            @RequestBody ExternalSystem externalSystemData) {
        ExternalSystemEntity externalSystemEntity = ExternalSystemEntityBuilder.buildExternalSystem(externalSystemData);
        externalSystemEntity.setId(id);
        try {
            return ResponseEntity.ok(ExternalSystemBuilder.buildExternalSystem(externalSystemService.update(externalSystemEntity)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Удалить запись о внешней системе
     *
     * @param id идентифкатор внешней системы
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.DELETE_EXTERNAL_SYSTEM)
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteExternalSystem(@PathVariable("id") Long id) {
        try {
            externalSystemService.delete(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
