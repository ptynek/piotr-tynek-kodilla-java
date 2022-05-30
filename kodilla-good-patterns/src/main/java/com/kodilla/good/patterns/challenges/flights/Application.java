package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        SearchFlights searchFlights = new SearchFlights();

        searchFlights.searchFlightFrom("Wrocław");
        System.out.println();
        searchFlights.searchFlightTo("Wrocław");
        System.out.println();
        searchFlights.searchFlightsVia("Wrocław");
    }
}
