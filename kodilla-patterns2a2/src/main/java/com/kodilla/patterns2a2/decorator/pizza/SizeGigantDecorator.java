package com.kodilla.patterns2a2.decorator.pizza;

import java.math.BigDecimal;

public class SizeGigantDecorator extends AbstractPizzaOrderDecorator {
    public SizeGigantDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", gigant size";
    }
}
