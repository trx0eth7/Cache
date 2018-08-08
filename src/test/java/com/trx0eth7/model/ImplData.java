package com.trx0eth7.model;

public class ImplData implements Data {
    private Long id;

    public ImplData(Long id) {
        this.id = id;
    }


    @Override
    public Long getId() {
        return id;
    }
}
