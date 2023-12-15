package ru.softlab.efr.common.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.StreamUtils;
import org.springframework.web.context.WebApplicationContext;
import ru.softlab.efr.common.config.TestApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.CheckBlockagesRq;
import ru.softlab.efr.common.dict.exchange.model.CheckInvalidIdentityDocRq;
import ru.softlab.efr.common.dict.exchange.model.IdentityDocRq;
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
public class InvalidIdentityDocControllerTest {
    private static final String POST_DOC_CHECK = "/dictionaries/invalididentitydoc/check";
    private static final String GET_DOC_STATUS = "/dictionaries/invalididentitydoc/status";
    private static final String GET_DOC_UPDATE = "/dictionaries/invalididentitydoc/update";


    private static final Resource INPUT_STREAM = new ClassPathResource("list_of_expired_passports.csv");
    private final PrincipalDataSerializer serializer = new PrincipalDataSerializer();

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }



    @Test
    @Sql(value = "classpath:test-scripts-invalid_identity_doc.sql", config = @SqlConfig(encoding = "UTF-8"))
    @Sql(value = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    public void shouldBeOkUpdateFromTreeset() throws Exception {
        mockMvc.perform(get(GET_DOC_UPDATE)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", is("Процесс обновления справочника запущен")));

        mockMvc.perform(get(GET_DOC_STATUS)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.status", containsString("(SUCCESS) Операция обновления справочника INVALID_IDENTITY_DOC завершена")));

        CheckInvalidIdentityDocRq checkRequest = new CheckInvalidIdentityDocRq();
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id111", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id112", 4312, 4312));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id113", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id114", 9704, 307537));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id115", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id116", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id117", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id118", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id119", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id120", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id121", 4312, 12345));
        checkRequest.addIdentityDocsItem(new IdentityDocRq("test-id122", 4312, 12345));


        ResultActions resultActions = mockMvc.perform(post(POST_DOC_CHECK)
                .content(TestUtils.convertObjectToJson(checkRequest))
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.resultList", hasSize(12)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.resultList[?(@.isInvalidIdentityDoc==true)].id", contains("test-id114")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.resultList[3].isInvalidIdentityDoc", is(true)));
                //.andExpect(MockMvcResultMatchers.jsonPath("$.resultList[?(@.isInvalidIdentityDoc==true)].id", is("test-id112")));

    }



}
