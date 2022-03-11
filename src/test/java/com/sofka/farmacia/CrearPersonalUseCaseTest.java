package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.personal.comandos.CrearPersonal;
import com.sofka.farmacia.personal.eventos.PersonalCreado;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.usecases.CrearPersonalUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearPersonalUseCaseTest {

    @Test
    void crearPersonal(){
        //arrange: Inicializacion de objetos y asignacion de variables
        PersonalId personalId = new PersonalId();
        DatosPersonales datosPersonales = new DatosPersonales();
        var command = new CrearPersonal(personalId, datosPersonales);
        var usecase = new CrearPersonalUseCase();
        //act: invocacion del metodo a probar con los valores previamente inicializados
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert: verifica si el valor obtenido por el metodo antes ejecutado es el esperado
        var event = (PersonalCreado)events.get(0); //Eventos particulares
        Assertions.assertEquals("sofka.farmacia.personalcreado", event.type);
        Assertions.assertEquals(personalId.value(),event.aggregateRootId());
    }
}