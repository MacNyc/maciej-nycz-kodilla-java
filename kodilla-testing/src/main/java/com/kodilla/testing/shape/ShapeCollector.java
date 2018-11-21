package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> geometricFigures = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.geometricFigures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return geometricFigures.remove(shape);
    }

    public Shape getFigure(int n) {
        return geometricFigures.get(n);
    }

    public void showFigure(){

    }

}
