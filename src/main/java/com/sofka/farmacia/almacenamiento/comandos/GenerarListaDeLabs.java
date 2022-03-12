package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;

import java.util.Objects;

public class GenerarListaDeLabs extends Command {
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public GenerarListaDeLabs(DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        Objects.requireNonNull(datosDelLaboratorio);
        Objects.requireNonNull(estante);
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }
}
