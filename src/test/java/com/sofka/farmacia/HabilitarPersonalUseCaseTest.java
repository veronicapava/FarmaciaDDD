package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.personal.comandos.HabilitarPersonal;
import com.sofka.farmacia.personal.eventos.PersonalHabilitado;
import com.sofka.farmacia.personal.usecases.HabilitarPersonalUseCase;
import com.sofka.farmacia.personal.values.PersonalId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HabilitarPersonalUseCaseTest {


    @Test
    void habilitarPersonal(){
        //arrange:
        PersonalId personalId = new PersonalId();
        var command = new HabilitarPersonal(personalId);
        var usecase = new HabilitarPersonalUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event =(PersonalHabilitado)events.get(0);
        Assertions.assertEquals("sofka.farmacia.personalhabilitado", event.type);
        Assertions.assertEquals(personalId.value(), event.aggregateRootId());
    }

}

