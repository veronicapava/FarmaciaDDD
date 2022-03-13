package com.sofka.farmacia.recepcion.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.recepcion.Recepcion;
import com.sofka.farmacia.recepcion.comandos.VerificarContenido;


public class VerificarContenidoUseCase extends UseCase<RequestCommand<VerificarContenido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<VerificarContenido> input) {
        var command = input.getCommand();
        var recepcion = new Recepcion(command.getRecepcionId(), command.getAlmacenamientoId(), command.getPedidoId(), command.getEstado());
        emit().onResponse(new ResponseEvents(recepcion.getUncommittedChanges()));
    }

}
