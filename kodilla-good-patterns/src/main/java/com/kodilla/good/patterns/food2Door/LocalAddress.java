package com.kodilla.good.patterns.food2Door;

public class LocalAddress {
    private final String city;
    private final String street;
    private final int noBuilding;

    public LocalAddress(String city, String street, int noBuilding) {
        this.city = city;
        this.street = street;
        this.noBuilding = noBuilding;
    }

    @Override
    public String toString() {
        return "Address:" + city + ", " + street + " " + noBuilding;
    }
}
