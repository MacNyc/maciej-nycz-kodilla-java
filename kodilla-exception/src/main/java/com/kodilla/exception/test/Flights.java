package com.kodilla.exception.test;

import java.util.HashSet;
import java.util.Set;

public class Flights {

    public static void main(String[] args) {
        String departureAirport = "Warsaw Airport";
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(departureAirport, "Londyn Luton Airport"));
        flights.add(new Flight(departureAirport, "London City Airport"));
        flights.add(new Flight(departureAirport, "Gdansk Airport"));
        flights.add(new Flight(departureAirport, "Oslo Airport"));
        flights.add(new Flight(departureAirport, "Miami Aiport"));
        flights.add(new Flight(departureAirport, "Lisbon Airport"));
        flights.add(new Flight(departureAirport, "Katowice Pyrzowice Airport"));


        FlightSeeker schedule = new FlightSeeker();

        for (Flight flight : flights) {
            try { schedule.findFlight(flight);
                System.out.println("\nFlight");
            } catch (RouteNotFoundException e) {
                System.out.println("\nError : "+ e);

            }
        }
    }
}