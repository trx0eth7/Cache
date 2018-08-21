package com.trx0eth7.client;

import com.trx0eth7.model.Data;
import com.trx0eth7.server.ServerDataAPI;

public final class ClientService extends ClientServiceFacade{

    ClientService(ServerDataAPI dataAPI) {
        super(dataAPI);
    }

    @Override
    public Data getDataById(Long id) {
        //mock
        return () -> 1L;
    }
}
