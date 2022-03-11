package com.sofka.farmacia.personal.values;

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
        RECIBIDO, NO_RECIBIDO, DELEGAR_TAREA, SIN_TAREAS_POR_ASIGNAR,
        NO_REALIZA_INVENTARIO, SE_REALIZA_INVENTARIO,
        SIN_PEDIDO_POR_SOLICITAR, SOLICITANDO_PEDIDO
    }
}
