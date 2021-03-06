package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> listOfContinent = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return listOfContinent.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public List<Continent> getListOfContinent() {
        return listOfContinent;
    }

    public void addContinent(Continent continent) {
        this.listOfContinent.add(continent);
    }
}
