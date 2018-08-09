package com.trx0eth7.client;

import com.sun.istack.internal.NotNull;
import com.trx0eth7.server.controller.DataController;
import com.trx0eth7.server.controller.DefaultDataController;
import com.trx0eth7.server.controller.Settings;
import com.trx0eth7.server.controller.dao.AbstractDao;
import com.trx0eth7.server.controller.dao.DefaultDao;
import com.trx0eth7.server.exception.ServiceInitializeException;

public final class Service {
    private DataController controller;
    private Settings settings;

    public Service(Settings settings) {
        init(settings);
    }

    public Service(@NotNull DataController controller) {
        init(controller);
    }

    private void init(Settings settings) {
        if (settings == null) {
            throw new ServiceInitializeException("Settings must not be null");
        }
        this.settings = settings;
        this.controller = createDefaultController();
    }

    private DataController createDefaultController() {
        AbstractDao dao = new DefaultDao(settings);
        return new DefaultDataController(dao);
    }

    private void init(DataController controller) {
        if (controller == null) {
            throw new ServiceInitializeException("DataController must not be null");
        }
        this.controller = controller;
        Settings settings = controller.getSettings();
        if (settings == null) {
            throw new ServiceInitializeException("Settings must not be null");
        }
        this.settings = settings;
    }

    public DataController controller() {
        if (controller != null) {
            return controller;
        }
        throw new ServiceInitializeException("Service must be initialized by method init()");
    }
}
