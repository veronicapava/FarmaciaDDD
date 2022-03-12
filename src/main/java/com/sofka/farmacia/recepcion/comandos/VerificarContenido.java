package com.sofka.farmacia.recepcion.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.recepcion.values.Estado;

public class VerificarContenido extends Command {

    private Estado estado;

    private VerificarContenido(Estado estado){
        this.estado = new Estado(Estado.Fase.REVISANDO_PEDIDO);
    }

    public Estado getEstado() {
        return estado;
    }
}
