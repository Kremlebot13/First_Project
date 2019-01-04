package com.example.serega.first_project.shapes;

// task 3.10
public class Circle implements Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public void perimeter() {
        System.out.printf("perimeter of a circle: %f\n", 2 * Math.PI * diameter / 2);
    }

    public void area() {
        System.out.printf("area of a circle: %f\n", Math.PI * diameter / 2 * diameter / 2);
    }
}