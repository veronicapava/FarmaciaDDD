package com.sofka.farmacia.almacenamiento;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.almacenamiento.comandos.DespacharMedicamentos;
import com.sofka.farmacia.almacenamiento.entidades.Cuarentena;
import com.sofka.farmacia.almacenamiento.entidades.DespachoAVentas;
import com.sofka.farmacia.almacenamiento.entidades.Laboratorio;
import com.sofka.farmacia.almacenamiento.eventos.AlmacenadoPorLaboratorio;
import com.sofka.farmacia.almacenamiento.eventos.CuarentenaVerificada;
import com.sofka.farmacia.almacenamiento.eventos.MedicamentosDespachados;
import com.sofka.farmacia.almacenamiento.values.*;

import java.util.List;


public class Almacenamiento extends AggregateEvent<AlmacenamientoId> {

    protected Cuarentena cuarentena;
    protected DespachoAVentas despachoAVentas;
    protected List<Laboratorio> laboratorio;
    protected Medicamento medicamento;
    protected Clasificacion clasificacion;

    public Almacenamiento(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, Medicamento medicamento, Clasificacion clasificacion) {
        super(almacenamientoId);
        appendChange(new AlmacenadoPorLaboratorio(almacenamientoId, datosDelLaboratorio, estante, medicamento, clasificacion)).apply();
        appendChange(new CuarentenaVerificada(almacenamientoId, datosDelLaboratorio, estante, medicamento, clasificacion)).apply();

    }

    public Almacenamiento(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla) {
      super(almacenamientoId);
        appendChange(new MedicamentosDespachados(almacenamientoId, despachoAVentaId, planilla)).apply();
    }

    //Comportamientos

    public void almacenarPorLaboratorio(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante){
        appendChange(new AlmacenadoPorLaboratorio(almacenamientoId, datosDelLaboratorio, estante, medicamento, clasificacion)).apply();
    }

    public void verificarCuarentena(AlmacenamientoId almacenamientoId, DatosDelLaboratorio datosDelLaboratorio, Estante estante, Clasificacion clasificacion, Medicamento medicamento){
        appendChange(new CuarentenaVerificada(almacenamientoId, datosDelLaboratorio, estante, medicamento, clasificacion));
    }

    public void despacharMedicamentos(AlmacenamientoId almacenamientoId, DespachoAVentasId despachoAVentaId, Planilla planilla){
        appendChange(new MedicamentosDespachados(almacenamientoId, despachoAVentaId, planilla));
    }


}

