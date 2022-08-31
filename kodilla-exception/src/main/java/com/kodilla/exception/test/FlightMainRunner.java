package com.kodilla.exception.test;

public class FlightMainRunner {


    public static void main(String[] args) {

        Flight flight = new Flight("Szczecin", "Gdańsk");
        FlightFinder flightFinder = new FlightFinder();


        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Choose a different airport");
        }


    }
}
