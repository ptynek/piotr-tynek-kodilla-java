package com.kodilla.good.patterns.challenges.flights;

import java.util.*;

public class FlightsRetriever {

   public Set<Flight> flights(){
       Set<Flight> flightsSet = new HashSet<>();

       Flight flight1 = new Flight("AX232C","Gdańsk", "Wrocław");
       Flight flight2 = new Flight("OS232F","Wrocław", "Gdańsk");
       Flight flight3 = new Flight("KDK232","Poznań", "Kraków");
       Flight flight4 = new Flight("JN2302","Warszawa", "Poznań", "Wrocław");
       Flight flight5 = new Flight("KDK433","Wrocław", "Katowice", "Rzeszów");
       Flight flight6 = new Flight("JHD233","Białystok","Wrocław");
       Flight flight7 = new Flight("SO2321","Wrocław", " Białystok");
       Flight flight8 = new Flight("OO2093","Katowice", "Wrocław");
       Flight flight9 = new Flight("JHN33N","Lublin", "Warszawa", "Wrocław");
       Flight flight10 = new Flight("KK2321","Radom", "Wrocław");

       flightsSet.add(flight1);
       flightsSet.add(flight2);
       flightsSet.add(flight3);
       flightsSet.add(flight4);
       flightsSet.add(flight5);
       flightsSet.add(flight6);
       flightsSet.add(flight7);
       flightsSet.add(flight8);
       flightsSet.add(flight9);
       flightsSet.add(flight10);

       return flightsSet;
   }

}
