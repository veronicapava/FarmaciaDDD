package com.sofka.farmacia.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.personal.entidades.Administrador;
import com.sofka.farmacia.personal.entidades.AuxiliarFarmacia;
import com.sofka.farmacia.personal.entidades.JefeBodega;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.eventos.PersonalEditado;
import com.sofka.farmacia.personal.eventos.PersonalEliminado;
import com.sofka.farmacia.personal.values.*;

import java.util.Objects;

public class Personal extends AggregateEvent<PersonalId> {

    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarFarmacia auxiliarFarmacia;

    public Personal(PersonalId personalId, DatosPersonales datosPersonales) {
        super(personalId);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply(); //Cuando el caso de uso vaya a crear el agreghador, se le pasara el id y se le pasaran los datos personales, la consecuencia es que el personal fue creado
    }

    //Comportamientos

    public void agregarPersonal(PersonalId personalId, DatosPersonales datosPersonales){
        Objects.requireNonNull(personalId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
    }

    public void eliminarPersonal(PersonalId personalId){
        Objects.requireNonNull(personalId);
        appendChange(new PersonalEliminado(personalId)).apply();
    }

    public void editarPersonal(PersonalId personalId, DatosPersonales datosPersonales){
        appendChange(new PersonalEditado(personalId, datosPersonales)).apply();
    }

}
