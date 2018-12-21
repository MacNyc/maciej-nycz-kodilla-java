package com.kodilla.patterns2a2.decorator.pizza;

import java.math.BigDecimal;

public class WithDeliveryDecorator extends AbstractPizzaOrderDecorator {
    public WithDeliveryDecorator (PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(10));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " with Warsaw area delivery";
    }
}
