package com.kodilla.good.patterns.food2Door;

public class Customer {

    private final String name;
    private final String surname;
    private final LocalAddress address;

    public Customer(String name, String surname, LocalAddress address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public LocalAddress getAddress() {
        return address;
    }

    public String getName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " " + surname + " " + address;
    }
}
