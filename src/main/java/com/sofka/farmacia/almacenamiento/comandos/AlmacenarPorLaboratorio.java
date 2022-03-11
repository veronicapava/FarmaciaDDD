package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;
import com.sofka.farmacia.almacenamiento.values.LaboratorioId;

public class AlmacenarPorLaboratorio extends Command {
    private LaboratorioId laboratorioId;
    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public AlmacenarPorLaboratorio(LaboratorioId laboratorioId, DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        this.laboratorioId = laboratorioId;
        this.datosDelLaboratorio = datosDelLaboratorio;
        this.estante = estante;
    }

    public LaboratorioId getLaboratorioId() {
        return laboratorioId;
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }
}
