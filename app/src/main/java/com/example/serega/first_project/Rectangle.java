package com.example.serega.first_project;

// task 3.8
public class Rectangle implements Shape {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void perimeter() {
        System.out.printf("perimeter of a rectangle: %f\n", 2 * width + 2 * length);
    }

    public void area() {
        System.out.printf("area of a rectangle: %f\n", width * length);
    }
}
