package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.AdministradorId;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalACargo;

import java.util.Objects;

public class Administrador extends Entity<AdministradorId> {

    private DatosPersonales datospersonales;
    private PersonalACargo personalACargo;

    public Administrador(AdministradorId entityId, DatosPersonales datospersonales, PersonalACargo personalACargo) {
        super(entityId);
        this.datospersonales = datospersonales;
        this.personalACargo = personalACargo;
    }

    //comportamientos

    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datospersonales = Objects.requireNonNull(datosPersonales);
    }

    public void delegarTareasDePersonalEnGeneral(PersonalACargo personalACargo){
        this.personalACargo = personalACargo;
    }


    //getters

    public DatosPersonales datospersonales() {
        return datospersonales;
    }

    public PersonalACargo personalACargo() {
        return personalACargo;
    }

}
