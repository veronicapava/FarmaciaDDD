package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.Planilla;

import java.util.Objects;

public class DespacharMedicamentos extends Command {
    private Planilla planilla;

    public DespacharMedicamentos(Planilla planilla) {
        Objects.requireNonNull(planilla);
        this.planilla = planilla;
    }

    public Planilla getPlanilla() {
        return planilla;
    }
}
