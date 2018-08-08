package com.trx0eth7.controller;


import com.trx0eth7.controller.dao.AbstractDao;
import com.trx0eth7.model.Data;

public abstract class DataController<T extends Data> {
    private AbstractDao<T> dataDAO;


    public DataController(AbstractDao<T> dataDAO) {
        this.dataDAO = dataDAO;
    }

    public Data getDataById(Long id){
        return dataDAO.findById(id);
    }
    public void setData(T data){
        dataDAO.insert(data);
    }
    public void updateData(T data){
        dataDAO.update(data);
    }
    public void deleteData(T data){
        dataDAO.delete(data);
    }

}