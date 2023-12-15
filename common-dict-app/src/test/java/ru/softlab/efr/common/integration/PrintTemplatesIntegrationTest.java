package ru.softlab.efr.common.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StreamUtils;
import ru.softlab.efr.common.config.TestDockerApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.PrintTemplate;
import ru.softlab.efr.common.dict.model.PrintTemplateEntity;
import ru.softlab.efr.common.dict.repositories.PrintTemplateRepository;
import ru.softlab.efr.common.dict.services.PrintTemplateService;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.infrastructure.transport.rest.MockRest;
import ru.softlab.efr.test.infrastructure.transport.rest.ResultActions;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.*;

/**
 * Интергационные тесты шаблонов печатных форм
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class PrintTemplatesIntegrationTest extends IntegrationTestBase {
    private static final Resource INPUT_STREAM = new ClassPathResource("hibernate.properties");
    private static final Resource INPUT_STREAM2 = new ClassPathResource("permissions.properties");

    private static final String UNKNOWN_TYPE = "unknown-template-type";

    @Autowired
    private PrintTemplateRepository repository;

    @Autowired
    private PrintTemplateService printTemplateService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRestRule;

    private PrintTemplateEntity savedPrintTemplate;

    @Before
    public void setup() throws Exception {
        repository.deleteAll();

        savedPrintTemplate = printTemplateService.create(
                new PrintTemplateEntity("saved-type", 10, "saved-file-name"),
                StreamUtils.copyToByteArray(INPUT_STREAM.getInputStream()));
    }

    private ResultActions<PrintTemplate> createGetPrintTemplateRequest(String type, Right... rights) throws Exception {
        return getMockRest(rights)
                .path("/dictionaries/print-templates/{type}")
                .variable("type", type)
                .get(PrintTemplate.class);
    }


    @Test
    public void getPrintTemplate_success() throws Exception {
        createGetPrintTemplateRequest(savedPrintTemplate.getType())
                .andExpectSafe(status(PrintTemplate.class).isOk())
                .andExpectBodySafe(response -> {
                    assertThat(response.getCopiesNumber(), is(savedPrintTemplate.getCopiesNumber()));
                    assertThat(response.getType(), is(savedPrintTemplate.getType()));
                    assertThat(response.getFileName(), is(savedPrintTemplate.getFilename()));
                });
    }

    @Test
    public void getPrintTemplate_notFound() throws Exception {
        createGetPrintTemplateRequest(UNKNOWN_TYPE)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getPrintTemplate_forbidden() throws Exception {
        createGetPrintTemplateRequest(savedPrintTemplate.getType(), Right.EDIT_SYSTEM_DICTIONARIES)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    private ResultActions<byte[]> createGetPrintTemplateContentRequest(String type, Right... rights) throws Exception {
        return getMockRest(rights)
                .path("/dictionaries/print-templates/{type}/content")
                .variable("type", type)
                .get(byte[].class);
    }

    @Test
    public void getPrintTemplateContent_success() throws Exception {
        createGetPrintTemplateContentRequest(savedPrintTemplate.getType())
                .andExpectSafe(status(byte[].class).isOk())
                .andExpect(header().contentLength(is(INPUT_STREAM.contentLength())))
                .andExpect(header().contentType(is(MediaType.APPLICATION_OCTET_STREAM)))
                .andExpect(content().body(is(StreamUtils.copyToByteArray(INPUT_STREAM.getInputStream()))))
        ;
    }

    @Test
    public void getPrintTemplateContent_notFound() throws Exception {
        createGetPrintTemplateContentRequest(UNKNOWN_TYPE)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getPrintTemplateContent_forbidden() throws Exception {
        createGetPrintTemplateContentRequest(savedPrintTemplate.getType(), Right.EDIT_SYSTEM_DICTIONARIES)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    private ResultActions<List<PrintTemplate>> createListPrintTemplatesRequest(Right... rights) throws Exception {
        return getMockRest(rights)
                .path("/dictionaries/print-templates")
                .get(listResult());
    }

    @Test
    public void listPrintTemplates_success() throws Exception {
        createListPrintTemplatesRequest()
                .andExpectSafe(status(listResult()).isOk())
                .andExpectBodySafe(response -> assertThat(response, hasSize(1)))
                .andExpectBodySafe(response -> assertThat(response, hasItem(hasProperty("type", is(savedPrintTemplate.getType())))))
                .andExpectBodySafe(response -> assertThat(response, hasItem(hasProperty("copiesNumber", is(savedPrintTemplate.getCopiesNumber())))))
                .andExpectBodySafe(response -> assertThat(response, hasItem(hasProperty("fileName", is(savedPrintTemplate.getFilename())))))
        ;

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));
    }

    @Test
    public void listPrintTemplates_empty() throws Exception {
        repository.deleteAll();
        createListPrintTemplatesRequest()
                .andExpectSafe(status(listResult()).isOk())
                .andExpectBodySafe(response -> assertThat(response, is(empty())));

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates, empty());
    }

    @Test
    public void listPrintTemplates_forbidden() throws Exception {
        createListPrintTemplatesRequest(Right.EDIT_SYSTEM_DICTIONARIES)
                .andExpect(status().is(HttpStatus.FORBIDDEN));

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));
    }

    private ResultActions<String> createEditPrintTemplateRequest(String type, Integer copiesNumber, Resource content, Right... rights) throws Exception {

        MockRest mockRest = getMockRest(rights)
                .path("/dictionaries/print-templates/{type}")
                .variable("type", type);
        if (copiesNumber != null) {
            mockRest.param("copiesNumber", copiesNumber);
        }

        if (content == null) {
            return mockRest
                    .post(String.class);
        }
        MultiValueMap<String, Object> multipartMap = new LinkedMultiValueMap<>();
        multipartMap.add("content", content);
        return mockRest
                .post(multipartMap, String.class);
    }

    @Test
    public void editPrintTemplates_success() throws Exception {
        Integer copiesNumber = 1234;
        String type = savedPrintTemplate.getType();
        String response = createEditPrintTemplateRequest(type, copiesNumber, INPUT_STREAM2)
                .andExpectSafe(status(String.class).isOk())
                .andReturnBody();
        PrintTemplate printTemplateResponse = toJson(response, PrintTemplate.class);

        assertThat(printTemplateResponse.getType(), is(type));
        assertThat(printTemplateResponse.getCopiesNumber(), is(copiesNumber));
        assertThat(printTemplateResponse.getFileName(), is(INPUT_STREAM2.getFilename()));

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));

        PrintTemplateEntity savedEntity = printTemplateService.findByType(type);
        assertThat(savedEntity.getType(), is(type));
        assertThat(savedEntity.getCopiesNumber(), is(copiesNumber));
        assertThat(savedEntity.getFilename(), is(INPUT_STREAM2.getFilename()));

        byte[] savedContent = repository.getContent(type);
        assertThat(savedContent, is(StreamUtils.copyToByteArray(INPUT_STREAM2.getInputStream())));
    }

    @Test
    public void editPrintTemplates_withoutContent_success() throws Exception {
        Integer copiesNumber = 1234;
        String type = savedPrintTemplate.getType();

        String response = createEditPrintTemplateRequest(type, copiesNumber, null)
                .andExpectSafe(status(String.class).isOk())
                .andReturnBody();
        PrintTemplate printTemplateResponse = toJson(response, PrintTemplate.class);

        assertThat(printTemplateResponse.getType(), is(type));
        assertThat(printTemplateResponse.getCopiesNumber(), is(copiesNumber));
        assertThat(printTemplateResponse.getFileName(), is(savedPrintTemplate.getFilename()));

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));

        PrintTemplateEntity savedEntity = printTemplateService.findByType(type);
        assertThat(savedEntity.getType(), is(type));
        assertThat(savedEntity.getCopiesNumber(), is(copiesNumber));
        assertThat(savedEntity.getFilename(), is(savedPrintTemplate.getFilename()));

        byte[] savedContent = repository.getContent(type);
        assertThat(savedContent, is(StreamUtils.copyToByteArray(INPUT_STREAM.getInputStream())));
    }

    @Test
    public void editPrintTemplate_badRequest() throws Exception {
        String type = savedPrintTemplate.getType();
        createEditPrintTemplateRequest(type, null, INPUT_STREAM2)
                .andExpect(status().isBadRequest())
        ;

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));

        PrintTemplateEntity savedEntity = printTemplateService.findByType(type);
        assertThat(savedEntity.getType(), is(type));
        assertThat(savedEntity.getCopiesNumber(), is(savedPrintTemplate.getCopiesNumber()));

        byte[] savedContent = repository.getContent(type);
        assertThat(savedContent, is(StreamUtils.copyToByteArray(INPUT_STREAM.getInputStream())));
    }

    @Test
    public void editPrintTemplates_notFound() throws Exception {
        createEditPrintTemplateRequest(UNKNOWN_TYPE, 12, INPUT_STREAM)
                .andExpect(status().isNotFound());

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));
    }

    @Test
    public void editPrintTemplates_forbidden() throws Exception {
        String type = savedPrintTemplate.getType();

        createEditPrintTemplateRequest(type, 122, INPUT_STREAM, Right.EDIT_SYSTEM_DICTIONARIES)
                .andExpect(status().is(HttpStatus.FORBIDDEN));

        List<PrintTemplateEntity> templates = repository.findAll();
        assertThat(templates.size(), is(1));
    }

    private ParameterizedTypeReference<List<PrintTemplate>> listResult() {
        return new ParameterizedTypeReference<List<PrintTemplate>>() {
        };
    }

    private MockRest getMockRest(Right[] rights) {
        MockRest mockRest;
        if (rights.length == 0) {
            mockRest = this.mockRestRule.init();
        } else {
            mockRest = this.mockRestRule.init(rights);
        }
        return mockRest;
    }

    private <T> T toJson(String data, Class<T> aClass) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(data, aClass);
    }
}
