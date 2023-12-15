package ru.softlab.efr.common.integration;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.softlab.efr.common.config.TestDockerApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.Bank;
import ru.softlab.efr.common.dict.model.BankEntity;
import ru.softlab.efr.common.dict.repositories.BankRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertTrue;
import static ru.softlab.efr.common.utilities.test.matchers.PageResultMatchers.pageContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.header;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * Интеграционные тесты одновременно через http и jms
 *
 * @author levin
 * @since 12.04.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class BankIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private BankRepository bankRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private BankEntity savedBank;

    @Before
    public void setup() {
        bankRepository.deleteAll();

        savedBank = new BankEntity();
        savedBank.setBic("bic");
        savedBank = bankRepository.save(savedBank);
    }

    private ParameterizedTypeReference<RestPageImpl<Bank>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<Bank>>() {
        };
    }

    @Test
    public void getBank() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .get(Bank.class)
                .andExpectSafe(status(Bank.class).isOk())
                .andExpectBodySafe(bank -> {
                    assertThat(bank.getId(), is(savedBank.getId()));
                    assertThat(bank.getBic(), is(savedBank.getBic()));
                });
    }

    @Test
    public void getBank_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .get(Bank.class)
                .andExpectSafe(status(Bank.class).is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getBankWithDeletedFlag() throws Exception {
        savedBank.setDeleted(true);
        savedBank = bankRepository.save(savedBank);

        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .get(Bank.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getBankNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", UNKNOWN_ID)
                .get(Bank.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedBank.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/banks")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void list_with_pageable() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks").param("page", 1)
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    @Test
    public void listEmpty() throws Exception {
        bankRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/banks")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    @Test
    public void deleteBankNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", UNKNOWN_ID)
                .delete()
                .andExpect(status().isNotFound());
    }

    @Test
    public void deleteBank() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .delete()
                .andExpect(status().isNoContent());
        assertTrue(bankRepository.findOne(savedBank.getId()).isDeleted());
    }

    @Test
    public void deleteBank_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .delete()
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void createBank() throws Exception {
        String newBic = "newbic";
        Bank newBank = new Bank();
        newBank.setBic(newBic);

        mockRest.init()
                .path("/dictionaries/banks/")
                .post(newBank, Bank.class)
                .andExpectSafe(status(Bank.class).isCreated())
                .andExpectSafe(header(Bank.class).location(containsString("/banks/")))
                .andExpectBodySafe(bank -> assertThat(bank.getBic(), is(newBic)));
    }

    @Test
    public void createBank_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/banks/")
                .post(new Bank(), Bank.class)
                .andExpectSafe(status(Bank.class).is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void editBankNotFound() throws Exception {
        String newBic = "newbic";
        Bank newBank = new Bank();
        newBank.setBic(newBic);

        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", UNKNOWN_ID)
                .put(newBank, Bank.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void editBank() throws Exception {
        String newBic = "newbic";
        Bank newBank = new Bank();
        newBank.setBic(newBic);

        mockRest.init()
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .put(newBank, Bank.class)
                .andExpectSafe(status(Bank.class).isOk())
                .andExpectBodySafe(bank -> assertThat(bank.getBic(), is(newBic)))
                .andExpectBodySafe(bank -> assertTrue(bank.isChangedByHand()));
    }

    @Test
    public void editBank_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/banks/{id}")
                .variable("id", savedBank.getId())
                .put(new Bank(), Bank.class)
                .andExpectSafe(status(Bank.class).is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void replicationBankSuccess() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks/replication")
                .setTimeoutInSeconds(50)
                .post()
                .andExpect(status().isNoContent());
    }

    @Test
    public void replicationBank_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/banks/replication")
                .setTimeoutInSeconds(50)
                .post()
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void findByBic() throws Exception {
        createListBank();

        mockRest.init()
                .path("/dictionaries/banks").param("bic", "BiC")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(3)));
    }

    @Test
    public void findByName() throws Exception {
        createListBank();

        mockRest.init()
                .path("/dictionaries/banks").param("name", "1")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(2)));
    }

    @Test
    public void findByEmptyBicAndName() throws Exception {
        createListBank();

        mockRest.init()
                .path("/dictionaries/banks").param("bic", "").param("name", "")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(5)));
    }

    @Test
    public void findByBicAndName() throws Exception {
        createListBank();

        mockRest.init()
                .path("/dictionaries/banks").param("bic", "bic").param("name", "1")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)));
    }

    @Test
    public void findByBicAndName_Empty() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks").param("bic", "oo").param("name", "name_51")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    private void createListBank() {
        bankRepository.deleteAll();

        BankEntity bank = new BankEntity("name_1", "shortName_1", "bic_1", "bicRcc_1", "swift_1", "description_1", "RUS", "corrAccount_1", "address_1", "", true, false);
        bankRepository.save(bank);

        bank = new BankEntity("name_2", "shortName_2", "bic_2", "bicRcc_2", "swift_2", "description_2", "RUS", "corrAccount_2", "address_2", "Гай Юлий Цезарь 15.03.45 12:00:00", true, false);
        bankRepository.save(bank);

        bank = new BankEntity("name_3", "shortName_3", "bic_3", "bicRcc_3", "swift_3", "description_3", "RUS", "corrAccount_3", "address_3", "", true, false);
        bankRepository.save(bank);

        bank = new BankEntity("name_4", "shortName_4", "Z_3", "bicRcc_4", "swift_4", "description_4", "RUS", "corrAccount_4", "address_4", "", true, false);
        bankRepository.save(bank);

        bank = new BankEntity("name_51", "shortName_5", "Z_4", "bicRcc_5", "swift_5", "description_5", "RUS", "corrAccount_5", "address_5", "", true, false);
        bankRepository.save(bank);
    }
}
