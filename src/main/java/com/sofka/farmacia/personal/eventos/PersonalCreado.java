package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;

public class PersonalCreado extends DomainEvent {
    private DatosPersonales datosPersonales;
    private PersonalId personalId;

    public PersonalCreado(DatosPersonales datosPersonales, PersonalId personalId) {
        super("sofka.farmacia.personalcreado");
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
