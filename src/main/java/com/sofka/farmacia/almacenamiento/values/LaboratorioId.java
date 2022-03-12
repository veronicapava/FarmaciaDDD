package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.Identity;

public class LaboratorioId extends Identity {
    public LaboratorioId() {
    }

    public LaboratorioId(String id) {
        super(id);
    }

    public static  LaboratorioId of (String id) {
        return  new LaboratorioId(id);
    }
}
