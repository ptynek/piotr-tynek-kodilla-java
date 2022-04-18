package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        List<Country> europeanCountry = new ArrayList<>();
        List<Country> asianCountry = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("38098321"));
        Country germany = new Country("Germany", new BigDecimal("398239482"));
        Country china = new Country("China", new BigDecimal("1983234892"));
        Country taiwan = new Country("Taiwan", new BigDecimal("3298342"));
        europeanCountry.add(poland);
        europeanCountry.add(germany);
        asianCountry.add(china);
        asianCountry.add(taiwan);
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        World world = new World();
        world.addCountryToList(europe, europeanCountry);
        world.addCountryToList(asia, asianCountry);


        BigDecimal result = world.getPeopleQuantity();

        BigDecimal expectedResult = new BigDecimal("2422871037");
        Assertions.assertEquals(expectedResult, result);
    }
}
