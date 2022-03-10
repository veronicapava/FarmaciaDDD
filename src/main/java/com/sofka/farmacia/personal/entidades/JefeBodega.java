package com.sofka.farmacia.personal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.JefeBodegaId;

import java.util.Objects;

public class JefeBodega extends Entity<JefeBodegaId> {

    private DatosPersonales datosPersonales;

    public JefeBodega(JefeBodegaId entityId, DatosPersonales datosPersonales) {
        super(entityId);
        this.datosPersonales = datosPersonales;
    }

    //comportamientos
    public void actualizarDatos(DatosPersonales datosPersonales){
        this.datosPersonales = Objects.requireNonNull(datosPersonales);
    }

    public void realizarInventarios(){}

    public void solicitarPedidos() {}

    //Getter
    public DatosPersonales datosPersonales() {
        return datosPersonales;
    }
}
