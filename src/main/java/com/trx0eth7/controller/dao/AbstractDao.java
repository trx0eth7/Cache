package com.trx0eth7.controller.dao;

import com.trx0eth7.controller.Settings;
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

    public Settings getSettings() {
        return settings;
    }
}
