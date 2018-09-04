package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        Triangle triangle = new Triangle("Some triangle", 5, 4);
        Square square = new Square("Some square",4);

        shapeCollector.addFigure((Shape) triangle);


        Assert.assertEquals(triangle, shapeCollector.getFigure(2));

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        Triangle triangle = new Triangle("Some triangle", 5, 4);
        Square square = new Square("Some square",4);

        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        Triangle triangle = new Triangle("Some triangle", 5, 4);
        Square square = new Square("Some square",4);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        Assert.assertEquals(circle, shapeCollector.getFigure(2));

    }

    @Test
    public void testShowFigure(){

    }
}