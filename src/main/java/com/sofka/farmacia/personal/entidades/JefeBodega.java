package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.Estado;
import com.sofka.farmacia.personal.values.JefeBodegaId;

import java.util.Objects;

public class JefeBodega extends Entity<JefeBodegaId> {

    private DatosPersonales datosPersonales;
    private Estado estado;

    public JefeBodega(JefeBodegaId jefeBodId, DatosPersonales datosPersonales) {
        super(jefeBodId);
        this.datosPersonales = datosPersonales;
        this.estado = new Estado(Estado.Fase.NO_REALIZA_INVENTARIO);
    }

    //comportamientos
    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void realizarInventarios(){
        this.estado = new Estado(Estado.Fase.SE_REALIZA_INVENTARIO);
    }

    public void solicitarPedidos() {
        this.estado = new Estado(Estado.Fase.SOLICITANDO_PEDIDO);
    }

    //Propiedades

    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }

    public Estado estado() {
        return estado;
    }
}
