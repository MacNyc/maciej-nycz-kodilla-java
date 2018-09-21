package com.kodilla.stream.world;

import java.math.BigDecimal;

public class World {
    public void getPeopleQuantity(){
        BigDecimalmap = getPeopleQuantity().stream()
                .flatMap(Continent::getContinentName)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

