package org.example;

public abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Trapezoid extends Shape {
    private double a, b, height;

    public Trapezoid(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (a + b) * height;
    }
}

