package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.AdministradorId;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.Estado;

import java.util.Objects;

public class Administrador extends Entity<AdministradorId> {

    private DatosPersonales datospersonales;
    private Estado estado;

    public Administrador(AdministradorId entityId, DatosPersonales datospersonales) {
        super(entityId);
        this.datospersonales = datospersonales;
        this.estado = new Estado(Estado.Fase.SIN_TAREAS_POR_ASIGNAR);
    }

    //comportamientos

    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datospersonales = Objects.requireNonNull(datosPersonales);
    }

    public void delegarTareasDePersonalEnGeneral(){
        this.estado = new Estado(Estado.Fase.DELEGAR_TAREA);
    }


    //Propiedades

    public DatosPersonales datospersonales() {
        return datospersonales;
    }
}
