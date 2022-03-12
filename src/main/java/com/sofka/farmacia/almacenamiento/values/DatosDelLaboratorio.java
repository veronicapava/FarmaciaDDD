package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosDelLaboratorio implements ValueObject<String> {

    private final String nombreLab;

    public DatosDelLaboratorio(String nombreLab) {
        Objects.requireNonNull(nombreLab);
        this.nombreLab = nombreLab;

        if(this.nombreLab.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
    }


    @Override
    public String value() {
        return nombreLab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosDelLaboratorio)) return false;
        DatosDelLaboratorio that = (DatosDelLaboratorio) o;
        return nombreLab.equals(that.nombreLab);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreLab);
    }
}
