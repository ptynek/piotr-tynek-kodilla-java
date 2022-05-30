package com.kodilla.good.patterns.challenges.flights;

public class Flight {

    private String flightNumber;
    private String depature;
    private String via;
    private String arrival;

    public Flight(String flightNumber, String depature, String via, String arrival) {
        this.flightNumber = flightNumber;
        this.depature = depature;
        this.via = via;
        this.arrival = arrival;
    }

    public Flight(String flightNumber,String depature, String arrival) {
        this.flightNumber = flightNumber;
        this.depature = depature;
        this.arrival = arrival;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepature() {
        return depature;
    }

    public String getVia() {
        return via;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!depature.equals(flight.depature)) return false;
        if (via != null ? !via.equals(flight.via) : flight.via != null) return false;
        return arrival.equals(flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + depature.hashCode();
        result = 31 * result + (via != null ? via.hashCode() : 0);
        result = 31 * result + arrival.hashCode();
        return result;
    }
}
