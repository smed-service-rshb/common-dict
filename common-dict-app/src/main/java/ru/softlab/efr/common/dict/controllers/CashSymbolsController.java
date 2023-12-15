package ru.softlab.efr.common.dict.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.softlab.efr.common.dict.builder.cashsymbol.CashSymbolBuilder;
import ru.softlab.efr.common.dict.exchange.model.CashSymbol;
import ru.softlab.efr.common.dict.model.CashSymbolEntity;
import ru.softlab.efr.common.dict.services.CashSymbolService;
import ru.softlab.efr.common.permissions.CashSymbolsPermissions;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityNotFoundException;

/**
 * Контроллер кассовых символов
 *
 * @author bobkov
 * @since 30.07.2018
 */
@RestController
@RequestMapping("/dictionaries/cash-symbols")
public class CashSymbolsController implements CashSymbolsApi {
    private static final Log LOGGER = LogFactory.getLog(CashSymbolsController.class);

    private final CashSymbolService cashSymbolService;

    /**
     * Конструктор
     *
     * @param cashSymbolService сервис для работы с кассовыми символами
     */
    @Autowired
    public CashSymbolsController(CashSymbolService cashSymbolService) {
        this.cashSymbolService = cashSymbolService;
    }

    /**
     * Возвращает данные о кассовом символе по идентификатору
     *
     * @param id идентификатор кассового символа
     * @return данные о кассовом символе
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HasPermission(CashSymbolsPermissions.GET_CASH_SYMBOL)
    public ResponseEntity<CashSymbol> getCashSymbol(@PathVariable("id") Long id) {
        CashSymbolEntity cashSymbolEntity;
        try {
            cashSymbolEntity = cashSymbolService.findById(id);
        } catch (EntityNotFoundException e) {
            LOGGER.info(e);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(CashSymbolBuilder.buildCashSymbol(cashSymbolEntity));
    }

    @RequestMapping(method = RequestMethod.GET, params = "code")
    @HasPermission(CashSymbolsPermissions.GET_CASH_SYMBOL)
    public ResponseEntity<CashSymbol> getCashSymbolByCode(@RequestParam("code") Long code) {
        CashSymbolEntity cashSymbolEntity;
        try {
            cashSymbolEntity = cashSymbolService.findByCode(code);
        } catch (EntityNotFoundException e) {
            LOGGER.info(e);
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(CashSymbolBuilder.buildCashSymbol(cashSymbolEntity));
    }

    /**
     * Возвращает список кассовых символов
     *
     * @param pageable количество страниц
     * @return список кассовых символов
     */
    @RequestMapping(method = RequestMethod.GET)
    @HasPermission(CashSymbolsPermissions.CASH_SYMBOLS_LIST)
    public ResponseEntity<Page<CashSymbol>> listCashSymbols(@PageableDefault(value = 50) Pageable pageable) {
        Page<CashSymbolEntity> cashSymbolEntities = cashSymbolService.findAll(pageable);
        return ResponseEntity.ok(cashSymbolEntities.map(CashSymbolBuilder::buildCashSymbol));
    }
}
