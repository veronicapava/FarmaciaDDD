package com.sofka.farmacia.almacenamiento.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.almacenamiento.values.Clasificacion;
import com.sofka.farmacia.almacenamiento.values.CuarentenaId;
import com.sofka.farmacia.almacenamiento.values.Medicamento;

import java.util.Objects;

public class Cuarentena extends Entity<CuarentenaId> {

    private Clasificacion clasificacion;
    private Medicamento medicamento;

    public Cuarentena(CuarentenaId cuarentenaId, Medicamento medicamento, Clasificacion clasificacion) {
        super(cuarentenaId);
        this.medicamento = medicamento;
        this.clasificacion = new Clasificacion(Clasificacion.Fase.AVERIADO);
    }

    //Comportamientos

    public void actualizarMedicamentosDeCuarentena(Medicamento medicamento, Clasificacion clasificacion) {
        this.medicamento = Objects.requireNonNull(medicamento);
        this.clasificacion = new Clasificacion(Clasificacion.Fase.AVERIADO);

    }

    //Propiedades

    public Clasificacion clasificacion() {
        return clasificacion;
    }

    public Medicamento medicamento() {
        return medicamento;
    }
}
