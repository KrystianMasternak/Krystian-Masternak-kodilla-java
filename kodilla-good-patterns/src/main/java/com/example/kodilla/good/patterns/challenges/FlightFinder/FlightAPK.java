package com.example.kodilla.good.patterns.challenges.FlightFinder;

public class FlightAPK {

    public static void main(String[] args) {
        FlightRegister flightRegister = FlightRetriver.retrive();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRegister.getListOfFlight());
        flightSearchEngine.searchByCityForTransfer("Warszawa", "Gdańsk", "Szczecin");
        flightSearchEngine.searchByCityOfArrival("Rzeszów");
        flightSearchEngine.searchByCityOfDeparture("Toruń");

    }
}
