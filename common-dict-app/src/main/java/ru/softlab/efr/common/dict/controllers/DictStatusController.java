package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.softlab.efr.common.dict.exchange.model.CurrentDictRs;
import ru.softlab.efr.common.dict.exchange.model.DictStatus;
import ru.softlab.efr.common.dict.exchange.model.DictStatusRs;
import ru.softlab.efr.common.dict.exchange.model.FileDateForCurrentState;
import ru.softlab.efr.common.dict.model.enums.DictUpdateProcessNameEnum;
import ru.softlab.efr.common.dict.services.CurrentStateService;

import javax.validation.Valid;


/**
 * Контроллер обработки запросов, связанных со получением информации о статусах справочников
 *
 * @author olshansky
 * @since 22.01.2019.
 */
@Validated
@RestController
public class DictStatusController implements DictStatusApi {

    private final CurrentStateService currentStateService;

    @Autowired
    public DictStatusController(CurrentStateService currentStateService) {
        this.currentStateService = currentStateService;
    }

    @Override
    public ResponseEntity<CurrentDictRs> getCurrentDictIdByName(@RequestParam(value = "dictName") String dictName) throws Exception {
        return ResponseEntity.ok(new CurrentDictRs(currentStateService.getCurrentDictIdByName(DictUpdateProcessNameEnum.valueOf(dictName).toString())));
    }

    @Override
    public ResponseEntity<Page<DictStatus>> getDictStatus(@PageableDefault(value = 50) Pageable pageable) throws Exception {
        Pageable pageableDesc = new PageRequest(pageable.getPageNumber(), pageable.getPageSize(),
                new Sort(Sort.Direction.DESC, "created"));
        return ResponseEntity.ok().body(currentStateService.getDictStatus(pageableDesc));
    }

    @Override
    public ResponseEntity<FileDateForCurrentState> getFileDate(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok().body(currentStateService.getFileDateForCurrentState(id));
    }

    @Override
    public ResponseEntity<DictStatusRs> setDictStatus(@Valid @RequestBody DictStatus setDictStatusRq) throws Exception {
        currentStateService.setDictStatus(setDictStatusRq);
        return ResponseEntity.ok().build();
    }
}