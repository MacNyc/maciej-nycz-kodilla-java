package com.kodilla.testing.shape;

import javafx.scene.shape.Circle;
import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        shapeCollector.addFigure((Shape) circle);

        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(12.56, shapeCollector.getFigure(0).getField(), 0.1);
    }
}
    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Some circle", 2);
        shapeCollector.removeFigure((Shape) circle);

        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(12.56, shapeCollector.getFigure(0).getField(), 0.1);
    }

    @Test
    public void testGetFigure(int n) {

    }
}