package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String direccionProov;

    public Direccion(String direccionProov) {
        Objects.requireNonNull(direccionProov);
        this.direccionProov = direccionProov;

        if(this.direccionProov.isBlank()){
            throw new IllegalArgumentException("La dirección no puede ser vacía");
        }
    }

    @Override
    public String value() {
        return direccionProov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion direccion = (Direccion) o;
        return direccionProov.equals(direccion.direccionProov);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccionProov);
    }
}
