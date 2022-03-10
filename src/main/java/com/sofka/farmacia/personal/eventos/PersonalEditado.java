package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.DatosPersonales;

public class PersonalEditado extends DomainEvent {
    private DatosPersonales datosPersonales;

    public PersonalEditado(DatosPersonales datosPersonales) {
        super("sofka.farmacia.personaleditado");
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
