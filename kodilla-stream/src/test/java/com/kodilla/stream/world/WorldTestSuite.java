package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(southAmerica);
        europe.addCountry(new Country("Poland", new BigDecimal("37578000")));
        europe.addCountry(new Country("France", new BigDecimal("68349000")));
        africa.addCountry(new Country("Egypt",new BigDecimal("107492523")));
        africa.addCountry(new Country("Ghana",new BigDecimal("32018000")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("46313000")));
        southAmerica.addCountry(new Country("Brazil", new BigDecimal("216636000")));

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("508386523");
        assertEquals(expectedQuantityPeople, totalPeople);

    }
}