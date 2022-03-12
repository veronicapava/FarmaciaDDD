package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;


public class CuarentenaId extends Identity {
    public CuarentenaId() {
    }

    public CuarentenaId(String id) {
        super(id);
    }

    public static  CuarentenaId of (String id) {
        return  new CuarentenaId(id);
    }

}
