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
            almacenamiento.verificarCuarentena(event.getAlmacenamientoId(), event.getDatosDelLaboratorio(), event.getEstante(), event.getClasificacion(), event.getMedicamento());
        });

        apply((MedicamentosDespachados event ) -> {
            almacenamiento.despacharMedicamentos(event.getAlmacenamientoId(),event.getDespachoAVentaId(), event.getPlanilla());
        });

        apply((ListadeLabsGenerada event)->{
            almacenamiento.laboratorio = null;
        });

    }
}
