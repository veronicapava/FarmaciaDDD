package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.*;


public class AlmacenadoPorLaboratorio extends DomainEvent {

    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;
    private Medicamento medicamento;
    private Clasificacion clasificacion;
    private AlmacenamientoId almacenamientoId;

    public AlmacenadoPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, Medicamento medicamento, Clasificacion clasificacion) {
        super("sofka.farmacia.almacenadoporlaboratorio");
        this.almacenamientoId = almacenamientoId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
        this.medicamento = medicamento;
        this.clasificacion = clasificacion;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
