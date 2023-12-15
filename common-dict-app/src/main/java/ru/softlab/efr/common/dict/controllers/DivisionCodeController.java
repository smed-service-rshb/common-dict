package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.softlab.efr.common.dict.builder.divisioncode.DivisionCodeBuilder;
import ru.softlab.efr.common.dict.builder.divisioncode.DivisionCodeEntityBuilder;
import ru.softlab.efr.common.dict.exchange.model.DivisionCode;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;
import ru.softlab.efr.common.dict.services.DivisionCodeService;
import ru.softlab.efr.common.permissions.DivisionCodesPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Контроллер кодов подразделений
 *
 * @author basharin
 * @since 07.12.2017
 */
@RestController
@RequestMapping("/dictionaries/division-codes")
public class DivisionCodeController implements DivisionCodesApi {

    private final DivisionCodeService divisionCodeService;

    @Autowired
    public DivisionCodeController(DivisionCodeService divisionCodeService) {
        this.divisionCodeService = divisionCodeService;
    }

    /**
     * Возвращает список кодов подразделений
     *
     * @param pageable количество страниц
     * @return список кодов подразделений
     */
    @RequestMapping(method = RequestMethod.GET)
    @HasPermission(DivisionCodesPermissions.DIVISION_CODES_LIST)
    public ResponseEntity<Page<DivisionCode>> listDivisionCodes(@PageableDefault(value = 50) Pageable pageable) {
        Page<DivisionCodeEntity> divisionCodeEntities = divisionCodeService.findAll(pageable);
        return ResponseEntity.ok(divisionCodeEntities.map(DivisionCodeBuilder::buildDivisionCode));
    }

    /**
     * Возвращает код подразделения по идентификатору
     *
     * @param id идентификатор подразделения
     * @return код подразделения
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HasPermission(DivisionCodesPermissions.GET_DIVISION_CODE)
    public ResponseEntity<DivisionCode> getDivisionCode(@PathVariable("id") Long id) {
        DivisionCodeEntity divisionCodeEntity;
        try {
            divisionCodeEntity = divisionCodeService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(DivisionCodeBuilder.buildDivisionCode(divisionCodeEntity));
    }

    /**
     * Создать запись кода подразделения
     *
     * @param divisionCode код подразделения
     * @return результат запроса
     */
    @HasPermission(DivisionCodesPermissions.CREATE_DIVISION_CODE)
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<DivisionCode> createDivisionCode(@RequestBody DivisionCode divisionCode) {
        try {
            DivisionCodeEntity divisionCodeEntity = divisionCodeService.create(DivisionCodeEntityBuilder.buildDivisionCode(divisionCode));
            return ResponseEntity
                    .created(UriComponentsBuilder.fromUriString("/dictionaries/division-codes/{id}").buildAndExpand(divisionCodeEntity.getId()).toUri())
                    .body(DivisionCodeBuilder.buildDivisionCode(divisionCodeEntity));
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Возвращает подразделения по коду
     *
     * @param code код подразделения
     * @return подразделение
     * @throws Exception исключение, выбрасываемое в случае ошибок при выполнении метода
     */
    @RequestMapping(method = RequestMethod.GET, params = "code")
    @HasPermission(DivisionCodesPermissions.GET_DIVISION_BY_CODE)
    public ResponseEntity<DivisionCode> getDivisionCodeByCode(@RequestParam("code") String code) throws Exception {
        DivisionCodeEntity divisionCodeEntity = divisionCodeService.get(code);
        if (divisionCodeEntity == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(DivisionCodeBuilder.buildDivisionCode(divisionCodeEntity));
    }
}
