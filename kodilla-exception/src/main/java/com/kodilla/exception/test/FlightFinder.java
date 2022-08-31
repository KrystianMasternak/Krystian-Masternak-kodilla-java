package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight( Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Warszawa", true);
        airportMap.put("Szczecin", true);
        airportMap.put("Rzeszów", true);


        if (airportMap.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport is posible: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Arrival airport: " + flight.getArrivalAirport() + " is not possible");
        }
    }
}
