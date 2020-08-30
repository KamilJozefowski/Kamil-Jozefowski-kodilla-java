package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilght {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map <String, Boolean> airports = new HashMap<>();

        airports.put("Warszawa", true);
        airports.put("Berlin", true);
        airports.put("Londyn", true);
        airports.put("Moskwa", false);

        if ( airports.containsKey(flight.getArrivalAirport())
                && airports.containsKey(flight.getDepartureAirport())
                && airports.get(flight.getArrivalAirport())
                && airports.get(flight.getDepartureAirport())) {
            return true;
        } else {
            throw new RouteNotFoundException("Arrival airport doesn't exits in flight connection map");
        }



    }
}
