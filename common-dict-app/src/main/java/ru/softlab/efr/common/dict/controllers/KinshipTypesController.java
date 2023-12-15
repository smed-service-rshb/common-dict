package ru.softlab.efr.common.dict.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.AbstractDictItem;
import ru.softlab.efr.common.dict.exchange.model.GetAbstractDictRs;
import ru.softlab.efr.common.dict.model.KinshipTypeEntity;
import ru.softlab.efr.common.dict.services.KinshipTypeService;
import ru.softlab.efr.common.dict.utils.AppUtils;

import java.util.stream.Collectors;

/**
 * Контроллер обработки запросов, связанных со справочником видов степеней родства
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Validated
@RestController
@PropertySource("classpath:messages.properties")
public class KinshipTypesController implements KinshipTypesApi {

    private static final Logger LOGGER = Logger.getLogger(KinshipTypesController.class);

    @Autowired
    private KinshipTypeService kinshipTypeService;

    private AbstractDictItem mapEntity2Data(KinshipTypeEntity entity) {
        AbstractDictItem data = new AbstractDictItem();
        AppUtils.mapSimilarObjects(entity, data);
        return data;
    }

    @Override
    public ResponseEntity<GetAbstractDictRs> listKinshipTypes() throws Exception {
        GetAbstractDictRs response = new GetAbstractDictRs();
        response.setDictItems(kinshipTypeService.getAll().stream().map(this::mapEntity2Data).collect(Collectors.toList()));
        return ResponseEntity.ok(response);
    }
}