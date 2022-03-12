package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.PersonalId;

public class SeleccionarPersonal extends Command {

    private PersonalId personalId;

    public SeleccionarPersonal(PersonalId personalId){
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
