package ru.softlab.efr.common.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.softlab.efr.common.config.TestApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.CalculationType;
import ru.softlab.efr.common.dict.exchange.model.CurrencyRateData;
import ru.softlab.efr.common.dict.exchange.model.CurrencyRateSettings;
import ru.softlab.efr.common.utils.TestUtils;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestApplicationConfig.class)
public class CurrencyRateControllerTest {

    private static final String GET_CB_CURRENCY_RATES = "/dictionaries/currency/rate/cb/?literalIso={literalIso}&startDate={startDate}&endDate={endDate}";
    private static final String GET_ACTIVE_CURRENCY_RATE = "/dictionaries/currency/rate/active/?currencyId={currencyId}";
    private static final String GET_CURRENCY_RATE_PAGE = "/dictionaries/rates/";
    private static final String POST_CURRENCY_RATE_PAGE = "/dictionaries/rates/";
    private static final String GET_CURRENCY_RATE_SETTING_PAGE = "/dictionaries/rates/setting";
    private static final String POST_CURRENCY_RATE_SETTING = "/dictionaries/rates/setting";
    private static final String GET_CURRENCY_RATE_BY_ID = "/dictionaries/rate/{id}";
    private static final String PUT_CURRENCY_RATE_BY_ID = "/dictionaries/rate/{id}";

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    /**
     * Тест сервиса GET /dictionaries/currency/rate/cb/
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRatesByIsoAndDateBetweenSuccess() throws Exception {
        String startDate = "12.02.2019";
        String endDate = "13.02.2019";

        mockMvc.perform(get(GET_CB_CURRENCY_RATES, "USD", startDate, endDate)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates", hasSize(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[0].date", is("12.02.2019")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[0].rate", is(0.1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[1].date", is("13.02.2019")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[1].rate", is(0.2)))
        ;

        mockMvc.perform(get(GET_CB_CURRENCY_RATES, "USD", startDate, startDate)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates", hasSize(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[0].rate", is(0.1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rates[0].date", is("12.02.2019")))
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/currency/rate/cb/  при указании iso валюты которой нет в справочнике валют
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRateByIdNotFoundEmptyCurrency() throws Exception {
        String startDate = "12.02.2019";
        String endDate = "13.02.2019";
        mockMvc.perform(get(GET_CB_CURRENCY_RATES, "BYB", startDate, endDate)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/currency/rate/cb/ за указанные даты курсы не найдены
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRateByIdNotFoundEmptyRate() throws Exception {
        String startDate = "12.02.2012";
        String endDate = "13.02.2012";
        mockMvc.perform(get(GET_CB_CURRENCY_RATES, "USD", startDate, endDate)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/currency/rate/active
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getActiveCurrencyRateByIdSuccess() throws Exception {
        mockMvc.perform(get(GET_ACTIVE_CURRENCY_RATE, 1)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rate", is(1.3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.innerRate", is(1.2)))
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/currency/rate/active
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getActiveCurrencyRateByIdNotFound() throws Exception {
        mockMvc.perform(get(GET_ACTIVE_CURRENCY_RATE, 8)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/rates/list
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRateListSuccess() throws Exception {
        mockMvc.perform(get(GET_CURRENCY_RATE_PAGE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", hasSize(6)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].currencyIso", is("USD")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].currencyId", is(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].rate", is(0.2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].innerRate", is(1.0)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].startDate", is("13.02.2019 10:34:12")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].endDate").isEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].edited", is(false)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].currencyIso", is("RUB")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].rate", is(1.3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].innerRate", is(1.2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].startDate", is("13.02.2019 10:34:11")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].endDate").isEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[1].edited", is(false)))
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/rate/{id}
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRateByIdSuccess() throws Exception {
        mockMvc.perform(get(GET_CURRENCY_RATE_BY_ID, 2)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rate", is(1.3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.innerRate", is(1.1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate", is("13.02.2019 00:00:12")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate", is("13.02.2019 10:34:10")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.edited", is(false)))
        ;
    }

    /**
     * Тест сервиса GET /dictionaries/rate/{id}
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyRateByIdNotFound() throws Exception {
        mockMvc.perform(get(GET_CURRENCY_RATE_BY_ID, 10)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
        ;
    }

    /**
     * Тест сервиса PUT /dictionaries/rate/{id}
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void updateCurrencyRateByIdSuccess() throws Exception {
        CurrencyRateData data = new CurrencyRateData();
        data.setInnerRate(BigDecimal.valueOf(33));
        mockMvc.perform(put(PUT_CURRENCY_RATE_BY_ID, 2)
                .content(TestUtils.convertObjectToJson(data))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", is(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.innerRate", is(33)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate", is("13.02.2019 00:00:12")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate", is("13.02.2019 10:34:10")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.edited", is(true)))
        ;
    }


    /**
     * Тест сервиса POST /dictionaries/rates
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void createCurrencyRateSuccess() throws Exception {
        CurrencyRateData data = new CurrencyRateData();
        data.setCurrencyId(1L);
        data.setRate(BigDecimal.valueOf(55));
        data.setInnerRate(BigDecimal.valueOf(33));
        data.setEdited(false);
        mockMvc.perform(get(GET_CURRENCY_RATE_BY_ID, 1)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rate", is(1.3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.innerRate", is(1.2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate", is("13.02.2019 10:34:11")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").isEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.edited", is(false)))
        ;
        mockMvc.perform(post(POST_CURRENCY_RATE_PAGE)
                .content(TestUtils.convertObjectToJson(data))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
        ;
        mockMvc.perform(get(GET_CURRENCY_RATE_BY_ID, 1)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.rate", is(1.3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.innerRate", is(1.2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.startDate", is("13.02.2019 10:34:11")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.endDate").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$.edited", is(false)));
        mockMvc.perform(get(GET_CURRENCY_RATE_PAGE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", hasSize(7)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].currencyIso", is("RUB")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].currencyId", is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].innerRate", is(33.0)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].endDate").isEmpty())
        ;
    }

    /**
     * Тест сервиса POST /dictionaries/rates/setting
     */
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void postCurrencyRateSettingSuccess() throws Exception {
        CurrencyRateSettings currencyRateSettings = new CurrencyRateSettings();
        currencyRateSettings.setAdditionalPercent(BigDecimal.TEN);
        currencyRateSettings.setCalculationType(CalculationType.CB_RF_WITH_PERCENT);
        mockMvc.perform(post(POST_CURRENCY_RATE_SETTING)
                .content(TestUtils.convertObjectToJson(currencyRateSettings))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
        ;

        mockMvc.perform(get(GET_CURRENCY_RATE_SETTING_PAGE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.calculationType", is("CB_RF_WITH_PERCENT")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.additionalPercent", is(10)))
        ;
    }
}
