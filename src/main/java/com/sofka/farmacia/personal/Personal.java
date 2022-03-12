package com.sofka.farmacia.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.personal.entidades.Administrador;
import com.sofka.farmacia.personal.entidades.AuxiliarFarmacia;
import com.sofka.farmacia.personal.entidades.JefeBodega;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.eventos.PersonalEditado;
import com.sofka.farmacia.personal.eventos.PersonalHabilitado;
import com.sofka.farmacia.personal.values.*;

import java.util.Objects;

public class Personal extends AggregateEvent<PersonalId> {

    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarFarmacia auxiliarFarmacia;
    protected DatosPersonales datosPersonales;
    protected PersonalId personalId;

    public Personal(PersonalId personalId, DatosPersonales datosPersonales) {
        super(personalId);
        appendChange(new PersonalHabilitado(personalId)).apply();
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
        appendChange(new PersonalEditado(personalId, datosPersonales)).apply();
    }

   //Constructor privado para afectar los estados
   public Personal(PersonalId personalId){
        super(personalId);
        subscribe(new PersonalChange(this));
    }

    //Comportamientos

    public void agregarPersonal(PersonalId personalId, DatosPersonales datosPersonales){
        Objects.requireNonNull(personalId);
        Objects.requireNonNull(datosPersonales);
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();
    }

    public void habilitarPersonal(PersonalId personalId){
        Objects.requireNonNull(personalId);
        appendChange(new PersonalHabilitado(personalId)).apply();
    }

    public void editarPersonal(PersonalId personalId, DatosPersonales datosPersonales){
        appendChange(new PersonalEditado(personalId, datosPersonales)).apply();
    }

}
