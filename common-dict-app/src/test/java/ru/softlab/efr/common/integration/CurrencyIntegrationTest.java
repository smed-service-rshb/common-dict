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
import ru.softlab.efr.common.dict.exchange.model.Currency;
import ru.softlab.efr.common.dict.model.CurrencyEntity;
import ru.softlab.efr.common.dict.repositories.CurrencyRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static ru.softlab.efr.common.utilities.test.matchers.PageResultMatchers.pageContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.header;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * @author Plaksiy
 * @since 30.08.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class CurrencyIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    private final String LITERAL_ISO_USD = "USD";
    private final Long DIGITAL_ISO_USD = 840L;

    private final String LITERAL_ISO_RUB = "RUB";
    private final Long DIGITAL_ISO_RUB = 643L;

    private final String LITERAL_ISO_EUR = "EUR";
    private final Long DIGITAL_ISO_EUR = 978L;

    @Autowired
    private CurrencyRepository currencyRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private CurrencyEntity savedCurrencyRub;

    @Before
    public void setup() {
        currencyRepository.deleteAll();

        CurrencyEntity savedCurrencyUsd = new CurrencyEntity();
        savedCurrencyUsd.setDigitalISO(DIGITAL_ISO_USD);
        savedCurrencyUsd.setLiteralISO(LITERAL_ISO_USD);
        currencyRepository.save(savedCurrencyUsd);

        savedCurrencyRub = new CurrencyEntity();
        savedCurrencyRub.setDigitalISO(DIGITAL_ISO_RUB);
        savedCurrencyRub.setLiteralISO(LITERAL_ISO_RUB);
        savedCurrencyRub = currencyRepository.save(savedCurrencyRub);
    }

    private ParameterizedTypeReference<RestPageImpl<CurrencyEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<CurrencyEntity>>() {
        };
    }

    @Test
    public void getCurrency() throws Exception {
        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", savedCurrencyRub.getId())
                .get(Currency.class)
                .andExpectSafe(status(Currency.class).isOk())
                .andExpectBodySafe(currency -> {
                    assertThat(currency.getId(), is(savedCurrencyRub.getId()));
                    assertThat(currency.getDigitalISO(), is(savedCurrencyRub.getDigitalISO()));
                    assertThat(currency.getLiteralISO(), is(savedCurrencyRub.getLiteralISO()));
                });
    }

    @Test
    public void getCurrencyNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", UNKNOWN_ID)
                .get(Currency.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/currencies")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(2)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedCurrencyRub.getId())))));
    }

    @Test
    public void listEmpty() throws Exception {
        currencyRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/currencies")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    @Test
    public void deleteCurrencyNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", UNKNOWN_ID)
                .delete()
                .andExpect(status().isNotFound());
    }

    @Test
    public void deleteCurrency() throws Exception {
        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", savedCurrencyRub.getId())
                .delete()
                .andExpect(status().isNoContent());
    }

    @Test
    public void createCurrency() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_EUR);
        newCurrency.setLiteralISO(LITERAL_ISO_EUR);

        mockRest.init()
                .path("/dictionaries/currencies")
                .post(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).isCreated())
                .andExpectSafe(header(Currency.class).location(containsString("/dictionaries/currencies")))
                .andExpectBodySafe(currency -> {
                    assertThat(currency.getDigitalISO(), is(DIGITAL_ISO_EUR));
                    assertThat(currency.getLiteralISO(), is(LITERAL_ISO_EUR));
                });

    }

    @Test
    public void whenCreateCurrencyWithExistingDigitalISO_failWithConflict() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_USD);
        newCurrency.setLiteralISO(LITERAL_ISO_EUR);

        mockRest.init()
                .path("/dictionaries/currencies")
                .post(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).is(HttpStatus.CONFLICT));
    }

    @Test
    public void whenCreateCurrencyWithExistingLiteralISO_failWithConflict() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_EUR);
        newCurrency.setLiteralISO(LITERAL_ISO_USD);

        mockRest.init()
                .path("/dictionaries/currencies")
                .post(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).is(HttpStatus.CONFLICT));
    }

    @Test
    public void editCurrencyNotFound() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_RUB);
        newCurrency.setLiteralISO(LITERAL_ISO_RUB);

        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", UNKNOWN_ID)
                .put(newCurrency, Currency.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void editCurrency_success() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_RUB);
        newCurrency.setLiteralISO(LITERAL_ISO_RUB);

        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", savedCurrencyRub.getId())
                .put(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).isOk())
                .andExpectBodySafe(currency -> {
                    assertThat(currency.getDigitalISO(), is(DIGITAL_ISO_RUB));
                    assertThat(currency.getLiteralISO(), is(LITERAL_ISO_RUB));
                });
    }

    @Test
    public void whenEditCurrencyWithExistingDigitalISO_failWithConflict() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_USD);
        newCurrency.setLiteralISO(LITERAL_ISO_RUB);

        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", savedCurrencyRub.getId())
                .put(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).is(HttpStatus.CONFLICT));
    }

    @Test
    public void whenEditCurrencyWithExistingLiteralISO_failWithConflict() throws Exception {
        Currency newCurrency = new Currency();
        newCurrency.setDigitalISO(DIGITAL_ISO_RUB);
        newCurrency.setLiteralISO(LITERAL_ISO_USD);

        mockRest.init()
                .path("/dictionaries/currencies/{id}")
                .variable("id", savedCurrencyRub.getId())
                .put(newCurrency, Currency.class)
                .andExpectSafe(status(Currency.class).is(HttpStatus.CONFLICT));
    }
}
