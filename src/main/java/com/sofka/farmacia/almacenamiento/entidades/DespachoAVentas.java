package com.sofka.farmacia.almacenamiento.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.almacenamiento.values.DespachoAVentasId;
import com.sofka.farmacia.almacenamiento.values.Planilla;

import java.util.Objects;

public class DespachoAVentas extends Entity<DespachoAVentasId> {

    private Planilla planilla;

    public DespachoAVentas(DespachoAVentasId despachoAVentasId, Planilla planilla) {
        super(despachoAVentasId);
        this.planilla = planilla;
    }

    //Comportamientos
    public void despacharMedicamentos(Planilla planilla){
        this.planilla = Objects.requireNonNull(planilla);
    }

    //Propiedades

    public Planilla planilla() {
        return planilla;
    }
}
