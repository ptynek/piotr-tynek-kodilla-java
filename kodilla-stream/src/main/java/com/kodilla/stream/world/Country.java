package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String country;

    public Country(String country, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.country = country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
