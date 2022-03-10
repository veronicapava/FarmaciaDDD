package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.PersonalId;

public class PersonalEliminado extends DomainEvent {

    private PersonalId personalId;

    public PersonalEliminado(PersonalId PersonalId) {
        super("sofka.farmacia.personaleliminado");
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
