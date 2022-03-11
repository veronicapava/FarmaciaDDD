package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;

public class AlmacenarPorLaboratorio extends Command {
    private AlmacenamientoId almacenamientoId;
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public AlmacenarPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        this.almacenamientoId = almacenamientoId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }

    public AlmacenamientoId getAlmacenamientoId() {
        return almacenamientoId;
    }
}
