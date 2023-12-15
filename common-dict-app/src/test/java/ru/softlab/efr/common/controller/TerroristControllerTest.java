package ru.softlab.efr.common.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import ru.softlab.efr.common.config.TestApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRq;
import ru.softlab.efr.common.dict.exchange.model.PersonnelData;
import ru.softlab.efr.common.utils.TestUtils;
import ru.softlab.efr.services.authorization.PrincipalDataSerializer;

import java.time.LocalDate;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestApplicationConfig.class)
public class TerroristControllerTest {
    private static final String POST_TERRORIST_CHECK = "/dictionaries/terrorist/check";
    private static final String GET_TERRORIST_STATUS = "/dictionaries/terrorist/status";
    private static final String GET_TERRORIST_UPDATE = "/dictionaries/terrorist/update";
    private static final String POST_BLOCKAGE_UPLOAD = "/dictionaries/terrorist/update";


    private static final Resource INPUT_STREAM = new ClassPathResource("22.03.2018.dbf");
    private final PrincipalDataSerializer serializer = new PrincipalDataSerializer();

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    //@Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void shouldBeOkUpdate() throws Exception {
        mockMvc.perform(get(GET_TERRORIST_UPDATE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", is("Процесс обновления справочника запущен")));

        mockMvc.perform(get(GET_TERRORIST_STATUS)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", containsString("(SUCCESS) Операция обновления справочника TERRORIST завершена")));

        CheckBlockagesRq checkRequest = new CheckBlockagesRq();
        checkRequest.addCitizensItem(new PersonnelData("test-id0011", "ЭKCTPEMИCTOB", "пИрБуДаг", "          зилданович         ", LocalDate.of(1988,1, 4), "8203", "701718"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0012", "ЭКСТРЕМИСТОВ", "ПИРБУДАГ", null, LocalDate.of(1988,1, 4), "8203", "701718"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0013", "ЭКСТРЕМИСТОВ", "ПИРБУДАГ", null, LocalDate.of(1988,1, 4), null, "701718"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0014", "ЭКСТРЕМИСТОВ", "ПИРБУДАГ", null, LocalDate.of(1988,1, 4), null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0015", "ЭКСТРЕМИСТОВ", "ПИРБУДАГ", null, null, null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0021", "ТЕРРОРИСТОВ", "НАБИ", "ЭЛЬМУРЗАЕВИЧ", LocalDate.of(1976,11,13), null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0022", "ТЕРРОРИСТОВ", "НАБИ", "ЭЛЬМУРЗАЕВИЧ", null, null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0023", "ТЕРРОРИСТОВ", "НАБИ", null, null, null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0031", "IVANOV", "IVAN", "IVANOVICH", LocalDate.of(1973,4,16), "8004", "986888"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0032", "IVANOV", "IVAN", "IVANOVICH", LocalDate.of(1973,4,16), null, null));

        checkRequest.addCitizensItem(new PersonnelData("test-id0041", "иванов", "иван", "иванович", LocalDate.of(1973,4,16), null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0042", " ИВАНОВ", "Иван", "Иванович", null, "1234", "123456"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0051", "Лось", "Александр", null, null, "1234", "123456"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0052", "Смирнов", "Павел", "Петрович", null, "1244", "123451"));
        checkRequest.addCitizensItem(new PersonnelData("test-id0053", "ШЕВЧЕНКО", "ИВАН", "ИГОРЕВИЧ", LocalDate.of(1991,3,25), null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0054", "ШЕВЧЕНКО", "ИВАН", "ЛЕОНИДОВИЧ", LocalDate.of(1991,3,25), null, null));
        checkRequest.addCitizensItem(new PersonnelData("test-id0061", "ШЕВЧЕНКО", "ИВАН", "ЛЕОНИДОВИЧ", LocalDate.of(1984,10,6), null, null));


        mockMvc.perform(post(POST_TERRORIST_CHECK)
                .content(TestUtils.convertObjectToJson(checkRequest))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                //.andExpect(MockMvcResultMatchers.jsonPath("$.citizens", hasSize(4)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[?(@.isTerrorist==false)].id",
                        contains("test-id0051",
                                "test-id0052",
                                "test-id0053",
                                "test-id0054")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[?(@.isTerrorist==true)].id",
                        contains("test-id0011",
                                "test-id0012",
                                "test-id0013",
                                "test-id0014",
                                "test-id0015",
                                "test-id0021",
                                "test-id0022",
                                "test-id0023",
                                "test-id0031",
                                "test-id0032",
                                "test-id0041",
                                "test-id0042",
                                "test-id0061")));

    }
}
