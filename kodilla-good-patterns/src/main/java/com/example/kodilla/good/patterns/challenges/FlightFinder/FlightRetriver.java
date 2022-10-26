package com.example.kodilla.good.patterns.challenges.FlightFinder;

import java.util.List;

public class FlightRetriver {

    public static FlightRegister retrive() {

        Flight flight = new Flight("Szczecin", "Gdańsk", 0001);
        Flight flight1 = new Flight("Warszawa", "Poznań", 0002);
        Flight flight2 = new Flight("Rzeszów", "Wrocław", 0003);
        Flight flight3 = new Flight("Katowice", "Kraków", 0004);
        Flight flight4 = new Flight("Toruń", "Białystok", 0005);
        Flight flight5 = new Flight("Poznań", "Szczecin", 3421);
        Flight flight6 = new Flight("Katowice", "Toruń", 8764);
        Flight flight7 = new Flight("Rzeszów", "Warszawa", 4789);
        Flight flight8 = new Flight("Wrocław", "Rzeszów", 0043);
        Flight flight9 = new Flight("Gdańsk", "Katowice", 2455);
        Flight flight10 = new Flight("Kraków", "Poznań", 6534);
        Flight flight11 = new Flight("Białystok", "Rzeszów", 3456);

        FlightRegister flightRegister = new FlightRegister();
        flightRegister.addFlight(flight);
        flightRegister.addFlight(flight1);
        flightRegister.addFlight(flight2);
        flightRegister.addFlight(flight3);
        flightRegister.addFlight(flight4);
        flightRegister.addFlight(flight5);
        flightRegister.addFlight(flight6);
        flightRegister.addFlight(flight7);
        flightRegister.addFlight(flight8);
        flightRegister.addFlight(flight9);
        flightRegister.addFlight(flight10);
        flightRegister.addFlight(flight11);

        return flightRegister;

    }
}
