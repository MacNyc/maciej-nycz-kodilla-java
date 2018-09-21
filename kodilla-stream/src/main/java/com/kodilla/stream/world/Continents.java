package com.kodilla.stream.world;

public class Continent {
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country){
        this.countriesOnContinent.add(country);
    }
}