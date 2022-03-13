package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.recepcion.comandos.VerificarContenido;
import com.sofka.farmacia.recepcion.eventos.ContenidoVerificado;
import com.sofka.farmacia.recepcion.usecases.VerificarContenidoUseCase;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VerificarContenidoUseCaseTest {

     @Test
    void verificarContenido(){
         //arrange
         AlmacenamientoId almacenamientoId = new AlmacenamientoId();
         RecepcionId recepcionId = new RecepcionId();
         PedidoId pedidoId = new PedidoId();
         Estado estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);

         var command = new VerificarContenido(almacenamientoId, recepcionId,pedidoId,estado);
         var usecase = new VerificarContenidoUseCase();

         //act
         var events= UseCaseHandler.getInstance()
                 .syncExecutor(usecase, new RequestCommand<>(command))
                 .orElseThrow()
                 .getDomainEvents();

         //assert
         var event = (ContenidoVerificado)events.get(2);
         Assertions.assertEquals("sofka.farmacia.contenidoverificado", event.type);
         Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());
         Assertions.assertNotNull(pedidoId);
     }
}
