package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class VerificarContenido extends Command {

    private final Estado estado;
    private final PedidoId pedidoId;
    private final AlmacenamientoId almacenamientoId;
    private final RecepcionId recepcionId;


    public VerificarContenido(AlmacenamientoId almacenamientoId, RecepcionId recepcionId, PedidoId pedidoId, Estado estado){
        this.estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);
        this.pedidoId = pedidoId;
        this.almacenamientoId = almacenamientoId;
        this.recepcionId = recepcionId;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public RecepcionId getRecepcionId() {
        return recepcionId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
