package com.sofka.farmacia.recepcion.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.PersonalId;

public class PersonalSeleccionado extends DomainEvent {

    private PersonalId personalId;

    public PersonalSeleccionado(PersonalId personalId) {
        super("sofka.farmacia.personalseleccionado");
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
