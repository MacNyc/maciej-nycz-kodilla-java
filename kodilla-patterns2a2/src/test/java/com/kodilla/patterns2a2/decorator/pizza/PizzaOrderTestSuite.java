package com.kodilla.patterns2a2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class PizzaOrderTestSuite {
    @Test
    public void BasicPizzaOrderGetCosTest() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println(theCost);
        //Then
        assertEquals(new BigDecimal(15), theCost);
    }
    @Test
    public void BasicPizzaOrderGetDescriptionTest(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("The pizza contains a cake, tomato sauce, cheese ", description);
    }
    @Test
    public void BasicPizzaGigantWithDeliveryGetCostTest(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SizeGigantDecorator(theOrder);
        theOrder = new WithDeliveryDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println(theCost);
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }
    @Test
    public void BasicPizzaGigantWithDeliveryGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SizeGigantDecorator(theOrder);
        theOrder = new WithDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("The pizza contains a cake, tomato sauce, cheese , gigant size with Warsaw area delivery", description);
    }
    @Test
    public void HawaiPizzaWithDeliveryGetCost(){
        //Given
        PizzaOrder theOrder = new HawaiPizzaOrder();
        theOrder = new WithDeliveryDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        System.out.println(theCost);
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }
    @Test
    public void HawaiPizzaWithDeliveryGetDescription(){
        //Given
        PizzaOrder theOrder = new HawaiPizzaOrder();
        theOrder = new WithDeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("The pizza contains a cake, tomato sauce, cheese, pineapple   with Warsaw area delivery", description);
    }
}
