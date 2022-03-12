package com.sofka.farmacia.personal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<String> {

    private final String nombre;
    private final String apellido;

    public DatosPersonales(String nombre, String apellido) {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(apellido);
        this.nombre = nombre;
        this.apellido = apellido;

        if(this.nombre.length() <= 2){
            throw new IllegalArgumentException("El nombre debe tener más de 2 caracteres");
        }
        if(this.apellido.length() <= 2){
            throw new IllegalArgumentException("El apellido debe tener más de 2 caracteres");
        }

        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no puede ser vacío");
        }
    }


    @Override
    public String value() {
        return nombre+apellido ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DatosPersonales)) return false;
        DatosPersonales that = (DatosPersonales) o;
        return nombre.equals(that.nombre) && apellido.equals(that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
