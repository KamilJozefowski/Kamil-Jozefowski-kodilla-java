package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class World {
    private final String continent;
    private final Set<Continent> country = new HashSet<>();

    public World(String continent) {
        this.continent = continent;
    }
    public void addCountry (Continent country){
        this.country.add(country);

    }
}
