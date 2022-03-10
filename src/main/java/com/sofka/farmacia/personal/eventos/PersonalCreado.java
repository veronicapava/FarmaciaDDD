package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.DatosPersonales;

public class PersonalCreado extends DomainEvent {
    private DatosPersonales datosPersonales;

    public PersonalCreado(DatosPersonales datosPersonales) {
        super("sofka.farmacia.personalcreado");
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
