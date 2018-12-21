package com.kodilla.patterns2a2.decorator.taxiportal;

import java.math.BigDecimal;

public class AbstractTaxiOrderDecorator implements TaxiOrder {
    private TaxiOrder taxiOrder;

    protected AbstractTaxiOrderDecorator (TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }
    @Override
    public BigDecimal getCost(){
        return taxiOrder.getCost();
    }
    @Override
    public String getDescription(){
        return taxiOrder.getDescription();
    }
}
