package ru.softlab.efr.common.integration;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.softlab.efr.common.config.TestDockerApplicationConfig;
import ru.softlab.efr.common.dict.exchange.model.Address;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import ru.softlab.efr.common.dict.exchange.model.HouseType;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.repositories.AddressRepository;
import ru.softlab.efr.common.dict.repositories.HouseRepository;
import ru.softlab.efr.common.utils.IntegrationTestBase;
import ru.softlab.efr.test.services.auth.rest.AuthorizedRestRule;

import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ru.softlab.efr.common.utilities.test.matchers.ListResultMatchers.listContent;
import static ru.softlab.efr.test.infrastructure.transport.rest.matchers.MockRestResultMatchers.status;

/**
 * @author gladishev
 * @since 18.10.2017
 */
@Ignore
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDockerApplicationConfig.class)
public class AddressIntegrationTest extends IntegrationTestBase {

    private static final String ADDRESSES_URL = "/dictionaries/addresses";
    private static final String HOUSES_SEARCH = ADDRESSES_URL + "/{id}/houses";
    private static final String WORDS = "words";

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    @Rule
    public AuthorizedRestRule mockRest;

    private AddressEntity savedAddress;
    private HouseEntity houseEntity;

    @Before
    public void setup() {
        addressRepository.deleteAll();
        houseRepository.deleteAll();

        savedAddress = new AddressEntity();
        savedAddress.setAoid("00000000-0000-0000-0000-000000000001");
        savedAddress.setShortname("о");
        savedAddress.setOffname("Вологодская");
        savedAddress.setAoguid("00000000-0000-0000-0000-000000000001");
        savedAddress.setLevel(AddressLevel.REGION);
        savedAddress.setPostalcode("160000");
        savedAddress.setFulladdress("Вологодская");
        savedAddress = addressRepository.save(savedAddress);

        savedAddress = new AddressEntity();
        savedAddress.setAoid("00000000-0000-0000-0000-000000000002");
        savedAddress.setShortname("р-он");
        savedAddress.setOffname("Вологодский");
        savedAddress.setAoguid("00000000-0000-0000-0000-000000000002");
        savedAddress.setParentguid("00000000-0000-0000-0000-000000000001");
        savedAddress.setLevel(AddressLevel.AREA);
        savedAddress.setPostalcode("160000");
        savedAddress.setFulladdress("Вологодская Вологодский");
        savedAddress = addressRepository.save(savedAddress);

        savedAddress = new AddressEntity();
        savedAddress.setAoid("00000000-0000-0000-0000-000000000003");
        savedAddress.setShortname("г");
        savedAddress.setOffname("Вологда");
        savedAddress.setAoguid("00000000-0000-0000-0000-000000000003");
        savedAddress.setParentguid("00000000-0000-0000-0000-000000000002");
        savedAddress.setLevel(AddressLevel.LOCALITY);
        savedAddress.setPostalcode("160001");
        savedAddress.setFulladdress("Вологодская Вологодский Вологда");
        savedAddress = addressRepository.save(savedAddress);

        savedAddress = new AddressEntity();
        savedAddress.setAoid("00000000-0000-0000-0000-000000000004");
        savedAddress.setShortname("у");
        savedAddress.setOffname("Вологодская");
        savedAddress.setAoguid("00000000-0000-0000-0000-000000000004");
        savedAddress.setParentguid("00000000-0000-0000-0000-000000000003");
        savedAddress.setLevel(AddressLevel.STREET);
        savedAddress.setPostalcode("160002");
        savedAddress.setFulladdress("Вологодская Вологодский Вологда Вологодская");
        savedAddress = addressRepository.save(savedAddress);

        savedAddress = new AddressEntity();
        savedAddress.setAoid("00000000-0000-0000-0000-000000000005");
        savedAddress.setShortname("у");
        savedAddress.setOffname("Мира");
        savedAddress.setAoguid("00000000-0000-0000-0000-000000000005");
        savedAddress.setParentguid("00000000-0000-0000-0000-000000000003");
        savedAddress.setLevel(AddressLevel.STREET);
        savedAddress.setPostalcode("160003");
        savedAddress.setFulladdress("Вологодская Вологодский Вологда Мира");
        savedAddress = addressRepository.save(savedAddress);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000000");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000000");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000004");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("1");
        houseEntity.setBuildnum("1");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000001");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000001");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000004");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("2");
        houseEntity.setBuildnum("1");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000002");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000002");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000005");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("22");
        houseEntity.setBuildnum("22");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000003");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000003");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000005");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("3");
        houseEntity.setBuildnum("3");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000004");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000004");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000005");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("33");
        houseEntity.setBuildnum("33");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);

        houseEntity = new HouseEntity();
        houseEntity.setHouseid("00000000-0000-0000-0000-000000000005");
        houseEntity.setHouseguid("00000000-0000-0000-0000-000000000005");
        houseEntity.setAoguid("00000000-0000-0000-0000-000000000005");
        houseEntity.setHouseType(HouseType.BUILDING);
        houseEntity.setHousenum("44");
        houseEntity.setBuildnum("44");
        houseEntity.setPostalcode("160004");
        houseEntity = houseRepository.save(houseEntity);
    }

    @Test
    public void addressListClient_keywords_success() throws Exception {
        mockRest.init()
                .path(ADDRESSES_URL).param(WORDS, "Волог")
                .setTimeoutInSeconds(50)
                .get(foundList())
                .andExpectSafe(status(foundList()).isOk())
                .andExpect(listContent(hasSize(5)));
    }


    @Test
    public void addressListClient_keywords_multi_string_success() throws Exception {
        mockRest.init()
                .path(ADDRESSES_URL)
                .param(WORDS, "Волог")
                .param("parentId", addressRepository.findByOffname("Вологда").get(0).getId())
                .setTimeoutInSeconds(50)
                .get(foundList())
                .andExpectSafe(status(foundList()).isOk())
                .andExpect(listContent(hasSize(3)));
    }

    @Test
    public void addressListClient_keywords_maxLength_success() throws Exception {
        mockRest.init()
                .path(ADDRESSES_URL)
                .param(WORDS, "Вологодская Вологда")
                .setTimeoutInSeconds(50)
                .get(foundList())
                .andExpectSafe(status(foundList()).isOk())
                .andExpect(listContent(hasSize(3)));
    }

    @Test
    public void housesListClient_success() throws Exception {
        mockRest.init()
                .path(HOUSES_SEARCH)
                .variable("id", addressRepository.findByOffname("Мира").get(0).getId())
                .param("house", "3")
                .setTimeoutInSeconds(50)
                .get(foundList())
                .andExpectSafe(status(foundList()).isOk())
                .andExpect(listContent(hasSize(2)));
    }

    @Test
    public void search_required_param_bad() throws Exception {
        mockRest.init()
                .path(ADDRESSES_URL)
                .setTimeoutInSeconds(50)
                .get(foundList())
                .andExpectSafe(status(foundList()).isBadRequest());
    }

    private ParameterizedTypeReference<List<Address>> foundList() {
        return new ParameterizedTypeReference<List<Address>>() {
        };
    }
}
