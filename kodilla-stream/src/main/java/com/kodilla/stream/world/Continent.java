package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final Set<Country> country = new HashSet<>();


    public Continent() {
    }

    public Set<Country> getCountry() {
        return country;
    }

    public void addCountry(Country country) {
        this.country.add(country);
    }
}
