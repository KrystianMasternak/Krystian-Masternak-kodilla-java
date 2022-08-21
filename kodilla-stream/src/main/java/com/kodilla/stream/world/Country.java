package com.kodilla.stream.world;

import java.math.BigDecimal;


public final class Country {
    private final String countryName;
    private final BigDecimal peopleQty;


    public Country(final String countryName,final BigDecimal peopleQty) {
        this.countryName = countryName;
        this.peopleQty = peopleQty;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQty;
    }












}