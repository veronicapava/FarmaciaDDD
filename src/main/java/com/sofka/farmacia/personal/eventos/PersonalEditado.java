package com.sofka.farmacia.personal.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;

public class PersonalEditado extends DomainEvent {
    private DatosPersonales datosPersonales;
    private PersonalId personalId;

    public PersonalEditado(PersonalId personalId, DatosPersonales datosPersonales) {
        super("sofka.farmacia.personaleditado");
        this.personalId = personalId;
        this.datosPersonales = datosPersonales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
