package com.sofka.farmacia.almacenamiento.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.almacenamiento.Almacenamiento;
import com.sofka.farmacia.almacenamiento.comandos.DespacharMedicamentos;

public class DespacharMedicamentosUseCase extends UseCase<RequestCommand<DespacharMedicamentos>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DespacharMedicamentos> input) {
        var command = input.getCommand();
        var almacenamiento = new Almacenamiento(command.getAlmacenamientoId(),command.getDespachoAVentaId(), command.getPlanilla());
        emit().onResponse(new ResponseEvents(almacenamiento.getUncommittedChanges()));
    }
}
