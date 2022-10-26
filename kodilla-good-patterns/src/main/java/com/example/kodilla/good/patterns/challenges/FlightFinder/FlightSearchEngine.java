package com.example.kodilla.good.patterns.challenges.FlightFinder;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private Set<Flight> listOfFlight;

    public FlightSearchEngine(Set<Flight> listOfFlight) {
        this.listOfFlight = listOfFlight;
    }

    public void searchByCityOfDeparture(String nameOfCityDeparture) {
        System.out.println("List flight from: " + nameOfCityDeparture + "\n");
        listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityOfArrival(String nameOfCityArrival) {
        System.out.println("List flight to: " + nameOfCityArrival + "\n");
        listOfFlight.stream()
                .filter(f -> f.getCityArrival().equals(nameOfCityArrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByCityForTransfer(String nameOfCityDeparture, String nameOfCityIntercharge, String nameOfCityArrival) {
        System.out.println("List flight from: " + nameOfCityDeparture + " to: " + nameOfCityArrival + " across: " + nameOfCityIntercharge);
        List<Flight> listOfFlightWithIntercharge = listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityDeparture) && f.getCityArrival().equals(nameOfCityIntercharge))
                .collect(Collectors.toList());
        listOfFlight.stream()
                .filter(f -> f.getCityDeparture().equals(nameOfCityIntercharge) && f.getCityArrival().equals(nameOfCityArrival))
                .collect(Collectors.toCollection(() -> listOfFlightWithIntercharge));
        listOfFlightWithIntercharge.stream()
                .forEach(System.out::println);
    }
}
