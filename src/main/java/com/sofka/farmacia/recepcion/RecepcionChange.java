package com.sofka.farmacia.recepcion;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.farmacia.recepcion.eventos.ContenidoVerificado;
import com.sofka.farmacia.recepcion.eventos.PedidoAlmacenado;
import com.sofka.farmacia.recepcion.eventos.PedidoRecibido;
import com.sofka.farmacia.recepcion.eventos.PersonalSeleccionado;

public class RecepcionChange extends EventChange {
    public RecepcionChange(Recepcion recepcion){
        apply((ContenidoVerificado event) ->{
            recepcion.verificarContenido(event.getPedidoId(), event.getEstado());
        });

        apply((PedidoAlmacenado event) -> {
            recepcion.almacenarPedido(event.getAlmacenamientoId(), event.getRecepcionId(), event.getPedidoId(),event.getEstado());
        });

        apply((PedidoRecibido event) ->{
            recepcion.recibirPedido(event.getRecepcionId(),event.getPedidoId(),event.getEstado());
        });

        apply((PersonalSeleccionado event ) ->{
            recepcion.seleccionarPersonal(event.getPersonalId());
        });
    }
}
