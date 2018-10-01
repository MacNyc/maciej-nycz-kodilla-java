package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {


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

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flight == null) {
            System.out.println("Flight not possible");
        }

        String arrival = flight.getArrivalAirport();
        if (airportNetwork.containsKey(arrival)) {
            throw new RouteNotFoundException();
        }
        return airportNetwork.get(arrival);
    }
}
