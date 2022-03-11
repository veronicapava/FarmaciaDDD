package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.Planilla;

public class MedicamentosDespachados extends DomainEvent {

    private Planilla planilla;

    public MedicamentosDespachados(Planilla planilla) {
        super("sofka.farmacia.medicamentosDespachados");
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}
