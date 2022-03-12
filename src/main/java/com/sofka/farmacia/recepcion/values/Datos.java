package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Datos implements ValueObject<String> {

    private final String nombreProov;

    public Datos(String nombreProov) {
        Objects.requireNonNull(nombreProov);
        this.nombreProov = nombreProov;

        if(this.nombreProov.isBlank()){
            throw new IllegalArgumentException("El nombre del proovedor no puede ser vacío");
        }

        if(this.nombreProov.length() >= 50){
            throw new IllegalArgumentException("El nombre del proovedor no puede ser tal largo");
        }
    }


    @Override
    public String value() {
        return nombreProov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Datos)) return false;
        Datos datos = (Datos) o;
        return nombreProov.equals(datos.nombreProov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreProov);
    }
}
