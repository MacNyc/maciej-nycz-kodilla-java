package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {

    public void findFlights(Flight flight){

    }

    public static Map<String, Boolean> airportNetwork = new HashMap<>();
    {
        airportNetwork.put("Warsaw Chopin Airport", true);
        airportNetwork.put("Londyn Luton Airport", true);
        airportNetwork.put("Gdansk Airport", false);
        airportNetwork.put("Miami Airport", true);
        airportNetwork.put("San Francisco Airport", true);
        airportNetwork.put("Los Angeles Airport", false);
        airportNetwork.put("Katowice Pyrzowice Airport", true);
    }

}
