package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Planilla implements ValueObject<Planilla.Props> {

    private final String nombreDeQuienRetira;
    private final Date fechaDeRetiro;
    private final String nombreDeCadaMedicamentoRetirado;
    private final double cantidadDeCadaMedicamentoRetirado;


    public Planilla(String nombreDeQuienRetira, Date fechaDeRetiro, String nombreDeCadaMedicamentoRetirado, double cantidadDeCadaMedicamentoRetirado) {
        Objects.requireNonNull(nombreDeQuienRetira);
        Objects.requireNonNull(fechaDeRetiro);
        Objects.requireNonNull(nombreDeCadaMedicamentoRetirado);
        Objects.requireNonNull(cantidadDeCadaMedicamentoRetirado);
        this.nombreDeQuienRetira = nombreDeQuienRetira;
        this.fechaDeRetiro = fechaDeRetiro;
        this.nombreDeCadaMedicamentoRetirado = nombreDeCadaMedicamentoRetirado;
        this.cantidadDeCadaMedicamentoRetirado = cantidadDeCadaMedicamentoRetirado;
    }
    
    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombreDeQuienRetira() {
                return nombreDeQuienRetira;
            }

            @Override
            public String nombreDeCadaMedicamentoRetirado() {
                return nombreDeCadaMedicamentoRetirado;
            }

            @Override
            public double cantidadDeCadaMedicamentoRetirado() {
                return cantidadDeCadaMedicamentoRetirado;
            }

            @Override
            public Date fechaDeRetiro() {
                return fechaDeRetiro;
            }

        };
    }

    public interface Props{
        String nombreDeQuienRetira();
        String nombreDeCadaMedicamentoRetirado();
        double cantidadDeCadaMedicamentoRetirado();
        Date fechaDeRetiro();
    }
}
