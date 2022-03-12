package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;

import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class RecibirPedido extends Command {

    private PedidoId pedidoId;
    private RecepcionId recepcionId;
    private Estado estado;

    public RecibirPedido(PedidoId pedidoId, RecepcionId recepcionId, Estado estado){
        this.pedidoId = pedidoId;
        this.recepcionId = recepcionId;
        this.estado = estado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public Estado getEstado() {
        return estado;
    }
}
