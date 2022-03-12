package com.sofka.farmacia.recepcion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Novedades implements ValueObject<String> {
    private final String novedades;

    public Novedades(String novedades) {
        Objects.requireNonNull(novedades);
        this.novedades = novedades;

        if(this.novedades.isBlank()){
            throw new IllegalArgumentException("Las novedades no pueden estar vacías");
        }
    }

    @Override
    public String value() {
        return novedades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Novedades)) return false;
        Novedades novedades1 = (Novedades) o;
        return novedades.equals(novedades1.novedades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(novedades);
    }
}
