package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.recepcion.comandos.SeleccionarPersonal;
import com.sofka.farmacia.recepcion.eventos.PersonalSeleccionado;
import com.sofka.farmacia.recepcion.usecases.SeleccionarPersonalUseCase;
import com.sofka.farmacia.recepcion.values.RecepcionId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeleccionarPersonalUseCaseTest {

    @Test
    void seleccionarPersonal(){
        //arrange
        PersonalId personalId = new PersonalId();
        RecepcionId recepcionId = new RecepcionId();

        var command = new SeleccionarPersonal(personalId, recepcionId);
        var usecase = new SeleccionarPersonalUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PersonalSeleccionado)events.get(0);
        Assertions.assertEquals("sofka.farmacia.personalseleccionado", event.type);
        Assertions.assertEquals(recepcionId.value(), event.aggregateRootId());
        Assertions.assertNotNull(personalId);
    }
}
