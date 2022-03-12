package com.sofka.farmacia.personal.values;

import co.com.sofka.domain.generic.Identity;

public class AuxiliarFarmaciaId extends Identity {
    private  AuxiliarFarmaciaId(String id){
        super(id);
    }

    public AuxiliarFarmaciaId(){}

    public static AuxiliarFarmaciaId of(String id) {
        return new AuxiliarFarmaciaId(id);
    }
}
