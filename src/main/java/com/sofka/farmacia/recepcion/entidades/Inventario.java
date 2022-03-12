package com.sofka.farmacia.recepcion.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.recepcion.values.InventarioId;
import com.sofka.farmacia.recepcion.values.Novedades;
import com.sofka.farmacia.recepcion.values.Planillas;

public class Inventario extends Entity<InventarioId> {

    private Novedades novedades;
    private Planillas planillas;

    public Inventario(InventarioId inventarioId, Novedades novedades, Planillas planillas) {
        super(inventarioId);
        this.novedades = novedades;
        this.planillas = planillas;
    }

    //Comportamientos

    public void realizarInventario(Planillas planillas){
        this.planillas = planillas;
    }
    public void registrarNovedades(Novedades novedades){
        this.novedades = novedades;
    }

    //Propiedades


    public Novedades novedades() {
        return novedades;
    }

    public Planillas planillas() {
        return planillas;
    }
}
