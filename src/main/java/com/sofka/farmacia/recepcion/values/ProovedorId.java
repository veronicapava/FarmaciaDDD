package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.Identity;

public class ProovedorId extends Identity {
    private  ProovedorId(String id){
        super(id);
    }

    public ProovedorId(){}

    public static ProovedorId of(String id) {
        return new ProovedorId(id);
    }
}
