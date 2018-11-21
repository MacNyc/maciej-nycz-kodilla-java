package com.kodilla.testing.shape;


public class Square implements Shape {

    private String name;
    private int a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.name;

    }

    @Override
    public double getField() {
        return a * a;
    }
}
