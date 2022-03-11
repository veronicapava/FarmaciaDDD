package com.sofka.farmacia.almacenamiento;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.almacenamiento.entidades.Cuarentena;
import com.sofka.farmacia.almacenamiento.entidades.DespachoAVentas;
import com.sofka.farmacia.almacenamiento.entidades.Laboratorio;
import com.sofka.farmacia.almacenamiento.eventos.AlmacenadoPorLaboratorio;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.almacenamiento.values.DatosDelLaboratorio;
import com.sofka.farmacia.almacenamiento.values.Estante;

import java.util.List;


public class Almacenamiento extends AggregateEvent<AlmacenamientoId> {

    protected Cuarentena cuarentena;
    protected DespachoAVentas despachoAVentas;
    protected List<Laboratorio> laboratorio;

    public Almacenamiento(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante) {
        super(almacenamientoId);
        appendChange(new AlmacenadoPorLaboratorio(almacenamientoId, datosDelLaboratorio, estante)).apply();
    }

    //Comportamientos

    public void almacenarPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante){
        appendChange(new AlmacenadoPorLaboratorio(almacenamientoId, datosDelLaboratorio, estante)).apply();
    }



}

