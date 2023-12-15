package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.CheckInvalidIdentityDocRq;
import ru.softlab.efr.common.dict.exchange.model.CheckInvalidIdentityDocRs;
import ru.softlab.efr.common.dict.exchange.model.UpdateListStatus;
import ru.softlab.efr.common.dict.services.impl.InvalidIdentityDocServiceImpl;

import javax.validation.Valid;
import java.io.IOException;

/**
 * Контроллер обработки запросов, связанных со справочником недействительных паспортов
 *
 * @author olshansky
 * @since 14.09.2018.
 */
@Validated
@RestController
public class InvalidIdentityDocController implements InvalidIdentityDocsApi {

    @Autowired
    private InvalidIdentityDocServiceImpl invalidIdentityDocService;

    @Override
    public ResponseEntity<CheckInvalidIdentityDocRs> checkInvalidIdentityDoc(@Valid @RequestBody CheckInvalidIdentityDocRq checkInvalidIdentityDocRq) {
        return ResponseEntity.ok().body(invalidIdentityDocService.checkList(checkInvalidIdentityDocRq));
    }

    @Override
    public ResponseEntity<UpdateListStatus> getInvalidIdentityDocUpdateStatus() {
        return ResponseEntity.ok().body(new UpdateListStatus(invalidIdentityDocService.getStatus()));
    }

    @Override
    public ResponseEntity<UpdateListStatus> updateInvalidIdentityDocList() throws IOException {
        return ResponseEntity.ok().body(new UpdateListStatus(invalidIdentityDocService.updateList()));
    }
}