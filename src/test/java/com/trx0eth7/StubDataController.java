package com.trx0eth7;

import com.trx0eth7.controller.DataController;
import com.trx0eth7.controller.dao.AbstractDao;

public class StubDataController extends DataController {

    public StubDataController(AbstractDao dataDAO) {
        super(dataDAO);
    }
}
