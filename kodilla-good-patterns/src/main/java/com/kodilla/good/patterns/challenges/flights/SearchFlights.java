package com.kodilla.good.patterns.challenges.flights;

import java.util.stream.Collectors;

public class SearchFlights {

    FlightsRetriever flightsRetriever = new FlightsRetriever();
    public void searchFlightFrom(String city){

        System.out.println("Flight from " + city + ":");

        flightsRetriever.flights().stream()
                .filter(flight -> flight.getDepature().equals(city) && flight.getVia() == null)
                .map(flight -> "Flight number: " + flight.getFlightNumber() + " - Departure: " + flight.getDepature() + " - Arrival: " + flight.getArrival())
                .forEach(System.out::println);

    }

    public void searchFlightTo(String city){

        System.out.println("Flight to: " + city + ":");

        flightsRetriever.flights().stream()
                .filter(flight -> flight.getArrival().equals(city) && flight.getVia() == null)
                .map(flight -> "Flight number: " + flight.getFlightNumber() + " - Departure: " + flight.getDepature() + " - Arrival: " + flight.getArrival())
                .forEach(System.out::println);

    }

    public void searchFlightsVia(String city){

        System.out.println("Flights from/to: " + city + " via other city");

        flightsRetriever.flights().stream()
                .filter(flight -> flight.getArrival().equals(city) || flight.getDepature().equals(city))
                .filter(flight -> flight.getVia() != null)
                .map(flight -> "Flight number: " + flight.getFlightNumber() + " - Departure: " + flight.getDepature() + "- via: " + flight.getVia()  + " - Arrival: " + flight.getArrival())
                .forEach(System.out::println);
    }
}
