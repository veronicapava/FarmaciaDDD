package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DespachoAVentasId;
import com.sofka.farmacia.almacenamiento.values.Planilla;

public class MedicamentosDespachados extends DomainEvent {

    private AlmacenamientoId almacenamientoId;
    private DespachoAVentasId despachoAVentaId;
    private Planilla planilla;


    public MedicamentosDespachados(AlmacenamientoId almacenamientoId,DespachoAVentasId despachoAVentaId, Planilla planilla) {
        super("sofka.farmacia.medicamentosdespachados");
        this.almacenamientoId = almacenamientoId;
        this.despachoAVentaId = despachoAVentaId;
        this.planilla = planilla;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }

    public DespachoAVentasId getDespachoAVentaId() {
        return despachoAVentaId;
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}
