package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.PersonalId;

public class PersonalHabilitado extends DomainEvent {

    private PersonalId personalId;

    public PersonalHabilitado(PersonalId personalId) {
        super("sofka.farmacia.personalhabilitado");
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
