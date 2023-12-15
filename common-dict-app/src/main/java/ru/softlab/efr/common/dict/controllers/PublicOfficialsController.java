package ru.softlab.efr.common.dict.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.AbstractDictItem;
import ru.softlab.efr.common.dict.exchange.model.GetAbstractDictRs;
import ru.softlab.efr.common.dict.model.PublicOfficialEntity;
import ru.softlab.efr.common.dict.services.PublicOfficialService;
import ru.softlab.efr.common.dict.utils.AppUtils;

import java.util.stream.Collectors;

/**
 * Контроллер обработки запросов, связанных со справочником видов публичных должностных лиц (ПДЛ)
 *
 * @author olshansky
 * @since 19.09.2018.
 */
@Validated
@RestController
public class PublicOfficialsController implements PublicOfficialsApi {

    private static final Logger LOGGER = Logger.getLogger(PublicOfficialsController.class);

    @Autowired
    private PublicOfficialService publicOfficialService;

    private AbstractDictItem mapEntity2Data(PublicOfficialEntity entity) {
        AbstractDictItem data = new AbstractDictItem();
        AppUtils.mapSimilarObjects(entity, data);
        return data;
    }

    @Override
    public ResponseEntity<GetAbstractDictRs> listPublicOfficial() throws Exception {
        GetAbstractDictRs response = new GetAbstractDictRs();
        response.setDictItems(publicOfficialService.getAll().stream().map(this::mapEntity2Data).collect(Collectors.toList()));
        return ResponseEntity.ok(response);
    }
}