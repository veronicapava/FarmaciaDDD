package com.sofka.farmacia.recepcion.entidades;


import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.FechaRecibido;
import com.sofka.farmacia.recepcion.values.PedidoId;

public class Pedido extends Entity<PedidoId> {

    private Estado estado;
    private FechaRecibido fechaRecibido;

    public Pedido(PedidoId pedidoId, Estado estado, FechaRecibido fechaRecibido) {
        super(pedidoId);
        this.estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);
        this.fechaRecibido = fechaRecibido;
    }

    //Comportamientos

    public void solicitarPedido(Estado estado) {
        this.estado = new Estado(Estado.Fase.SOLICITAR_PEDIDO);
    }

    public void verificarContenido(Estado estado, FechaRecibido fechaRecibido) {
        this.estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);
        this.fechaRecibido = fechaRecibido;
    }

    public void rechazarPedido(Estado estado){
        this.estado = new Estado(Estado.Fase.RECHAZANDO_PEDIDO);
    }

    //Propiedades

    public Estado estado() {
        return estado;
    }

    public FechaRecibido fechaRecibido() {
        return fechaRecibido;
    }
}
