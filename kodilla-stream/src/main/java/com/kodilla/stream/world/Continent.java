package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
    public List<Country> getCountriesList(){
        return countriesList;
    }

    public void addCountry(Country country) {
        countriesList.add(country);
    }
}