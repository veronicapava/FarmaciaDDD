package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.AuxiliarFarmaciaId;
import com.sofka.farmacia.personal.values.DatosPersonales;

import java.util.Objects;

public class AuxiliarFarmacia extends Entity<AuxiliarFarmaciaId> {
    private DatosPersonales datosPersonales;
    public AuxiliarFarmacia(AuxiliarFarmaciaId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales = datosPersonales;
    }

    //comportamientos

    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void recibirPedido(){
    }

    public void almacenarPedidoRecibido(){
    }

    //getter

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }
}
