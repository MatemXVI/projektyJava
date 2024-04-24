package org.example;

public class Rectangle implements Figure{
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getField() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
