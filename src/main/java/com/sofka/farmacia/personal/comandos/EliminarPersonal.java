package com.sofka.farmacia.personal.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.PersonalId;

public class EliminarPersonal extends Command {
    private PersonalId personalId;

    public EliminarPersonal(PersonalId personalId) {
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
