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
import ru.softlab.efr.common.dict.exchange.model.ExternalSystemError;
import ru.softlab.efr.common.dict.model.ExternalSystemErrorEntity;
import ru.softlab.efr.common.dict.repositories.ExternalSystemErrorRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
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
 * @since 13.09.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class ExternalSystemErrorIntegrationTest extends IntegrationTestBase {

    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private ExternalSystemErrorRepository externalSystemErrorRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private ExternalSystemErrorEntity savedExternalSystemError;

    @Before
    public void setup() {
        externalSystemErrorRepository.deleteAll();

        savedExternalSystemError = new ExternalSystemErrorEntity();
        savedExternalSystemError.setServiceName("serviceName");
        savedExternalSystemError = externalSystemErrorRepository.save(savedExternalSystemError);
    }

    private ParameterizedTypeReference<RestPageImpl<ExternalSystemErrorEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<ExternalSystemErrorEntity>>() {
        };
    }

    @Test
    public void getExternalSystemError() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .get(ExternalSystemError.class)
                .andExpectSafe(status(ExternalSystemError.class).isOk())
                .andExpectBodySafe(externalSystemError -> {
                    assertThat(externalSystemError.getId(), is(savedExternalSystemError.getId()));
                    assertThat(externalSystemError.getServiceName(), is(savedExternalSystemError.getServiceName()));
                });
    }

    @Test
    public void getExternalSystemError_forbidden() throws Exception {
        mockRest.init(Right.EDIT_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .get(ExternalSystemError.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getExternalSystemErrorNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", UNKNOWN_ID)
                .get(ExternalSystemError.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-system-errors")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedExternalSystemError.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-system-errors")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        externalSystemErrorRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/external-system-errors")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    @Test
    public void deleteExternalSystemErrorNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", UNKNOWN_ID)
                .delete()
                .andExpect(status().isNotFound());
    }

    @Test
    public void deleteExternalSystemError() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .delete()
                .andExpect(status().isNoContent());
    }

    @Test
    public void deleteExternalSystemError_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .delete()
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void createExternalSystemError() throws Exception {
        String serviceName = "serviceName_2";
        ExternalSystemError newExternalSystemError = new ExternalSystemError();
        newExternalSystemError.setServiceName(serviceName);

        mockRest.init()
                .path("/dictionaries/external-system-errors")
                .post(newExternalSystemError, ExternalSystemError.class)
                .andExpectSafe(status(ExternalSystemError.class).isCreated())
                .andExpectSafe(header(ExternalSystemError.class).location(containsString("/dictionaries/external-system-errors")))
                .andExpectBodySafe(externalSystemError -> assertThat(externalSystemError.getServiceName(), is(serviceName)));
    }

    @Test
    public void createExternalSystemError_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-system-errors")
                .post(new ExternalSystemError(), ExternalSystemError.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void editOuterSystemExternalSystemErrorNotFound() throws Exception {
        String serviceName = "serviceName_2";
        ExternalSystemError newExternalSystemError = new ExternalSystemError();
        newExternalSystemError.setServiceName(serviceName);

        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", UNKNOWN_ID)
                .put(newExternalSystemError, ExternalSystemError.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void editExternalSystemError() throws Exception {
        String serviceName = "serviceName_2";
        ExternalSystemError newExternalSystemError = new ExternalSystemError();
        newExternalSystemError.setServiceName(serviceName);

        mockRest.init()
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .put(newExternalSystemError, ExternalSystemError.class)
                .andExpectSafe(status(ExternalSystemError.class).isOk())
                .andExpectBodySafe(externalSystemError -> assertThat(externalSystemError.getServiceName(), is(serviceName)));
    }

    @Test
    public void editExternalSystemError_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-system-errors/{id}")
                .variable("id", savedExternalSystemError.getId())
                .put(new ExternalSystemError(), ExternalSystemError.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }
}
