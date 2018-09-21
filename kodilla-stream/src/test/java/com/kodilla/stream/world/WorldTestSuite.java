package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
       //Given
        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Norht America"));
        continents.add(new Continent("Sout America"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("Antarcica"));
        continents.add(new Continent("Autralia and Oceania"));

        //When
        BigDecimal totalPeopleQuantity = continents.stream()
                .flatMap(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPoepoleQuantity = new BigDecimal("1293801984091284");
        Assert.assertEquals(expectedPoepoleQuantity, totalPeopleQuantity);
    }

}
