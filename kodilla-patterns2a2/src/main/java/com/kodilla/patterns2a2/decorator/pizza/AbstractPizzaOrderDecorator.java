package com.kodilla.patterns2a2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements PizzaOrder {
    private PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder){
        this.pizzaOrder = pizzaOrder;
    }
    @Override
    public BigDecimal getCost(){
        return pizzaOrder.getCost();
    }
    @Override
    public String getDescription(){
        return pizzaOrder.getDescription();
    }
}