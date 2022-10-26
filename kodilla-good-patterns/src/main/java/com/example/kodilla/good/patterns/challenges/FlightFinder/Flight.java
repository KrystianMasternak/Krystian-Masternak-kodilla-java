package com.example.kodilla.good.patterns.challenges.FlightFinder;

import java.util.Objects;

public class Flight {
    private String cityDeparture;
    private String cityArrival;
    private int numberFlight;

    public Flight(String cityDeparture, String cityArrival, int numberFlight) {
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.numberFlight = numberFlight;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    public int getNumberFlight() {
        return numberFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return numberFlight == flight.numberFlight && Objects.equals(cityDeparture, flight.cityDeparture) && Objects.equals(cityArrival, flight.cityArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityDeparture, cityArrival, numberFlight);
    }

    public String toString() {
        return "Number flight: " + getNumberFlight() + " Arrival: " + getCityArrival() + " Departure: " + getCityDeparture();
    }
}
