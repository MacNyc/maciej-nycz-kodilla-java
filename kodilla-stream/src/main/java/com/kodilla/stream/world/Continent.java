package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    private List<Country> countryList = new ArrayList();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country){
        this.countryList.add(country);
    }
}