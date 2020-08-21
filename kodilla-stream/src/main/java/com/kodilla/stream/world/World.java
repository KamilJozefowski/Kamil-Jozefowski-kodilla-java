package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final Set<Continent> country = new HashSet<>();

    public World() {
    }
    public void addContinent (Continent country){
        this.country.add(country);

    }

    public Set<Continent> getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity(Set<Continent> world){

        return world.stream()
                .flatMap(continent -> continent.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
