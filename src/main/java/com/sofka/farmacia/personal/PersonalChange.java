package com.sofka.farmacia.personal;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.eventos.PersonalEditado;
import com.sofka.farmacia.personal.eventos.PersonalHabilitado;

public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal){
        apply((PersonalCreado event ) ->{
            personal.administrador = null;
            personal.jefeBodega = null;
            personal.auxiliarFarmacia = null;
        });

        apply((PersonalEditado event) -> {
            personal.editarPersonal(event.getPersonalId());
        });

        apply((PersonalHabilitado event) -> {
            personal.habilitarPersonal(event.getPersonalId());
        });

    }
}
