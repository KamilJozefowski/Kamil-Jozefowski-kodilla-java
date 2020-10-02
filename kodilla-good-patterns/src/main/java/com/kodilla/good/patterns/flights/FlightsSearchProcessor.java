package com.kodilla.good.patterns.flights;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchProcessor {

    public List<Flight> departureAirportSearch( ArrayList<Flight> currentFlightsList, String selectedAirport) {
        return currentFlightsList.stream().filter((n) -> n.getDepartureAirport().equals(selectedAirport)).collect(Collectors.toList());
    }

    public List<Flight> arrivalAirportSearch(ArrayList<Flight> currentFlightList, String selectedAirport) {
        return currentFlightList.stream().filter((n) -> n.getArrivalAirport().equals(selectedAirport)).collect(Collectors.toList());
    }

    public List<Flight> getDeparturesAfterLocalTime(ArrayList<Flight> currentFlightList, String selectedAirport, LocalTime arrivalTime) {
        return this.departureAirportSearch(currentFlightList, selectedAirport).stream().filter((n) -> n.getDepartureTime().isAfter(arrivalTime)).collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch(ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {
        List<Flight> flightsFromDestination = this.departureAirportSearch(currentFlightList, departureAirport);
        return flightsFromDestination.stream().filter((n) -> n.getArrivalAirport().equals(arrivalAirport)).collect(Collectors.toList());
    }

    public HashMap<Flight, Flight> connectionFlightSearch(ArrayList<Flight> currentFlightList, String departureAirport, String arrivalAirport) {
        List<Flight> flightsFromDestination = this.departureAirportSearch(currentFlightList, departureAirport);
        HashMap<Flight, Flight> connectedFlights = new HashMap<>();

        for (Flight value : flightsFromDestination) {
            List<Flight> connectionOption = this.getDeparturesAfterLocalTime(currentFlightList, value.getArrivalAirport(), value.getArrivalTime());

            for (Flight flight : connectionOption) {
                if (flight.getArrivalAirport().equals(arrivalAirport)) {
                    connectedFlights.put(value, flight);
                }
            }
        }

        return connectedFlights;
    }
}