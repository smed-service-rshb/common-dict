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
import ru.softlab.efr.common.dict.exchange.model.CashSymbol;
import ru.softlab.efr.common.dict.model.CashSymbolEntity;
import ru.softlab.efr.common.dict.repositories.CashSymbolRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static ru.softlab.efr.common.utilities.test.matchers.PageResultMatchers.pageContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;


/**
 * Интеграционные тесты одновременно через http и jms
 *
 * @author bobkov
 * @since 30.07.2018
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class CashSymbolIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private CashSymbolRepository cashSymbolRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private ParameterizedTypeReference<RestPageImpl<CashSymbol>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<CashSymbol>>() {
        };
    }

    private CashSymbolEntity savedCashSymbol;

    @Before
    public void setup() {
        cashSymbolRepository.deleteAll();

        savedCashSymbol = new CashSymbolEntity();
        savedCashSymbol.setName("name");
        savedCashSymbol.setCode(123L);
        savedCashSymbol = cashSymbolRepository.save(savedCashSymbol);
    }

    @Test
    public void getCashSymbol() throws Exception {
        mockRest.init()
                .path("/dictionaries/cash-symbols/{id}")
                .variable("id", savedCashSymbol.getId())
                .get(CashSymbol.class)
                .andExpectSafe(status(CashSymbol.class).isOk())
                .andExpectBodySafe(cashSymbol -> {
                    assertThat(cashSymbol.getId(), is(savedCashSymbol.getId()));
                });
    }

    @Test
    public void getCashSymbol_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/cash-symbols/{id}")
                .variable("id", savedCashSymbol.getId())
                .get(CashSymbol.class)
                .andExpectSafe(status(CashSymbol.class).is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getCashSymbolNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/cash-symbols/{id}")
                .variable("id", UNKNOWN_ID)
                .get(CashSymbol.class)
                .andExpectSafe(status(CashSymbol.class).isNotFound());
    }

    @Test
    public void getCashSymbolByCode() throws Exception {
        mockRest.init()
                .path("/dictionaries/cash-symbols")
                .query("code=" + savedCashSymbol.getCode())
                .get(CashSymbol.class)
                .andExpectSafe(status(CashSymbol.class).isOk())
                .andExpectBodySafe(cashSymbol -> {
                    assertThat(cashSymbol.getId(), is(savedCashSymbol.getId()));
                    assertThat(cashSymbol.getCode(), is(savedCashSymbol.getCode()));
                    assertThat(cashSymbol.getName(), is(savedCashSymbol.getName()));
                });
    }

    @Test
    public void getCashSymbolByCode_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/branches")
                .query("code=" + savedCashSymbol.getCode())
                .get(CashSymbol.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getCashSymbolByCodeNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches")
                .query("code=NOT_FOUND")
                .get(CashSymbol.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getCashSymbolsList() throws Exception {
        mockRest.init()
                .path("/dictionaries/cash-symbols")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(notNullValue()));
    }

    @Test
    public void getCashSymbolsList_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/cash-symbols")
                .get(restPage())
                .andExpectSafe(status(restPage()).is(HttpStatus.FORBIDDEN));
    }
}