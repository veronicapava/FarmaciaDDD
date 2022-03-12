package com.sofka.farmacia.personal.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.farmacia.personal.Personal;
import com.sofka.farmacia.personal.comandos.HabilitarPersonal;
import com.sofka.farmacia.personal.values.DatosPersonales;

public class HabilitarPersonalUseCase extends UseCase<RequestCommand<HabilitarPersonal>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<HabilitarPersonal> habilitarPersonalRequestCommand) {
        var command = habilitarPersonalRequestCommand.getCommand();
        var dtosPerson= new DatosPersonales("aaaa","bbbb");
        var personal = new Personal(command.getPersonalId(),dtosPerson );
        emit().onResponse(new ResponseEvents(personal.getUncommittedChanges()));
    }
}
