package com.example.serega.first_project.shapes;

import com.example.serega.first_project.shapes.Shape;

// task 3.9
public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void perimeter() {
        System.out.printf("perimeter of a square: %f\n", 4 * sideLength);
    }

    public void area() {
        System.out.printf("area of a square: %f\n", sideLength * sideLength);
    }
}
