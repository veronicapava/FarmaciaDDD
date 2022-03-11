package com.sofka.farmacia.almacenamiento.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.almacenamiento.values.Clasificacion;
import com.sofka.farmacia.almacenamiento.values.Medicamento;

public class VerificarCuarentena extends Command {

    private Medicamento medicamento;
    private Clasificacion clasificacion;

    public VerificarCuarentena(Medicamento medicamento, Clasificacion clasificacion) {
        this.medicamento = medicamento;
        this.clasificacion = clasificacion;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
