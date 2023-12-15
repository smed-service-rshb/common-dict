package ru.softlab.efr.common.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.softlab.efr.common.config.TestApplicationConfig;
import ru.softlab.efr.common.dict.model.CurrencyRate;
import ru.softlab.efr.common.dict.services.CurrencyRateService;
import ru.softlab.efr.common.utils.HttpUrlStreamHandler;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestApplicationConfig.class)
public class CurrencyRateServiceTest {

    @Autowired
    private CurrencyRateService currencyRateService;

    private static HttpUrlStreamHandler httpUrlStreamHandler;

    @BeforeClass
    public static void setupURLStreamHandlerFactory() {
        URLStreamHandlerFactory urlStreamHandlerFactory = mock(URLStreamHandlerFactory.class);
        URL.setURLStreamHandlerFactory(urlStreamHandlerFactory);
        httpUrlStreamHandler = new HttpUrlStreamHandler();
        given(urlStreamHandlerFactory.createURLStreamHandler("http")).willReturn(httpUrlStreamHandler);
    }

    @Before
    public void reset() {
        httpUrlStreamHandler.resetConnections();
    }

    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getPageCurrencyRatesSuccess() throws Exception {
        Page<CurrencyRate> all = currencyRateService.findAll(new PageRequest(0, 100));
        assertEquals(6, all.getTotalElements());
    }

    @Ignore
    @Test
    @Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void getCurrencyFromCbSuccess() throws Exception {

        String href = "http://www.cbr.ru/DailyInfoWebServ/DailyInfo.asmx";

        HttpURLConnection urlConnection = mock(HttpURLConnection.class);
        httpUrlStreamHandler.addConnection(new URL(href), urlConnection);
        given(urlConnection.getOutputStream()).willReturn(new ByteArrayOutputStream());
        given(urlConnection.getResponseCode()).willReturn(200);
        given(urlConnection.getInputStream()).willReturn(CurrencyRateServiceTest.class.getResourceAsStream("/dayly-rate-info-rs.xml"));

        CurrencyRate rate = currencyRateService.findActiveCurrencyRateByCurrencyId(2L);
        assertNull(rate.getEndDate());
        long oldRateId = rate.getId();
        currencyRateService.runUpdate();
        Page<CurrencyRate> all = currencyRateService.findAll(new PageRequest(0, 100));
        assertEquals(8, all.getTotalElements());
        rate = currencyRateService.findActiveCurrencyRateByCurrencyId(2L);
        assertEquals(LocalDate.now(), rate.getRate().getDate());
        assertEquals(BigDecimal.valueOf(35.99), rate.getRate().getValue());
        CurrencyRate updatedRate = currencyRateService.findCurrencyRateById(oldRateId);
        assertNotNull(updatedRate.getEndDate());
    }
}
