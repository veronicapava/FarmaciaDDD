package com.sofka.farmacia.personal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PersonalACargo implements ValueObject<Integer> {

    private final Integer personalACargo;

    public PersonalACargo(Integer personalACargo) {
        this.personalACargo = Objects.requireNonNull(personalACargo);
    }

    @Override
    public Integer value() {
        return personalACargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalACargo)) return false;
        PersonalACargo that = (PersonalACargo) o;
        return personalACargo.equals(that.personalACargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalACargo);
    }
}
