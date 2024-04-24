package org.example;

public class Circle implements Figure{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getField() {
        return Math.pow(Math.PI*r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}
