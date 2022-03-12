package com.sofka.farmacia.personal.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;

import java.util.Objects;

public class EditarPersonal extends Command {
    private PersonalId personalId;
    private DatosPersonales datosPersonales;

    public EditarPersonal(PersonalId personalId, DatosPersonales datosPersonales) {
        Objects.requireNonNull(personalId);
        Objects.requireNonNull(datosPersonales);
        this.personalId = personalId;
        this.datosPersonales = datosPersonales;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }
}
