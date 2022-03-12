package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.almacenamiento.comandos.AlmacenarPorLaboratorio;
import com.sofka.farmacia.almacenamiento.eventos.AlmacenadoPorLaboratorio;
import com.sofka.farmacia.almacenamiento.usecases.AlmacenarPorLaboratorioUseCase;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;
import com.sofka.farmacia.almacenamiento.values.LaboratorioId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlmacenarPorLaboratorioUseCaseTest {

    @Test
    void almacenarPorLaboratorio(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        LaboratorioId laboratorioId = new LaboratorioId();
        DatosDelLaboratorio datosDelLaboratorio = new DatosDelLaboratorio("Genfar");
        Estante estante = new Estante(1);

        var command = new AlmacenarPorLaboratorio(almacenamientoId, datosDelLaboratorio, estante);
        var usecase= new AlmacenarPorLaboratorioUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AlmacenadoPorLaboratorio)events.get(0);
        Assertions.assertEquals("sofka.farmacia.almacenadoporlaboratorio", event.type);
        Assertions.assertEquals(almacenamientoId.value(), event.aggregateRootId());
    }
}
