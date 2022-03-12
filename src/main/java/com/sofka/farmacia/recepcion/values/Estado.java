package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.Fase> {

    private final Fase value;

    public Estado(Fase value){
        this.value = value;
    }

    @Override
    public Fase value() {
        return value;
    }

    public enum Fase {
        REVISANDO_PEDIDO, RECHAZANDO_PEDIDO, SOLICITAR_PEDIDO
    }
}
