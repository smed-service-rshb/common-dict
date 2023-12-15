package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.builder.office.OfficeBuilder;
import ru.softlab.efr.common.dict.exchange.model.Office;
import ru.softlab.efr.common.dict.model.OfficeEntity;
import ru.softlab.efr.common.dict.services.OfficeService;
import ru.softlab.efr.common.permissions.OfficesPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityNotFoundException;

/**
 * Контроллер офисов
 *
 * @author Plaksiy
 * @since 20.09.2017
 */
@RestController
@RequestMapping("/dictionaries/offices")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    /**
     * Возвращает список офисов
     *
     * @param pageable количество страниц
     * @return список офисов
     */
    @HasPermission(OfficesPermissions.OFFICES_LIST)
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Office>> list(@PageableDefault(value = 50) Pageable pageable) {
        Page<OfficeEntity> officeEntities = officeService.findAll(pageable);
        return ResponseEntity.ok(officeEntities.map(OfficeBuilder::buildOffice));
    }

    /**
     * Возвращает офис
     *
     * @param id идентификатор офиса
     * @return офис
     */
    @HasPermission(OfficesPermissions.GET_OFFICE)
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Office> getOffice(@PathVariable("id") long id) {
        OfficeEntity officeEntity;
        try {
            officeEntity = officeService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(OfficeBuilder.buildOffice(officeEntity));
    }
}
