package com.trx0eth7;

import com.trx0eth7.controller.DataController;
import com.trx0eth7.controller.Settings;
import com.trx0eth7.controller.dao.AbstractDao;
import com.trx0eth7.model.Data;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CacheTest {
    private DataController<Data> controller;

    @Before
    public void setUp() {
        Settings settings = new Settings();
        settings.setEnableСaching(true);
        AbstractDao<Data> dao = new StubAbstractDAO(settings);

        controller = new StubDataController(dao);
    }

    @Test
    public void shoudGetData() {
        Assert.assertTrue(controller.getSettings().isEnableСaching());
        Long id = 0L;
        Data data = controller.getDataById(id);
        Assert.assertEquals("Id do not match",id, data.getId());
    }
}
