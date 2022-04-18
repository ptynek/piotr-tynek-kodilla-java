package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {

    private final Map<Continent, List<Country>>  continentsAndCountries = new HashMap<>();

    public void addCountryToList(Continent continent, List<Country> countryList){
        continentsAndCountries.put(continent, countryList);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal result = continentsAndCountries.entrySet().stream()
                .flatMap(continent -> continent.getValue().stream().map(Country::getPeopleQuantity))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return result;
    }
}
