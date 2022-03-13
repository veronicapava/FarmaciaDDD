package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.comandos.AlmacenarPedido;
import com.sofka.farmacia.recepcion.eventos.PedidoAlmacenado;
import com.sofka.farmacia.recepcion.usecases.AlmacenarPedidoUseCase;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlmacenarPedidoUseCaseTest {

    @Test
    void almacenarPedido(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        RecepcionId recepcionId = new RecepcionId();
        PedidoId pedidoId = new PedidoId();
        Estado estado = new Estado(Estado.Fase.ALMACENANDO_PEDIDO);

        var command = new AlmacenarPedido(almacenamientoId, pedidoId, recepcionId, estado);
        var usecase = new AlmacenarPedidoUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (PedidoAlmacenado)events.get(1);
        Assertions.assertEquals("sofka.farmacia.pedidoalmacenado", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());
        Assertions.assertNotNull(pedidoId);
    }
}
