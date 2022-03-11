package com.sofka.farmacia.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.almacenamiento.Almacenamiento;
import com.sofka.farmacia.almacenamiento.comandos.AlmacenarPorLaboratorio;


public class AlmacenarPorLaboratorioUseCase extends UseCase<RequestCommand<AlmacenarPorLaboratorio>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AlmacenarPorLaboratorio> input) {
        var command = input.getCommand();
        var almacenamiento = new Almacenamiento(command.getAlmacenamientoId(), command.getDatosDelLaboratorio(), command.getEstante());
        emit().onResponse(new ResponseEvents(almacenamiento.getUncommittedChanges()));
    }
}