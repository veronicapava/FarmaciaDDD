package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.personal.comandos.CrearPersonal;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.personal.usecases.CrearPersonalUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearPersonalUseCaseTest {

    @Test
    void crearPersonal(){
        //arrange
        PersonalId personalId = new PersonalId();
        DatosPersonales datosPersonales = new DatosPersonales("Veronica", "Pava");
        var command = new CrearPersonal(personalId, datosPersonales);
        var usecase = new CrearPersonalUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (PersonalCreado)events.get(1);
        Assertions.assertEquals("sofka.farmacia.personalcreado", event.type);
        Assertions.assertEquals(personalId.value(),event.aggregateRootId());
    }
}