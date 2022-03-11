package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;


public class AlmacenadoPorLaboratorio extends DomainEvent {

    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public AlmacenadoPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        super("sofka.farmacia.almacenadoporlaboratorio");
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }
}
