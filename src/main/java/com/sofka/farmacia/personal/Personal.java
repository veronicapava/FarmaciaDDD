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
        appendChange(new PersonalCreado(datosPersonales, personalId)).apply();//Cuando el caso de uso vaya a crear el agreghador, se le pasara el id y se le pasaran los datos personales, la consecuencia es que el personal fue creado
    }

   //Constructor privado para afectar los estados
   public Personal(PersonalId personalId){
        super(personalId);
        subscribe(new PersonalChange(this)); //Cada vez que se ejecuta un comportamiento, se va a lanzar un evento, pero este evento va a tener un suscriptor que va a estar pendiente de el evento como tal, para poder cambiar los estados del agregado
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
