package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private int a;
    private int h;

    public Triangle(String name, int a, int h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return (a * h)/2;
    }
}
