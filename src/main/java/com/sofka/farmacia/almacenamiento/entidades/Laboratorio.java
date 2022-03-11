package com.sofka.farmacia.almacenamiento.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;
import com.sofka.farmacia.almacenamiento.values.LaboratorioId;

public class Laboratorio extends Entity<LaboratorioId> {

    private LaboratorioId laboratorioId;
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public Laboratorio(LaboratorioId laboratorioId, DatosDelLaboratorio datosDelLaboratorio,  Estante estante) {
        super(laboratorioId);
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    //Comportamientos

    public void clasificarPorLaboratorio(LaboratorioId laboratorioId, DatosDelLaboratorio datosDelLaboratorio, Estante estante ){
        this.laboratorioId = laboratorioId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    public void crearNuevosEstantes(DatosDelLaboratorio datosDelLaboratorio, Estante estante){
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    //Propiedades


    public DatosDelLaboratorio datosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante estante() {
        return estante;
    }

    public LaboratorioId laboratorioId() {
        return laboratorioId;
    }
}
