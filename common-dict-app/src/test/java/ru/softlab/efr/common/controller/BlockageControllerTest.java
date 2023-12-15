package ru.softlab.efr.common.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.StreamUtils;
import org.springframework.web.context.WebApplicationContext;
import ru.softlab.efr.common.config.TestApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRq;
import ru.softlab.efr.common.dict.exchange.model.PersonnelData;
import ru.softlab.efr.common.utils.TestUtils;
import ru.softlab.efr.services.authorization.PrincipalDataSerializer;


import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestApplicationConfig.class)
public class BlockageControllerTest {
    private static final String POST_BLOCKAGE_CHECK = "/dictionaries/blockages/check";
    private static final String GET_BLOCKAGE_STATUS = "/dictionaries/blockages/status";
    private static final String GET_BLOCKAGE_UPDATE = "/dictionaries/blockages/update";
    private static final String POST_BLOCKAGE_UPLOAD = "/dictionaries/blockages/update";


    private static final Resource INPUT_STREAM = new ClassPathResource("blockages_example.xml");
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
    public void shouldBeOkCheckStatus() throws Exception {
        mockMvc.perform(get(GET_BLOCKAGE_STATUS)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    //@Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void shouldBeOkUpdateFromDatabase() throws Exception {
        mockMvc.perform(get(GET_BLOCKAGE_UPDATE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", is("Процесс обновления справочника запущен")));

        mockMvc.perform(get(GET_BLOCKAGE_STATUS)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", containsString("(SUCCESS) Операция обновления справочника BLOCKAGE завершена")));

        CheckBlockagesRq checkRequest = new CheckBlockagesRq();
        checkRequest.addCitizensItem(new PersonnelData("test-id123", null, null, null, null, "1410", "400044899"));

        mockMvc.perform(post(POST_BLOCKAGE_CHECK)
                .content(TestUtils.convertObjectToJson(checkRequest))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens", hasSize(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[0].id", is("test-id123")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[0].isBlock", is(true)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[0].additionalInf", is("Count of found blockages by passportSeries+passportNumber: 1")));
    }

    @Test
    //@Sql(value = "classpath:test-scripts.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void shouldBeOkUpdateFromTreeset() throws Exception {
        mockMvc.perform(get(GET_BLOCKAGE_UPDATE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", is("Процесс обновления справочника запущен")));

        mockMvc.perform(get(GET_BLOCKAGE_STATUS)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", containsString("(SUCCESS) Операция обновления справочника BLOCKAGE завершена")));

        CheckBlockagesRq checkRequest = new CheckBlockagesRq();
        checkRequest.addCitizensItem(new PersonnelData("test-id111", null, null, null, null, "4312", "123"));
        checkRequest.addCitizensItem(new PersonnelData("test-id112", null, null, null, null, "4123", "123"));
        checkRequest.addCitizensItem(new PersonnelData("test-id113", null, null, null, null, "4132", "1234"));
        checkRequest.addCitizensItem(new PersonnelData("test-id114", null, null, null, null, "1410", "400044899"));
        checkRequest.addCitizensItem(new PersonnelData("test-id115", null, null, null, null, "1410", "400044899"));
        checkRequest.addCitizensItem(new PersonnelData("test-id116", null, null, null, null, "1410", "400044899"));
        checkRequest.addCitizensItem(new PersonnelData("test-id117", null, null, null, null, "4312", "1234"));
        checkRequest.addCitizensItem(new PersonnelData("test-id118", null, null, null, null, "321", "1"));
        checkRequest.addCitizensItem(new PersonnelData("test-id119", null, null, null, null, "534", "1234"));
        checkRequest.addCitizensItem(new PersonnelData("test-id120", null, null, null, null, "1410", "1"));
        checkRequest.addCitizensItem(new PersonnelData("test-id121", null, null, null, null, "534", "1"));

        mockMvc.perform(post(POST_BLOCKAGE_CHECK)
                .content(TestUtils.convertObjectToJson(checkRequest))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens", hasSize(11)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.citizens[?(@.isBlock==true)].id", contains("test-id114","test-id115","test-id116")));
    }

    @Test
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void shouldBeOkUploadAttachment() throws Exception {
        MockMultipartFile multipartFile = new MockMultipartFile(
                "content", INPUT_STREAM.getFilename(), "text/plain",
                StreamUtils.copyToByteArray(INPUT_STREAM.getInputStream()));

        mockMvc.perform(MockMvcRequestBuilders.fileUpload(POST_BLOCKAGE_UPLOAD)
                .file(multipartFile))
                .andExpect(status().isOk());
    }


}
