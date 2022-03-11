package com.sofka.farmacia.almacenamiento;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.farmacia.almacenamiento.eventos.AlmacenadoPorLaboratorio;
import com.sofka.farmacia.almacenamiento.eventos.CuarentenaVerificada;
import com.sofka.farmacia.almacenamiento.eventos.ListadeLabsGenerada;
import com.sofka.farmacia.almacenamiento.eventos.MedicamentosDespachados;


public class AlmacenamientoChange extends EventChange {
    public AlmacenamientoChange(Almacenamiento almacenamiento){
        apply((AlmacenadoPorLaboratorio event ) ->{
            almacenamiento.cuarentena = null;
            almacenamiento.despachoAVentas = null;
            almacenamiento.laboratorio = null;
        });

        apply((CuarentenaVerificada event) ->{
            almacenamiento.cuarentena = null;
        });

        apply((MedicamentosDespachados event ) -> {
            almacenamiento.despachoAVentas = null;
        });

        apply((ListadeLabsGenerada event)->{
            almacenamiento.laboratorio = null;
        });

    }
}
