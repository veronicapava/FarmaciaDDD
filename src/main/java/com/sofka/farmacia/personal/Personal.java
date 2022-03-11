package com.sofka.farmacia.personal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.personal.entidades.Administrador;
import com.sofka.farmacia.personal.entidades.AuxiliarFarmacia;
import com.sofka.farmacia.personal.entidades.JefeBodega;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;

public class Personal extends AggregateEvent<PersonalId> {

    protected Administrador administrador;
    protected JefeBodega jefeBodega;
    protected AuxiliarFarmacia auxiliarFarmacia;

    public Personal(PersonalId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        appendChange(new PersonalCreado(datosPersonales)).apply(); //Cuando el caso de uso vaya a crear el agreghador, se le pasara el id y se le pasaran los datos personales, la consecuencia es que el personal fue creado
    }


}
