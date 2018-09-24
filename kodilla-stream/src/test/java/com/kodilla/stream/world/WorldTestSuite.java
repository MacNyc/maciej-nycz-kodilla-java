package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("81000000"));
        Country china = new Country("China", new BigDecimal("1330044605"));
        Country india = new Country("India", new BigDecimal("1147996000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190632261"));
        Country etiopia = new Country("Etiopia", new BigDecimal("105350020"));
        Country usa = new Country("USA", new BigDecimal("308878120"));
        Country meksyk = new Country("Meksyk", new BigDecimal("107563903"));
        Country bolivia = new Country("Bolivia", new BigDecimal("9775246"));
        Country argentina = new Country("Argentina", new BigDecimal("40913584"));
        Country australia = new Country("Australia", new BigDecimal("21714000"));
        Country newzealand = new Country("New Zealand", new BigDecimal("4186320"));

        Continent europe = new Continent("Europe");
        europe.getCountryList().add(poland);
        europe.getCountryList().add(germany);
        Continent asia = new Continent("Asia");
        asia.getCountryList().add(china);
        asia.getCountryList().add(india);
        Continent africa = new Continent("Africa");
        africa.getCountryList().add(nigeria);
        africa.getCountryList().add(etiopia);
        Continent northAmerica = new Continent("North America");
        northAmerica.getCountryList().add(usa);
        northAmerica.getCountryList().add(meksyk);
        Continent southAmerica = new Continent("South America");
        southAmerica.getCountryList().add(bolivia);
        southAmerica.getCountryList().add(argentina);
        Continent australiaOcenia = new Continent("Australia & Oceania");
        australiaOcenia.getCountryList().add(australia);
        australiaOcenia.getCountryList().add(newzealand);



        World world = new World();
        world.getListOfContinent().add(europe);
        world.getListOfContinent().add(asia);
        world.getListOfContinent().add(africa);
        world.getListOfContinent().add(northAmerica);
        world.getListOfContinent().add(southAmerica);
        world.getListOfContinent().add(australiaOcenia);

        //When
        BigDecimal totalPeopleQuantity = world.getListOfContinent().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3386054059");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}