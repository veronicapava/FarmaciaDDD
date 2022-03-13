package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.personal.comandos.EditarPersonal;
import com.sofka.farmacia.personal.eventos.PersonalEditado;
import com.sofka.farmacia.personal.usecases.EditarPersonalUseCase;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EditarPersonalUseCaseTest {

    @Test
    void editarPersonal() {

        //arrange
        PersonalId personalId = new PersonalId();
        DatosPersonales datosPersonales = new DatosPersonales("Vero", "Pava");
        var command = new EditarPersonal(personalId, datosPersonales);
        var usecase = new EditarPersonalUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PersonalEditado) events.get(2);
        Assertions.assertEquals("sofka.farmacia.personaleditado", event.type);
        Assertions.assertEquals(personalId.value(), event.aggregateRootId());
        Assertions.assertEquals(personalId.value(), event.getPersonalId().value());
        Assertions.assertNotNull(personalId.value());
    }
}