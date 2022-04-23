package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Toronto", true);
        airports.put("Warsaw", true);
        airports.put("Prague", true);
        airports.put("Berlin", true);
        airports.put("Dresden", true);
        airports.put("Amsterdam", false);
        airports.put("Kiev", false);
        airports.put("Barcelona", false);

        if (airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())
            && airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
            System.out.println("You can fly from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport does not exist on the Map.");

        }
    }

    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(new Flight("Warsaw", "Prague"));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        }

        try {
            findFlight.findFlight(new Flight("Warsaw", "Barcelona"));
        } catch (RouteNotFoundException e){
            System.out.println(e);
        }
    }
}
