package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given

        Country poland = new Country(new BigDecimal("36852741"));
        Country czech = new Country(new BigDecimal("10698741"));
        Country france = new Country(new BigDecimal("66998658"));
        Country canada = new Country(new BigDecimal("37598965"));
        Country usa = new Country(new BigDecimal("328254784"));
        Country mexico = new Country(new BigDecimal("126225124"));
        Country china = new Country(new BigDecimal("1393698569"));
        Country indie = new Country(new BigDecimal("1353674558"));

        Continent europa = new Continent();
        europa.addCountry(poland);
        europa.addCountry(czech);
        europa.addCountry(france);

        Continent america = new Continent();
        america.addCountry(canada);
        america.addCountry(usa);
        america.addCountry(mexico);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(indie);

        World world = new World();

        world.addContinent(europa);
        world.addContinent(america);
        world.addContinent(asia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity(world.getCountry());

        //Then
        BigDecimal expectedPeople = new BigDecimal("3354002140");
        assertEquals(expectedPeople, totalPeople);


    }
}
