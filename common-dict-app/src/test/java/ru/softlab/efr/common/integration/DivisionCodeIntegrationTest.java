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
import ru.softlab.efr.common.dict.exchange.model.DivisionCode;
import ru.softlab.efr.common.dict.model.BranchEntity;
import ru.softlab.efr.common.dict.model.DivisionCodeEntity;
import ru.softlab.efr.common.dict.repositories.DivisionCodeRepository;
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
 * @author basharin
 * @since 07.12.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class DivisionCodeIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;
    private static final String UNKNOWN_CODE = "UNKNOWN";

    @Autowired
    private DivisionCodeRepository divisionCodeRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private DivisionCodeEntity savedDivisionCode;

    @Before
    public void setup() {
        divisionCodeRepository.deleteAll();

        savedDivisionCode = new DivisionCodeEntity();
        savedDivisionCode.setCode("simpleCode");
        savedDivisionCode.setDescription("simpleDescription");
        savedDivisionCode = divisionCodeRepository.save(savedDivisionCode);
    }

    private ParameterizedTypeReference<RestPageImpl<BranchEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<BranchEntity>>() {
        };
    }

    @Test
    public void getDivisionCode() throws Exception {
        mockRest.init()
                .path("/dictionaries/division-codes/{id}")
                .variable("id", savedDivisionCode.getId())
                .get(DivisionCode.class)
                .andExpectSafe(status(DivisionCode.class).isOk())
                .andExpectBodySafe(branch -> {
                    assertThat(branch.getId(), is(savedDivisionCode.getId()));
                    assertThat(branch.getCode(), is(savedDivisionCode.getCode()));
                });
    }

    @Test
    public void getDivisionCode_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/division-codes/{id}")
                .variable("id", savedDivisionCode.getId())
                .get(DivisionCode.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getDivisionCodeNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/division-codes/{id}")
                .variable("id", UNKNOWN_ID)
                .get(DivisionCode.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getDivisionByCode() throws Exception {
        mockRest.init()
                .path("/dictionaries/division-codes")
                .param("code", "simpleCode")
                .get(DivisionCode.class)
                .andExpectSafe(status(DivisionCode.class).isOk())
                .andExpectBodySafe(divisionCode -> {
                    assertThat(divisionCode.getId(), is(savedDivisionCode.getId()));
                    assertThat(divisionCode.getCode(), is(savedDivisionCode.getCode()));
                });
    }

    @Test
    public void getDivisionByCode_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/division-codes")
                .param("code", "simpleCode")
                .get(DivisionCode.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getDivisionByCodeNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/division-codes")
                .param("code", UNKNOWN_CODE)
                .get(DivisionCode.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/division-codes")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedDivisionCode.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/division-codes")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        divisionCodeRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/division-codes")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }
}
