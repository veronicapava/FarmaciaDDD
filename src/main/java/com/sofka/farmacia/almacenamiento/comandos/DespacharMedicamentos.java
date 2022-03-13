package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DespachoAVentasId;
import com.sofka.farmacia.almacenamiento.values.Planilla;

import java.util.Objects;

public class DespacharMedicamentos extends Command {
    private final Planilla planilla;
    private final DespachoAVentasId despachoAVentaId;
    private final AlmacenamientoId almacenamientoId;

    public DespacharMedicamentos(DespachoAVentasId despachoAVentaId, Planilla planilla, AlmacenamientoId almacenamientoId1) {
        this.almacenamientoId = almacenamientoId1;
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
