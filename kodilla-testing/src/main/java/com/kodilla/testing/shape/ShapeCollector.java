package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector implements Shape {
    private ArrayList<String> geometricFigures = new ArrayList<>();

    public int getFigureQuantity() {
        return 3;
    }

    public void addFigure(Shape shape) {
    }

    public boolean removeFigure(Shape shape) {
        return true;
    }
}
