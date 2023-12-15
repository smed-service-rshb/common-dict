package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.exchange.model.CheckTerroristRq;
import ru.softlab.efr.common.dict.exchange.model.CheckTerroristRs;
import ru.softlab.efr.common.dict.exchange.model.UpdateListStatus;
import ru.softlab.efr.common.dict.services.impl.TerroristServiceImpl;

import javax.validation.Valid;


/**
 * Контроллер обработки запросов, связанных со справочником экстремистов/террористов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@Validated
@RestController
public class TerroristController implements TerroristsApi {

    @Autowired
    private TerroristServiceImpl terroristService;

    @Override
    public ResponseEntity<CheckTerroristRs> checkTerrorist(@Valid @RequestBody CheckTerroristRq checkTerroristRq) throws Exception {
        return ResponseEntity.ok().body(terroristService.checkList(checkTerroristRq));
    }

    @Override
    public ResponseEntity<UpdateListStatus> getTerroristUpdateStatus() throws Exception {
        return ResponseEntity.ok().body(new UpdateListStatus(terroristService.getStatus()));
    }

    @Override
    public ResponseEntity<UpdateListStatus> updateTerroristList() throws Exception {
        return ResponseEntity.ok().body(new UpdateListStatus(terroristService.updateList()));
    }

    @Override
    public ResponseEntity<Void> uploadTerrorists(MultipartFile content) throws Exception {
        terroristService.updateList(content);
        return ResponseEntity.ok().build();
    }
}