package com.kodilla.stream.world;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Norht America"));
        continents.add(new Continent("Sout America"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Antarcica"));
        continents.add(new Continent("Autralia and Oceania"));

    }
}
