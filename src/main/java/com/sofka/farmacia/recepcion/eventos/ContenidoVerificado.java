package com.sofka.farmacia.recepcion.eventos;


import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;

public class ContenidoVerificado extends DomainEvent {

    private Estado estado;
    private PedidoId pedidoId;

    public ContenidoVerificado(PedidoId pedidoId, Estado estado) {
        super("sofka.farmacia.contenidoverificado");
    }

    public Estado getEstado() {
        return estado;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
}
