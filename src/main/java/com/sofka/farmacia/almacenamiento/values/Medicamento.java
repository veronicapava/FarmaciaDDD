package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Medicamento implements ValueObject<String> {
    private final String med;

    public Medicamento(String med) {
        this.med = med;
        if(this.value().isBlank()){
            throw new IllegalArgumentException("El nombre del medicamento no puede ser vacío");
        }

        if(this.med.length() <= 2){
            throw new IllegalArgumentException("El nombre debe tener más de 2 caracteres");
        }

        if(this.med.length() >= 30){
            throw new IllegalArgumentException("El nombre no debe tener más de 30 caracteres");
        }
    }

    public String value() {
        return med;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicamento)) return false;
        Medicamento that = (Medicamento) o;
        return med.equals(that.med);
    }

    @Override
    public int hashCode() {
        return Objects.hash(med);
    }
}
