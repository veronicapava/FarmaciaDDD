package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.recepcion.comandos.RecibirPedido;
import com.sofka.farmacia.recepcion.eventos.PedidoRecibido;
import com.sofka.farmacia.recepcion.usecases.RecibirPedidoUseCase;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.ProovedorId;
import com.sofka.farmacia.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecibirPedidoUseCaseTest {

    @Test
    void recibirPedido(){
        //arrange
        RecepcionId recepcionId = new RecepcionId();
        PedidoId pedidoId = PedidoId.of("xxxx");
        ProovedorId proovedorId = new ProovedorId();
        Estado estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);

        var command = new RecibirPedido(pedidoId, recepcionId, estado);
        var usecase = new RecibirPedidoUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PedidoRecibido)events.get(0);
        Assertions.assertEquals("sofka.farmacia.pedidorecibido", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());

    }
}
