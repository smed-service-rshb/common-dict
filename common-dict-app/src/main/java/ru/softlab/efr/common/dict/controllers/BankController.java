package ru.softlab.efr.common.dict.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.softlab.efr.common.dict.builder.bank.BankBuilder;
import ru.softlab.efr.common.dict.builder.bank.BankEntityBuilder;
import ru.softlab.efr.common.dict.exchange.model.Bank;
import ru.softlab.efr.common.dict.model.BankEntity;
import ru.softlab.efr.common.dict.services.BankService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.dict.tools.bank.replicator.BankReplicatorDBF;
import ru.softlab.efr.common.permissions.BanksPermissions;
import ru.softlab.efr.common.settings.services.SettingsService;
import ru.softlab.efr.services.authorization.PrincipalData;
import ru.softlab.efr.services.authorization.PrincipalDataSource;
import ru.softlab.efr.services.authorization.annotations.HasPermission;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * Контроллер банков
 *
 * @author levin
 * @since 05.04.2017
 */
@RestController
@RequestMapping("/dictionaries/banks")
public class BankController implements BanksApi {

    private final BankService bankService;
    private final SettingsService settingsService;
    private final PrincipalDataSource principalDataSource;

    private final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");
    private final String CHANGED_BY_HAND_PATTERN = "%1$s %2$s %3$s %4$s";

    @Autowired
    public BankController(BankService bankService, SettingsService settingsService, PrincipalDataSource principalDataSource) {
        this.bankService = bankService;
        this.settingsService = settingsService;
        this.principalDataSource = principalDataSource;
    }

    /**
     * Проверка контроллера
     *
     * @return результат проверки
     */
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public ResponseEntity<Page<Bank>> ping() {
        return ResponseEntity.noContent().build();
    }

    /**
     * Возвращает список банков
     *
     * @param pageable количество страниц
     * @param bic      БИК банка
     * @param name     имя банка
     * @return список банков
     */
    @RequestMapping(method = RequestMethod.GET)
    @HasPermission(BanksPermissions.BANKS_LIST)
    public ResponseEntity<Page<Bank>> listBanks(
            @PageableDefault(value = 50) Pageable pageable,
            @RequestParam(value = "bic", required = false) String bic,
            @RequestParam(value = "name", required = false) String name) {
        Page<BankEntity> bankEntities = bankService.findBanks(pageable, bic, name);
        return ResponseEntity.ok(bankEntities.map(BankBuilder::buildBank));
    }

    /**
     * Создает запись о банке
     *
     * @param bankData данные о банке
     * @return результат запроса
     */
    @RequestMapping(method = RequestMethod.POST)
    @HasPermission(BanksPermissions.CREATE_BANK)
    public ResponseEntity<Bank> createBank(@RequestBody Bank bankData) {
        try {
            BankEntity bankEntity = BankEntityBuilder.buildBank(bankData);
            bankEntity.setChangedByHand(buildChangedByHand());
            return ResponseEntity
                    .created(UriComponentsBuilder.fromUriString("/addresses/banks/{id}").buildAndExpand(bankEntity.getId()).toUri())
                    .body(BankBuilder.buildBank(bankService.create(bankEntity)));
        } catch (EntityExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * Возвращает данные о банке по идентификатору
     *
     * @param id идентификатор банка
     * @return данные о банке
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @HasPermission(BanksPermissions.GET_BANK)
    public ResponseEntity<Bank> getBank(@PathVariable("id") Long id) {
        BankEntity bankEntity;
        try {
            bankEntity = bankService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(BankBuilder.buildBank(bankEntity));
    }

    /**
     * Редактирование записи о банке
     *
     * @param id       идентификатор банка
     * @param bankData данные о банке
     * @return результат запроса
     */
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @HasPermission(BanksPermissions.EDIT_BANK)
    public ResponseEntity<Bank> editBank(@PathVariable("id") Long id, @RequestBody Bank bankData) {
        try {
            bankService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        BankEntity bankEntity = BankEntityBuilder.buildBank(bankData);
        bankEntity.setId(id);
        bankEntity.setChangedByHand(buildChangedByHand());
        return ResponseEntity.ok(BankBuilder.buildBank(bankService.update(bankEntity)));
    }

    /**
     * Удаление записи о банке
     *
     * @param id идентификатор банка
     * @return результат запроса
     */
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @HasPermission(BanksPermissions.DELETE_BANK)
    public ResponseEntity<Void> deleteBank(@PathVariable("id") Long id) {
        BankEntity foundBank;
        try {
            foundBank = bankService.findById(id);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
        foundBank.setDeleted(true);
        bankService.update(foundBank);
        return ResponseEntity.noContent().build();
    }

    /**
     * Запуск репликации банков
     *
     * @return результат запроса
     */
    @RequestMapping(path = "/replication", method = RequestMethod.POST)
    @HasPermission(BanksPermissions.BANKS_REPLICATION)
    public ResponseEntity<Void> replicationBanks() {
        try {
            BankReplicatorDBF bankReplicatorDBF = new BankReplicatorDBF(bankService, settingsService);
            bankReplicatorDBF.replicate();
            return ResponseEntity.noContent().build();
        } catch (ReplicatorException e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).build();
        }
    }

    private String buildChangedByHand() {
        PrincipalData principalData = principalDataSource.getPrincipalData();
        return String.format(CHANGED_BY_HAND_PATTERN,
                principalData.getSecondName(),
                principalData.getFirstName(),
                principalData.getMiddleName(),
                LocalDateTime.now().format(DATE_TIME_FORMAT));
    }

}
