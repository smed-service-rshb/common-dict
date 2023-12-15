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
import ru.softlab.efr.common.dict.exchange.model.Office;
import ru.softlab.efr.common.dict.model.OfficeEntity;
import ru.softlab.efr.common.dict.repositories.OfficeRepository;
import ru.softlab.efr.common.utilities.rest.RestPageImpl;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ru.softlab.efr.common.utilities.test.matchers.PageResultMatchers.pageContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * @author Plaksiy
 * @since 20.09.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class OfficeIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private OfficeRepository officeRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private OfficeEntity savedOffice;

    @Before
    public void setup() {
        officeRepository.deleteAll();

        savedOffice = new OfficeEntity();
        savedOffice.setSimpleName("simpleName");
        savedOffice = officeRepository.save(savedOffice);
    }

    private ParameterizedTypeReference<RestPageImpl<OfficeEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<OfficeEntity>>() {
        };
    }

    @Test
    public void getOffice() throws Exception {
        mockRest.init()
                .path("/dictionaries/offices/{id}")
                .variable("id", savedOffice.getId())
                .get(Office.class)
                .andExpectSafe(status(Office.class).isOk())
                .andExpectBodySafe(office -> {
                    assertThat(office.getId(), is(savedOffice.getId()));
                    assertThat(office.getSimpleName(), is(savedOffice.getSimpleName()));
                });
    }

    @Test
    public void getBranch_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/offices/{id}")
                .variable("id", savedOffice.getId())
                .get(Office.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getOfficeNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/{id}")
                .variable("id", UNKNOWN_ID)
                .get(Office.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/offices")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedOffice.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/offices")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        officeRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/offices")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }
}
