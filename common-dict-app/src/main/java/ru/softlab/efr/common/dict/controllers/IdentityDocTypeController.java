package ru.softlab.efr.common.dict.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.GetIdentityDocTypeListRs;
import ru.softlab.efr.common.dict.exchange.model.IdentityDocType;
import ru.softlab.efr.common.dict.model.IdentityDocTypeEntity;
import ru.softlab.efr.common.dict.services.IdentityDocTypeService;
import ru.softlab.efr.common.dict.utils.AppUtils;

import javax.validation.Valid;
import java.util.stream.Collectors;

/**
 * Контроллер обработки запросов, связанных со справочником типов документов
 *
 * @author olshansky
 * @since 18.09.2018.
 */
@Validated
@RestController
public class IdentityDocTypeController implements IdentityDocTypesApi {

    private static final Logger LOGGER = Logger.getLogger(IdentityDocTypeController.class);

    @Autowired
    private IdentityDocTypeService identityDocTypeService;

    @Override
    public ResponseEntity<Void> deleteIdentityDocType(@PathVariable("id") Long id) throws Exception {
        IdentityDocTypeEntity entity = identityDocTypeService.findById(id);
        if (entity != null) {
            identityDocTypeService.delete(entity);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<GetIdentityDocTypeListRs> listIdentityDocTypes() throws Exception {
        GetIdentityDocTypeListRs response = new GetIdentityDocTypeListRs();
        response.setIdentityDocTypes(identityDocTypeService.getAll().stream().map(this::mapEntity2Data).collect(Collectors.toList()));
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Void> upsertIdentityDocType(@Valid @RequestBody IdentityDocType identityDocType) throws Exception {
        identityDocTypeService.save(mapRequestData2DatabaseEntity(identityDocType));
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    private IdentityDocType mapEntity2Data(IdentityDocTypeEntity entity) {
        IdentityDocType data = new IdentityDocType();
        AppUtils.mapSimilarObjects(entity, data);
        return data;
    }

    private IdentityDocTypeEntity mapRequestData2DatabaseEntity(IdentityDocType data) {
        IdentityDocTypeEntity entity = null;
        if (data.getId() != null) {
            entity = identityDocTypeService.findById(data.getId());
        }
        if (entity == null) {
            entity = new IdentityDocTypeEntity();
        }
        entity.setId(data.getId());
        entity.setName(data.getName());
        entity.setSchema(data.getSchema());
        return entity;
    }
}