package com.sofka.farmacia.almacenamiento.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.farmacia.personal.values.Estado;

public class Clasificacion implements ValueObject<Clasificacion.Fase> {

    private final Clasificacion.Fase value;

    public Clasificacion(Fase value){
        this.value = value;
    }

    @Override
    public Clasificacion.Fase value() {
        return value;
    }

    public enum Fase {
        AVERIADO, FECHA_PROXIMA_A_VENCER, VENCIDO
    }

}
