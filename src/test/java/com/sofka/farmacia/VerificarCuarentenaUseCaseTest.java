package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.almacenamiento.comandos.VerificarCuarentena;
import com.sofka.farmacia.almacenamiento.eventos.CuarentenaVerificada;
import com.sofka.farmacia.almacenamiento.usecases.VerificarCuarentenaUseCase;
import com.sofka.farmacia.almacenamiento.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VerificarCuarentenaUseCaseTest  {

    @Test
    void verificarCuarentena(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        DatosDelLaboratorio datosDelLaboratorio = new DatosDelLaboratorio("tecnoquimicas");
        Estante estante = new Estante(2);
        Medicamento medicamento = new Medicamento("acetaminofen");
        Clasificacion clasificacion = new Clasificacion(Clasificacion.Fase.AVERIADO);
        CuarentenaId cuarentenaId = new CuarentenaId();

        var command = new VerificarCuarentena(almacenamientoId, datosDelLaboratorio, estante, cuarentenaId, medicamento, clasificacion);
        var usecase = new VerificarCuarentenaUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (CuarentenaVerificada)events.get(1);
        Assertions.assertEquals("sofka.farmacia.cuarentenaverificada", event.type);
        Assertions.assertNotNull(cuarentenaId.value());
    }
}
