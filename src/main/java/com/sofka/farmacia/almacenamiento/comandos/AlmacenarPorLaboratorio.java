package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.*;

import java.util.Objects;

public class AlmacenarPorLaboratorio extends Command {
    private AlmacenamientoId almacenamientoId;
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;
    private Medicamento medicamento;
    private Clasificacion clasificacion;

    public AlmacenarPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, Medicamento medicamento, Clasificacion clasificacion) {
        Objects.requireNonNull(almacenamientoId);
        Objects.requireNonNull(datosDelLaboratorio);
        Objects.requireNonNull(estante);
        this.almacenamientoId = almacenamientoId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
        this.medicamento = medicamento;
        this.clasificacion = clasificacion;
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
