package com.sofka.farmacia.recepcion.eventos;


import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class PedidoRecibido extends DomainEvent {

    private Estado estado;
    private PedidoId pedidoId;
    private RecepcionId recepcionId;

    public PedidoRecibido(RecepcionId recepcionId, AlmacenamientoId almacenamientoId, PedidoId pedidoid, Estado estado) {
        super("sofka.farmacia.pedidorecibido");
    }

    public Estado getEstado() {
        return estado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }
}
