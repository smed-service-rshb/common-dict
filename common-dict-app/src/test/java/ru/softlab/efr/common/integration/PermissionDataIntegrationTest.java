package ru.softlab.efr.common.integration;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.softlab.efr.common.config.TestDockerApplicationConfig;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.services.auth.Right;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * @author niculichev
 * @since 21.06.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class PermissionDataIntegrationTest extends IntegrationTestBase {

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    @Before
    public void setUp() {

    }

    @Test
    public void should_FailBankList_When_WrongRole() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/banks")
                .get(String.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void should_SuccessBankList_When_RightRole() throws Exception {
        mockRest.init()
                .path("/dictionaries/banks")
                .get(String.class)
                .andExpect(status().isOk());
    }

    @Test
    public void should_FailBankList_When_NoPermission() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/banks")
                .get(String.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }
}
