package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.*;

import java.util.Objects;

public class VerificarCuarentena extends Command {

    private Medicamento medicamento;
    private Clasificacion clasificacion;
    private AlmacenamientoId almacenamientoId;
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;
    private CuarentenaId cuarentenaId;

    public VerificarCuarentena(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, CuarentenaId cuarentenaId,  Medicamento medicamento, Clasificacion clasificacion) {
        Objects.requireNonNull(medicamento);
        Objects.requireNonNull(clasificacion);
        this.medicamento = medicamento;
        this.clasificacion = clasificacion;
        this.almacenamientoId = almacenamientoId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
        this.cuarentenaId = cuarentenaId;
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

    public CuarentenaId getCuarentenaId() {
        return cuarentenaId;
    }
}
