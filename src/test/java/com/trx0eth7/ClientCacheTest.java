package com.trx0eth7;

import com.trx0eth7.client.Service;
import com.trx0eth7.model.Data;
import com.trx0eth7.server.controller.DataController;
import com.trx0eth7.server.controller.Settings;
import com.trx0eth7.server.controller.dao.AbstractDao;
import com.trx0eth7.server.exception.ServiceInitializeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ClientCacheTest {
    Settings settings;

    @Before
    public void setUp() {
        settings = new Settings(true);
    }

    @Test
    public void shouldInitServiceBySettings() {
        Service service = new Service(settings);
        Assert.assertNotNull(service.controller());
    }

    @Test
    public void shouldInitServiceBySettingsAndController() {
        AbstractDao dao = new StubAbstractDAO(settings);
        DataController controller = new StubDataController(dao);
        Service service = new Service(controller);
    }

    @Test(expected = ServiceInitializeException.class)
    public void shouldThrowExceptionIfSettingsWasNull() {
        settings = null;
        Service service = new Service(settings);
        DataController controller = service.controller();
    }

    @Ignore("Data storage logic is not implemented")
    @Test
    public void shouldGetDataByInitSettings() {
        Service service = new Service(settings);

        Long id = 0L;
        Data data = service.controller().getDataById(id);
        Assert.assertEquals("Id do not match", id, data.getId());
    }

    @Test
    public void shouldGetDataByInitController() {
        AbstractDao dao = new StubAbstractDAO(settings);
        DataController controller = new StubDataController(dao);
        Service service = new Service(controller);

        Long id = 0L;
        Data data = service.controller().getDataById(id);
        Assert.assertEquals("Id do not match", id, data.getId());
    }


}
