package com.sofka.farmacia.personal.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.PersonalId;

public class HabilitarPersonal extends Command {
    private PersonalId personalId;

    public HabilitarPersonal(PersonalId personalId) {
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
