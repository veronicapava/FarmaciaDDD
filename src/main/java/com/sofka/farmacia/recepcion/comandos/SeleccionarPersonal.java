package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class SeleccionarPersonal extends Command {

    private PersonalId personalId;
    private RecepcionId recepcionId;

    public SeleccionarPersonal(PersonalId personalId, RecepcionId recepcionId){
        this.personalId = personalId;
        this.recepcionId = recepcionId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
