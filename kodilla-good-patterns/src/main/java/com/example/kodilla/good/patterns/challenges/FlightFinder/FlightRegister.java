package com.example.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class FlightRegister {
    private Set<Flight> listOfFlight = new HashSet<Flight>();


    public boolean addFlight(Flight flight) {
        listOfFlight.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlight() {
        return Collections.unmodifiableSet(listOfFlight);
    }
}
