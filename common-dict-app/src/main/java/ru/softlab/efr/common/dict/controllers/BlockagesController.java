package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRq;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRs;
import ru.softlab.efr.common.dict.exchange.model.UpdateListStatus;
import ru.softlab.efr.common.dict.services.impl.BlockagesServiceImpl;

import javax.validation.Valid;
import java.io.IOException;


/**
 * Контроллер обработки запросов, связанных со справочником блокировок/заморозок
 *
 * @author olshansky
 * @since 17.09.2018.
 */
@Validated
@RestController
public class BlockagesController implements BlockagesApi {

    private final BlockagesServiceImpl blockagesService;

    @Autowired
    public BlockagesController(BlockagesServiceImpl blockagesService) {
        this.blockagesService = blockagesService;
    }

    @Override
    public ResponseEntity<CheckBlockagesRs> checkBlockages(@Valid @RequestBody CheckBlockagesRq checkBlockagesRq) {
        return ResponseEntity.ok().body(blockagesService.checkList(checkBlockagesRq));
    }

    @Override
    public ResponseEntity<UpdateListStatus> getBlockageUpdateStatus() {
        return ResponseEntity.ok().body(new UpdateListStatus(blockagesService.getStatus()));
    }

    @Override
    public ResponseEntity<UpdateListStatus> updateBlockageList() throws IOException {
        return ResponseEntity.ok().body(new UpdateListStatus(blockagesService.updateList()));
    }

    @Override
    public ResponseEntity<Void> uploadBlockages(@Valid @RequestPart(value="content", required=false) MultipartFile content) throws Exception {
        blockagesService.updateList(content);
        return ResponseEntity.ok().build();
    }
}