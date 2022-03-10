package com.sofka.farmacia.recepcion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.recepcion.values.RecepcionId;

public class Recepcion extends AggregateEvent<RecepcionId> {
    public Recepcion(RecepcionId entityId) {
        super(entityId);
    }
}
