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
import ru.softlab.efr.common.dict.exchange.model.Branch;
import ru.softlab.efr.common.dict.model.BranchEntity;
import ru.softlab.efr.common.dict.repositories.BranchRepository;
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
 * @since 19.09.2017
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class BranchIntegrationTest extends IntegrationTestBase {
    private static final long UNKNOWN_ID = Long.MAX_VALUE;

    @Autowired
    private BranchRepository branchRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private BranchEntity savedBranch;

    @Before
    public void setup() {
        branchRepository.deleteAll();

        savedBranch = new BranchEntity();
        savedBranch.setSimpleName("simpleName");
        savedBranch.setCode("branch_code");
        savedBranch = branchRepository.save(savedBranch);
    }

    private ParameterizedTypeReference<RestPageImpl<BranchEntity>> restPage() {
        return new ParameterizedTypeReference<RestPageImpl<BranchEntity>>() {
        };
    }

    @Test
    public void getBranch() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches/{id}")
                .variable("id", savedBranch.getId())
                .get(Branch.class)
                .andExpectSafe(status(Branch.class).isOk())
                .andExpectBodySafe(branch -> {
                    assertThat(branch.getId(), is(savedBranch.getId()));
                    assertThat(branch.getSimpleName(), is(savedBranch.getSimpleName()));
                });
    }

    @Test
    public void getBranch_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/branches/{id}")
                .variable("id", savedBranch.getId())
                .get(Branch.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getBranchNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches/{id}")
                .variable("id", UNKNOWN_ID)
                .get(Branch.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void getBranchByCode() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches")
                .query("code=" + savedBranch.getCode())
                .variable("id", savedBranch.getId())
                .get(Branch.class)
                .andExpectSafe(status(Branch.class).isOk())
                .andExpectBodySafe(branch -> {
                    assertThat(branch.getId(), is(savedBranch.getId()));
                    assertThat(branch.getSimpleName(), is(savedBranch.getSimpleName()));
                });
    }

    @Test
    public void getBranchByCode_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/branches")
                .query("code=" + savedBranch.getCode())
                .variable("id", savedBranch.getId())
                .get(Branch.class)
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void getBranchByCodeNotFound() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches")
                .query("code=NOT_FOUND")
                .variable("id", UNKNOWN_ID)
                .get(Branch.class)
                .andExpect(status().isNotFound());
    }

    @Test
    public void list() throws Exception {
        mockRest.init()
                .path("/dictionaries/branches")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(1)))
                .andExpect(pageContent(hasItem(hasProperty("id", is(savedBranch.getId())))));
    }

    @Test
    public void list_forbidden() throws Exception {
        mockRest.init(Right.EDIT_SYSTEM_DICTIONARIES)
                .path("/dictionaries/branches")
                .get(restPage())
                .andExpect(status().is(HttpStatus.FORBIDDEN));
    }

    @Test
    public void listEmpty() throws Exception {
        branchRepository.deleteAll();

        mockRest.init()
                .path("/dictionaries/branches")
                .get(restPage())
                .andExpect(status().isOk())
                .andExpect(pageContent(hasSize(0)));
    }

}
