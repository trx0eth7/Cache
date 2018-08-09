package com.trx0eth7.server.controller;

import com.trx0eth7.server.controller.dao.AbstractDao;

public class DefaultDataController extends DataController {

    public DefaultDataController(AbstractDao dataDAO) {
        super(dataDAO);
    }
}
