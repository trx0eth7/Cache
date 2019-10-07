package com.trx0eth7.server;

import com.trx0eth7.model.Data;

public interface ServerDataRepository<T extends Data> {
    T getDataById(Long id);
    void setData(T data);
    void updateData(T data);
    void deleteData(T data);

}
