package com.trx0eth7.server.controller.dao;

import com.trx0eth7.model.Data;
import com.trx0eth7.server.controller.Settings;

public class DefaultDao extends AbstractDao {

    public DefaultDao(Settings settings) {
        super(settings);
    }

    @Override
    public Data findById(Long id) {
        return null;
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
