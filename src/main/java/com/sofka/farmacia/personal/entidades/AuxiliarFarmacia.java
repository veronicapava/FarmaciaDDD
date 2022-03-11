package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.AuxiliarFarmaciaId;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.Estado;

import java.util.Objects;

public class AuxiliarFarmacia extends Entity<AuxiliarFarmaciaId> {
    private DatosPersonales datosPersonales;
    private Estado estado;


    public AuxiliarFarmacia(AuxiliarFarmaciaId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales = datosPersonales;
        this.estado = new Estado(Estado.Fase.NO_RECIBIDO);
    }

    //comportamientos

    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void recibirPedido(){
        this.estado = new Estado(Estado.Fase.RECIBIDO);
    }

    public void almacenarPedidoRecibido(){
        //Regla de dominio
        if(this.estado.value().equals(Estado.Fase.RECIBIDO)){
            System.out.println("Se almacenó el pedido");
        } else {
            throw new IllegalArgumentException("No se puede almacenar el pedido, ya que no se recibió");
        }
    }

    //Propiedades

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

    public Estado estado() {
        return estado;
    }
}
