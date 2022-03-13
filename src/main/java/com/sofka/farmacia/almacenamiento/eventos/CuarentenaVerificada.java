package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.*;


public class CuarentenaVerificada extends DomainEvent {
    private final Medicamento medicamento;
    private final Clasificacion clasificacion;
    private final AlmacenamientoId almacenamientoId;
    private final DatosDelLaboratorio datosDelLaboratorio;
    private final Estante estante;

    public CuarentenaVerificada(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, Medicamento medicamento, Clasificacion clasificacion) {
        super("sofka.farmacia.cuarentenaverificada");
        this.almacenamientoId = almacenamientoId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
        this.medicamento = medicamento;
        this.clasificacion = clasificacion;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
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
}
