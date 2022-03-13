package com.sofka.farmacia.recepcion.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class PedidoAlmacenado extends DomainEvent {

    private AlmacenamientoId almacenamientoId;
    private PedidoId pedidoId;
    private Estado estado;
    private RecepcionId recepcionId;

    public PedidoAlmacenado(AlmacenamientoId almacenamientoId, RecepcionId recepcionId,PedidoId pedidoId,  Estado estado) {
        super("sofka.farmacia.pedidoalmacenado");
        this.almacenamientoId = almacenamientoId;
        this.pedidoId = pedidoId;
        this.estado = estado;
        this.recepcionId = recepcionId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
