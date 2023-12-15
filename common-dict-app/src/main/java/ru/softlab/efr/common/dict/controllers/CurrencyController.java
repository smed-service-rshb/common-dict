package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.softlab.efr.common.dict.builder.currency.CurrencyBuilder;
import ru.softlab.efr.common.dict.builder.currency.CurrencyEntityBuilder;
import ru.softlab.efr.common.dict.exchange.model.Currency;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.services.CurrencyService;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

/**
 * Контроллер валют
 *
 * @author Plaksiy
 * @since 30.08.2017
 */
@RestController
@RequestMapping("/dictionaries/currencies")
public class CurrencyController implements CurrenciesApi {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    /**
     * Возвращает список валют
     *
     * @param pageable количество страниц
     * @return список валют
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Currency>> listCurrencies(@PageableDefault(value = 50) Pageable pageable) {
        Page<CurrencyEntity> currencyEntities = currencyService.findAll(pageable);
        return ResponseEntity.ok(currencyEntities.map(CurrencyBuilder::buildCurrency));
    }

    /**
     * Возвращает валюту по идентификатору
     *
     * @param id идентификатор валюты
     * @return данные о валюте
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Currency> getCurrency(@PathVariable("id") Long id) {
        CurrencyEntity currencyEntity;
        try {
            currencyEntity = currencyService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(CurrencyBuilder.buildCurrency(currencyEntity));
    }

    /**
     * Создает запись о валюте
     *
     * @param currencyData данные о валюте
     * @return результат запроса
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Currency> createCurrency(@RequestBody Currency currencyData) {
        try {
            CurrencyEntity currencyEntity = currencyService.create(CurrencyEntityBuilder.buildCurrency(currencyData));
            return ResponseEntity
                    .created(UriComponentsBuilder.fromUriString("/dictionaries/currencies/{id}").buildAndExpand(currencyEntity.getId()).toUri())
                    .body(CurrencyBuilder.buildCurrency(currencyEntity));
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Редактирование записи о валюте
     *
     * @param id           идентификатор валюты
     * @param currencyData данные о валюте
     * @return результат запроса
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Currency> editCurrency(
            @PathVariable("id") Long id,
            @RequestBody Currency currencyData) {
        CurrencyEntity currencyEntity = CurrencyEntityBuilder.buildCurrency(currencyData);
        currencyEntity.setId(id);
        try {
            return ResponseEntity.ok(CurrencyBuilder.buildCurrency(currencyService.update(currencyEntity)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Удалить запись о валюте
     *
     * @param id идентификатор валюты
     * @return результат запроса
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteCurrency(@PathVariable("id") Long id) {
        try {
            currencyService.delete(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
