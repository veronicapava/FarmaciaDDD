package com.sofka.farmacia.recepcion.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.recepcion.Recepcion;
import com.sofka.farmacia.recepcion.comandos.SeleccionarPersonal;

public class SeleccionarPersonalUseCase  extends UseCase<RequestCommand<SeleccionarPersonal>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<SeleccionarPersonal> input) {
        var command = input.getCommand();
        var recepcion = new Recepcion(command.getRecepcionId(),command.getPersonalId());
        emit().onResponse(new ResponseEvents(recepcion.getUncommittedChanges()));
    }
}
