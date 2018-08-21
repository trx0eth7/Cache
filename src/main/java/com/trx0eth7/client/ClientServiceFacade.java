package com.trx0eth7.client;

import com.trx0eth7.model.Data;
import com.trx0eth7.server.ServerDataAPI;

abstract class ClientServiceFacade {
    private final ServerDataAPI dataAPI;

    public ClientServiceFacade(ServerDataAPI dataAPI) {
        this.dataAPI = dataAPI;
    }

    public abstract Data getDataById(Long id);
}
