package com.sofka.farmacia.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.almacenamiento.Almacenamiento;
import com.sofka.farmacia.almacenamiento.comandos.VerificarCuarentena;

public class VerificarCuarentenaUseCase extends UseCase<RequestCommand<VerificarCuarentena>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<VerificarCuarentena> input) {
        var command = input.getCommand();
        var almacenamiento = new Almacenamiento(command.getAlmacenamientoId(), command.getDatosDelLaboratorio(), command.getEstante(), command.getMedicamento(), command.getClasificacion());
        emit().onResponse(new ResponseEvents(almacenamiento.getUncommittedChanges()));
    }
}
