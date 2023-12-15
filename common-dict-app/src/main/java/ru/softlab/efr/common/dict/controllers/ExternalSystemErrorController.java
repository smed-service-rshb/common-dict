package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.softlab.efr.common.dict.builder.externalsystemerror.ExternalSystemErrorBuilder;
import ru.softlab.efr.common.dict.builder.externalsystemerror.ExternalSystemErrorEntityBuilder;
import ru.softlab.efr.common.dict.exchange.model.ExternalSystemError;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;
import ru.softlab.efr.common.dict.services.ExternalSystemErrorService;
import ru.softlab.efr.common.permissions.ExternalSystemsPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Контроллер ошибок внешних систем
 *
 * @author Plaksiy
 * @since 13.09.2017
 */
@RestController
@RequestMapping("/dictionaries/external-system-errors")
public class ExternalSystemErrorController implements ExternalSystemsErrorsApi {

    private final ExternalSystemErrorService externalSystemErrorService;

    @Autowired
    public ExternalSystemErrorController(ExternalSystemErrorService externalSystemErrorService) {
        this.externalSystemErrorService = externalSystemErrorService;
    }

    /**
     * Возвращает список ошибок внешних систем
     *
     * @param pageable количество страниц
     * @return список ошибок внешних систем
     */
    @HasPermission(ExternalSystemsPermissions.EXTERNAL_SYSTEMS_ERRORS_LIST)
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<ExternalSystemError>> listExternalSystemsErrors(@PageableDefault(value = 50) Pageable pageable) {
        Page<ExternalSystemErrorEntity> externalSystemErrorEntities = externalSystemErrorService.findAll(pageable);
        return ResponseEntity.ok(externalSystemErrorEntities.map(ExternalSystemErrorBuilder::buildExternalSystemError));
    }

    /**
     * Возвращает ошибку внешней системы по идентификатору
     *
     * @param id идентификатор внешней системы
     * @return оишбка внешней системы
     */
    @HasPermission(ExternalSystemsPermissions.GET_EXTERNAL_SYSTEM_ERROR)
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<ExternalSystemError> getExternalSystemsError(@PathVariable("id") Long id) {
        ExternalSystemErrorEntity externalSystemErrorEntity;
        try {
            externalSystemErrorEntity = externalSystemErrorService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ExternalSystemErrorBuilder.buildExternalSystemError(externalSystemErrorEntity));
    }

    /**
     * Создать запись об ошибке внешней системы
     *
     * @param externalSystemErrorData данные об ошибке внешней системы
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.CREATE_EXTERNAL_SYSTEM_ERROR)
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ExternalSystemError> createExternalSystemsError(
            @RequestBody ExternalSystemError externalSystemErrorData) {
        try {
            ExternalSystemErrorEntity externalSystemErrorEntity = externalSystemErrorService
                    .create(ExternalSystemErrorEntityBuilder.buildExternalSystemError(externalSystemErrorData));
            return ResponseEntity
                    .created(UriComponentsBuilder.fromUriString("/dictionaries/external-system-errors/{id}").buildAndExpand(externalSystemErrorEntity.getId()).toUri())
                    .body(ExternalSystemErrorBuilder.buildExternalSystemError(externalSystemErrorEntity));
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Редактировать запиьс об ошибке внешней ситемы
     *
     * @param id                      идентификатор записи
     * @param externalSystemErrorData данные об ошибке
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.EDIT_EXTERNAL_SYSTEM_ERROR)
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<ExternalSystemError> editExternalSystemsError(
            @PathVariable("id") Long id,
            @RequestBody ExternalSystemError externalSystemErrorData) {
        ExternalSystemErrorEntity externalSystemErrorEntity = ExternalSystemErrorEntityBuilder
                .buildExternalSystemError(externalSystemErrorData);
        externalSystemErrorEntity.setId(id);
        try {
            return ResponseEntity.ok(ExternalSystemErrorBuilder
                    .buildExternalSystemError(externalSystemErrorService.update(externalSystemErrorEntity)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Удаление записи об ошибке внешней системы
     *
     * @param id идентификатор вншней системы
     * @return результат запроса
     */
    @HasPermission(ExternalSystemsPermissions.DELETE_EXTERNAL_SYSTEM_ERROR)
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteExternalSystemsError(@PathVariable("id") Long id) {
        try {
            externalSystemErrorService.delete(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
