package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.Identity;

public class InventarioId extends Identity {
    private  InventarioId(String id){
        super(id);
    }

    public InventarioId(){}

    public static InventarioId of(String id) {
        return new InventarioId(id);
    }
}
