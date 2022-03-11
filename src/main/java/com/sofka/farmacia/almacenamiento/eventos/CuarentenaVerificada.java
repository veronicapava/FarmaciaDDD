package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.Clasificacion;
import com.sofka.farmacia.almacenamiento.values.Medicamento;


public class CuarentenaVerificada extends DomainEvent {
    private Medicamento medicamento;
    private Clasificacion clasificacion;

    public CuarentenaVerificada(Medicamento medicamento, Clasificacion clasificacion) {
        super("sofka.farmacia.cuarentenaverificada");
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
