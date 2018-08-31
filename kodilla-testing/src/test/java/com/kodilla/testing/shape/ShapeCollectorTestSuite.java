package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(Shape shape) {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);

        Assert.assertEquals(1, shapeCollector.getFigureQuantity());

    }

    @Test
    public void testRemoveFigure(Shape shape){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);

        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFigureQuantity());
    }


    @Test
    public void testGetFigure() {


    }

    @Test
    public void testShowFigure() {

    }
}