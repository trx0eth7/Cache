package com.trx0eth7.client;

import com.trx0eth7.model.Data;
import com.trx0eth7.server.ServerDataAPI;
import org.junit.Assert;
import org.junit.Test;

public class ClientServiceFacadeTest {

    @Test
    public void shouldGetDataById() {
        ServerDataAPI dataAPI = null;
        ClientServiceFacade clientServiceFacade = new ClientService(dataAPI);
        Long id = 1L;
        Data data = clientServiceFacade.getDataById(id);
        Assert.assertEquals("Wrong, data doesn't match (id not equals)",data.getId(), id);
    }
}