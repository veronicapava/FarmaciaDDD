package com.sofka.farmacia.almacenamiento.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;

public class ListadeLabsGenerada extends DomainEvent {

    private DatosDelLaboratorio datosDelLaboratorio;
    private Estante estante;

    public ListadeLabsGenerada(DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        super("sofka.farmacia.listaDeLabsGenerada");
    }

    public DatosDelLaboratorio getDatosDelLaboratorio() {
        return datosDelLaboratorio;
    }

    public Estante getEstante() {
        return estante;
    }
}
