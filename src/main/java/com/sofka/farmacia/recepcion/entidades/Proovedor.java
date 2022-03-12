package com.sofka.farmacia.recepcion.entidades;

import co.com.sofka.domain.generic.Entity;
import com.sofka.farmacia.recepcion.values.Datos;
import com.sofka.farmacia.recepcion.values.Direccion;
import com.sofka.farmacia.recepcion.values.ProovedorId;

public class Proovedor extends Entity<ProovedorId> {

    private ProovedorId proovedorId;
    private Datos datos;
    private Direccion direccion;


    public Proovedor(ProovedorId proovedorId, Datos datos, Direccion direccion) {
        super(proovedorId);
        this.datos = datos;
        this.direccion = direccion;
    }

    //Comportamientos

    public void agregarProovedor(Datos datos, Direccion direccion){
        this.datos = datos;
        this.direccion = direccion;
    }

    public void editarProovedor(ProovedorId proovedorId){
        this.proovedorId = proovedorId;
    }

    public void eliminarProovedor(ProovedorId proovedorId){
        if(proovedorId != null){
            this.proovedorId = proovedorId;
        }
    }

    //Propiedades


    public ProovedorId proovedorId() {
        return proovedorId;
    }

    public Datos datos() {
        return datos;
    }

    public Direccion direccion() {
        return direccion;
    }
}
