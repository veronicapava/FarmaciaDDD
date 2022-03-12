package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.values.PedidoId;

public class AlmacenarPedido extends Command {

    private AlmacenamientoId almacenamientoId;
    private PedidoId pedidoId;

    public AlmacenarPedido(AlmacenamientoId almacenamientoId, PedidoId pedidoId){
        this.almacenamientoId = almacenamientoId;
        this.pedidoId = pedidoId;

    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
}
