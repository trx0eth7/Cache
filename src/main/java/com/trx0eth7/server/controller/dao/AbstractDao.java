package com.trx0eth7.server.controller.dao;

import com.sun.istack.internal.Nullable;
import com.trx0eth7.server.controller.Settings;
import com.trx0eth7.model.Data;

public abstract class AbstractDao<T extends Data> {

    private final Settings settings;

    public AbstractDao(Settings settings) {
        this.settings = settings;
    }

    public abstract Data findById(Long id);
    public abstract void insert(T data);
    public abstract void update(T data);
    public abstract void delete(T data);

    @Nullable
    public Settings getSettings() {
        return settings;
    }
}
