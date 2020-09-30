package com.kodilla.good.patterns.challenges.RentService;

public class User {

    private final String name;
    private final String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getUser() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
