package ru.softlab.efr.common.dict.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.AbstractDictItem;
import ru.softlab.efr.common.dict.exchange.model.GetAbstractDictRs;
import ru.softlab.efr.common.dict.model.RussianPublicOfficialEntity;
import ru.softlab.efr.common.dict.services.RussianPublicOfficialService;
import ru.softlab.efr.common.dict.utils.AppUtils;

import java.util.stream.Collectors;

/**
 * Контроллер обработки запросов, связанных со справочником видов российских публичных должностных лиц (РПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Validated
@RestController
public class RussianPublicOfficialsController implements RussianPublicOfficialsApi {

    private static final Logger LOGGER = Logger.getLogger(RussianPublicOfficialsController.class);

    @Autowired
    private RussianPublicOfficialService russianPublicOfficialService;

    private AbstractDictItem mapEntity2Data(RussianPublicOfficialEntity entity) {
        AbstractDictItem data = new AbstractDictItem();
        AppUtils.mapSimilarObjects(entity, data);
        return data;
    }

    @Override
    public ResponseEntity<GetAbstractDictRs> listRussianPublicOfficials() throws Exception {
        GetAbstractDictRs response = new GetAbstractDictRs();
        response.setDictItems(russianPublicOfficialService.getAll().stream().map(this::mapEntity2Data).collect(Collectors.toList()));
        return ResponseEntity.ok(response);
    }
}