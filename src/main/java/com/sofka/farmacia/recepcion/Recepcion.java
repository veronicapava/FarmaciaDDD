package com.sofka.farmacia.recepcion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.farmacia.almacenamiento.values.AlmacenamientoId;
import com.sofka.farmacia.personal.values.PersonalId;
import com.sofka.farmacia.recepcion.entidades.Inventario;
import com.sofka.farmacia.recepcion.entidades.Pedido;
import com.sofka.farmacia.recepcion.entidades.Proovedor;
import com.sofka.farmacia.recepcion.eventos.ContenidoVerificado;
import com.sofka.farmacia.recepcion.eventos.PedidoAlmacenado;
import com.sofka.farmacia.recepcion.eventos.PedidoRecibido;
import com.sofka.farmacia.recepcion.eventos.PersonalSeleccionado;
import com.sofka.farmacia.recepcion.values.Estado;
import com.sofka.farmacia.recepcion.values.PedidoId;
import com.sofka.farmacia.recepcion.values.RecepcionId;
import java.util.List;
import java.util.Objects;

public class Recepcion extends AggregateEvent<RecepcionId> {

    protected RecepcionId recepcionId;
    private PersonalId personalId;
    private AlmacenamientoId almacenamientoId;
    private Inventario inventario;
    private List<Proovedor> proovedor;
    private Pedido pedido;
    private PedidoId pedidoId;
    private Estado estado;


    public Recepcion(RecepcionId recepcionId, AlmacenamientoId almacenamientoId, PedidoId pedidoId, Estado estado) {
        super(recepcionId);
        appendChange(new PedidoRecibido(recepcionId, almacenamientoId, pedidoId, estado)).apply();
        appendChange(new PedidoAlmacenado(almacenamientoId,recepcionId,pedidoId,estado)).apply();
        appendChange(new ContenidoVerificado(recepcionId, almacenamientoId, pedidoId, estado));
    }

    public Recepcion(RecepcionId recepcionId, PersonalId personalId){
        super(recepcionId);
        appendChange(new PersonalSeleccionado(personalId)).apply();
    }

    //Comportamientos

    public void recibirPedido(RecepcionId recepcionId, PedidoId pedidoid, Estado estado){
        appendChange(new PedidoRecibido(recepcionId, almacenamientoId, pedidoid,estado)).apply();
    }

    public void verificarContenido(AlmacenamientoId almacenamientoId, RecepcionId recepcionId, PedidoId pedidoId, Estado estado){
        appendChange(new ContenidoVerificado( recepcionId, almacenamientoId, pedidoId, estado)).apply();
    }

   public void almacenarPedido(AlmacenamientoId almacenamientoId,RecepcionId recepcionId, PedidoId pedidoId, Estado estado){
        Objects.requireNonNull(almacenamientoId);
        appendChange(new PedidoAlmacenado(almacenamientoId, recepcionId, pedidoId,estado)).apply();
    }

    public void seleccionarPersonal(PersonalId personalId){
        Objects.requireNonNull(personalId);
        appendChange(new PersonalSeleccionado(personalId)).apply();
    }
}
