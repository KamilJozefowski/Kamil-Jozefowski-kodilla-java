package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) {
        FindFilght findFilght = new FindFilght();

        try {
            if (findFilght.findFilght(new Flight("Warszawa", "Londyn"))) {
                System.out.println("We have connections to these airports");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, flight not exists. Arrival or departure airport not exist in our connection map");
        }

        try {
            if (findFilght.findFilght(new Flight("Madryt", "Londyn"))) {
                System.out.println("We have connections to these airports");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, flight not exists. Arrival or departure airport not exist in our connection map");
        }

        try {
            if (findFilght.findFilght(new Flight("Warszawa", "Moskwa"))) {
                System.out.println("We have connections to these airports");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, flight not exists. Arrival or departure airport not exist in our connection map");
        }


    }
}
