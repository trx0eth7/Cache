package com.trx0eth7;

import com.trx0eth7.server.controller.Settings;
import com.trx0eth7.server.controller.dao.AbstractDao;
import com.trx0eth7.model.Data;
import com.trx0eth7.model.ImplData;

public class StubAbstractDAO extends AbstractDao {

    public StubAbstractDAO(Settings settings) {
        super(settings);
    }

    @Override
    public Data findById(Long id) {
        return new ImplData(0L);
    }

    @Override
    public void insert(Data data) {

    }

    @Override
    public void update(Data data) {

    }

    @Override
    public void delete(Data data) {

    }
}
