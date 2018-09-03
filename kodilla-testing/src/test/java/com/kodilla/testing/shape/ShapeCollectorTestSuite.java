package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);

        shapeCollector.addFigure((Shape) circle);

        Assert.assertEquals(circle, shapeCollector.getFigure(0, circle));
        Assert.assertEquals(12.56, shapeCollector.getFigure(0, circle).getField(), 0.1);
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);

        boolean result = shapeCollector.removeFigure(circle);

        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {

    }

    @Test
    public void testShowFigure(){

    }
}