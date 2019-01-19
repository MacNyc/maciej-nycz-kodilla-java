package com.kodilla.patterns2a2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(20.00);
    }

    @Override
    public String getDescription() {
        return "The pizza contains a cake, tomato sauce, cheese, pineapple  ";
    }
}