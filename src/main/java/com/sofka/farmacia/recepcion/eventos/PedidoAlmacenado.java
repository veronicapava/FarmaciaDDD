package com.sofka.farmacia.recepcion.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.values.Estado;

public class PedidoAlmacenado extends DomainEvent {

    private AlmacenamientoId almacenamientoId;
    private Estado estado;

    public PedidoAlmacenado(AlmacenamientoId almacenamientoId, Estado estado) {
        super("sofka.farmacia.pedidoalmacenado");
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
