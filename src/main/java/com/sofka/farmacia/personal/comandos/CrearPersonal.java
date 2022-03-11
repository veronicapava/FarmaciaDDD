package com.sofka.farmacia.personal.comandos;

import co.com.sofka.domain.generic.Command;
import com.sofka.farmacia.personal.values.DatosPersonales;
import com.sofka.farmacia.personal.values.PersonalId;

public class CrearPersonal extends Command {
   private PersonalId personalId;
   private DatosPersonales datosPersonales;

    public CrearPersonal(PersonalId personalId, DatosPersonales datosPersonales) {
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
