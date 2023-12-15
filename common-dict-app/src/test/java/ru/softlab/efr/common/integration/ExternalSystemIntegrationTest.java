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
import ru.softlab.efr.common.dict.exchange.model.ExternalSystem;
import ru.softlab.efr.common.dict.model.ExternalSystemEntity;
import ru.softlab.efr.common.dict.repositories.ExternalSystemRepository;
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
public class ExternalSystemIntegrationTest extends IntegrationTestBase {

    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private ExternalSystemRepository externalSystemRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private ExternalSystemEntity savedExternalSystem;

    @Before
    public void setup() {
        externalSystemRepository.deleteAll();

        savedExternalSystem = new ExternalSystemEntity();
        savedExternalSystem.setName("name");
        savedExternalSystem.setSystemType("BISQUIT");
        savedExternalSystem.setSystemId("BISQUIT:6300");
        savedExternalSystem = externalSystemRepository.save(savedExternalSystem);
    }

    private ParameterizedTypeReference<RestPageImpl<ExternalSystemEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<ExternalSystemEntity>>() {
        };
    }

    @Test
    public void getExternalSystem() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .get(ExternalSystem.class)
                .andExpectSafe(status(ExternalSystem.class).isOk())
                .andExpectBodySafe(externalSystem -> {
                    assertThat(externalSystem.getId(), is(savedExternalSystem.getId()));
                    assertThat(externalSystem.getName(), is(savedExternalSystem.getName()));
                });
    }

    @Test
    public void getExternalSystem_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .get(ExternalSystem.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getExternalSystemNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", UNKNOWN_ID)
                .get(ExternalSystem.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getExternalSystemBySystemId() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems")
                .query("systemId=" + savedExternalSystem.getSystemId())
                .get(ExternalSystem.class)
                .andExpectSafe(status(ExternalSystem.class).isOk())
                .andExpectBodySafe(externalSystem -> {
                    assertThat(externalSystem.getId(), is(savedExternalSystem.getId()));
                    assertThat(externalSystem.getName(), is(savedExternalSystem.getName()));
                });
    }

    @Test
    public void getExternalSystemBySystemId_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems")
                .query("systemId=" + savedExternalSystem.getSystemId())
                .variable("id", savedExternalSystem.getId())
                .get(ExternalSystem.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getExternalSystemBySystemIdNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems")
                .query("systemId=NOT_FOUND")
                .get(ExternalSystem.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedExternalSystem.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        externalSystemRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/external-systems")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

    @Test
    public void deleteExternalSystemNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", UNKNOWN_ID)
                .delete()
                .andExpect(status().isNotFound());
    }

    @Test
    public void deleteExternalSystem() throws Exception {
        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .delete()
                .andExpect(status().isNoContent());
    }

    @Test
    public void deleteExternalSystem_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .delete()
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void createExternalSystem() throws Exception {
        String name = "name_2";
        ExternalSystem newExternalSystem = new ExternalSystem();
        newExternalSystem.setName(name);

        mockRest.init()
                .path("/dictionaries/external-systems")
                .post(newExternalSystem, ExternalSystem.class)
                .andExpectSafe(status(ExternalSystem.class).isCreated())
                .andExpectSafe(header(ExternalSystem.class).location(containsString("/dictionaries/external-systems")))
                .andExpectBodySafe(externalSystem -> assertThat(externalSystem.getName(), is(name)));

    }

    @Test
    public void createExternalSystem_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems")
                .post(new ExternalSystem(), ExternalSystem.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void editExternalSystemNotFound() throws Exception {
        String name = "name_2";
        ExternalSystem newExternalSystem = new ExternalSystem();
        newExternalSystem.setName(name);

        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", UNKNOWN_ID)
                .put(newExternalSystem, ExternalSystem.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void editExternalSystem() throws Exception {
        String name = "name_2";
        ExternalSystem newExternalSystem = new ExternalSystem();
        newExternalSystem.setName(name);

        mockRest.init()
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .put(newExternalSystem, ExternalSystem.class)
                .andExpectSafe(status(ExternalSystem.class).isOk())
                .andExpectBodySafe(externalSystem -> assertThat(externalSystem.getName(), is(name)));
    }

    @Test
    public void editExternalSystem_forbidden() throws Exception {
        mockRest.init(Right.VIEW_BUSINESS_DICTIONARIES)
                .path("/dictionaries/external-systems/{id}")
                .variable("id", savedExternalSystem.getId())
                .put(new ExternalSystem(), ExternalSystem.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }
}
