package com.sofka.farmacia;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.farmacia.almacenamiento.comandos.DespacharMedicamentos;
import com.sofka.farmacia.almacenamiento.eventos.MedicamentosDespachados;
import com.sofka.farmacia.almacenamiento.usecases.DespacharMedicamentosUseCase;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DespachoAVentasId;
import com.sofka.farmacia.almacenamiento.values.Planilla;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class DespacharMedicamentosUseCaseTest {

    @Test
    void despacharMedicamentos(){
        //arrange
        AlmacenamientoId almacenamientoId = new AlmacenamientoId();
        DespachoAVentasId despachoAVentaId = new DespachoAVentasId();
        Planilla planilla = new Planilla("Vero", new Date(), "acetaminofen", 3);

        var command = new DespacharMedicamentos(despachoAVentaId, planilla, almacenamientoId);
        var usecase = new DespacharMedicamentosUseCase();
        //act

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert

        var event = (MedicamentosDespachados)events.get(0);
        Assertions.assertEquals("sofka.farmacia.medicamentosdespachados", event.type);
    }
}
