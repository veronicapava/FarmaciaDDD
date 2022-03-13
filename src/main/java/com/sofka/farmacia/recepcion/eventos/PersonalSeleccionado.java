package com.sofka.farmacia.recepcion.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class PersonalSeleccionado extends DomainEvent {

    private PersonalId personalId;
    private RecepcionId recepcionId;

    public PersonalSeleccionado(PersonalId personalId) {
        super("sofka.farmacia.personalseleccionado");
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
