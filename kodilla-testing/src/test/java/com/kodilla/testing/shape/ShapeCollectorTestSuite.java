package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        Triangle triangle = new Triangle("Some triangle", 5, 4);
        Square square = new Square("Some square",4);

        shapeCollector.addFigure((Shape) circle);
        shapeCollector.addFigure((Shape) triangle);
        shapeCollector.addFigure((Shape) square);


        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(12.56, shapeCollector.getFigure(0).getField(), 0.1);

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        Triangle triangle = new Triangle("Some triangle", 5, 4);
        Square square = new Square("Some square",4);

        shapeCollector.addFigure((Shape) circle);
        shapeCollector.addFigure((Shape) triangle);


        boolean result = shapeCollector.removeFigure(triangle);

        Assert.assertTrue(result);
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

        Assert.assertEquals(square, shapeCollector.getFigure(2));

    }

    @Test
    public void testShowFigure(){

    }
}