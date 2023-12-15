package ru.softlab.efr.common.dict.tools.address;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import ru.softlab.efr.common.dict.exchange.model.AddressLevel;
import ru.softlab.efr.common.dict.exchange.model.HouseType;
import ru.softlab.efr.common.dict.model.AddressEntity;
import ru.softlab.efr.common.dict.model.HouseEntity;
import ru.softlab.efr.common.dict.services.AddressService;
import ru.softlab.efr.common.dict.services.HouseService;
import ru.softlab.efr.common.dict.tools.ReplicatorException;
import ru.softlab.efr.common.dict.tools.ReplicatorHelper;
import ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorDBF;
import ru.softlab.efr.common.settings.entities.SettingEntity;
import ru.softlab.efr.common.settings.services.SettingsService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorConstants.ADDRESS_DELTA_DIR_PATH;
import static ru.softlab.efr.common.dict.tools.address.replicator.AddressReplicatorConstants.ADDRESS_DICT_DIR_PATH;

/**
 * @author gladishev
 * @since 27.11.2017
 */
@RunWith(MockitoJUnitRunner.class)
public class AddressReplicatorDBTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Mock
    private AddressService addressService;

    @Mock
    private HouseService houseService;

    @Mock
    private SettingsService settingsService;

    @Mock
    private ReplicatorHelper replicatorHelper;

    private AddressReplicatorDBF addressReplicatorDBF;

    @Before
    public void setUp() {
        addressReplicatorDBF = new AddressReplicatorDBF(addressService, houseService, settingsService, replicatorHelper);
        when(addressService.findByAoguid(any())).thenAnswer(new Answer<AddressEntity>() {
            @Override
            public AddressEntity answer(InvocationOnMock invocationOnMock) throws Throwable {
                return createAddressEntity();
            }
        });
        when(houseService.findByHouseid(any())).thenAnswer(new Answer<HouseEntity>() {
            @Override
            public HouseEntity answer(InvocationOnMock invocationOnMock) throws Throwable {
                return createHouseEntity();
            }
        });
    }

    @Test
    public void replicationAddresses_success() throws ReplicatorException {
        setPathSetting(ADDRESS_DICT_DIR_PATH, "../common-dict-app/src/test/resources/mockDictionaries/fias/");
        addressReplicatorDBF.replicateAddresses();
        Mockito.verify(replicatorHelper).saveAddresses(any(), eq("ADDROB35.dbf"));
    }

    @Test
    public void replicationHouses_success() throws ReplicatorException {
        setPathSetting(ADDRESS_DICT_DIR_PATH, "../common-dict-app/src/test/resources/mockDictionaries/fias/");
        addressReplicatorDBF.replicateHouses();
        Mockito.verify(replicatorHelper).saveHouses(any(), eq("HOUSE35.dbf"));
    }

    @Test
    public void update_success() throws ReplicatorException {
        setPathSetting(ADDRESS_DELTA_DIR_PATH, "../common-dict-app/src/test/resources/mockDictionaries/fias_delta");
        addressReplicatorDBF.update();
        Mockito.verify(addressService).saveAll(any());
        Mockito.verify(houseService).saveAll(any());
    }

    private void setPathSetting(String settings, String path) {
        Mockito.when(settingsService.get(settings))
                .thenReturn(new SettingEntity(settings, path, "Path to dictionaries"));

    }

    private AddressEntity createAddressEntity() {
        AddressEntity entity = new AddressEntity();
        entity.setAoid("00000000-0000-0000-0000-000000000001");
        entity.setShortname("о");
        entity.setOffname("Вологодская");
        entity.setAoguid("00000000-0000-0000-0000-000000000001");
        entity.setLevel(AddressLevel.REGION);
        entity.setPostalcode("160000");
        return entity;
    }

    private HouseEntity createHouseEntity() {
        HouseEntity entity = new HouseEntity();
        entity.setHouseid("00000000-0000-0000-0000-000000000000");
        entity.setHouseguid("00000000-0000-0000-0000-000000000000");
        entity.setAoguid("00000000-0000-0000-0000-000000000004");
        entity.setHouseType(HouseType.BUILDING);
        entity.setHousenum("1");
        entity.setBuildnum("1");
        entity.setPostalcode("160004");
        return entity;

    }
}
