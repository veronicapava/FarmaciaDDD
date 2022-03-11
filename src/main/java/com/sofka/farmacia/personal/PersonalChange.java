package com.sofka.farmacia.personal;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.eventos.PersonalEditado;
import com.sofka.farmacia.personal.eventos.PersonalEliminado;

public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal){
        apply((PersonalCreado event ) ->{
            personal.administrador = null;
            personal.jefeBodega = null;
            personal.auxiliarFarmacia = null;
        });

        apply((PersonalEditado event) -> {
            personal.auxiliarFarmacia = null;
            personal.jefeBodega = null;
            personal.administrador = null;
            personal.editarPersonal(event.getPersonalId());
        });

        apply((PersonalEliminado event) -> {
            personal.eliminarPersonal(event.getPersonalId());
        });

    }
}
