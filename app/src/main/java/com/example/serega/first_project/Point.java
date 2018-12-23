package com.example.serega.first_project;

import static com.example.serega.first_project.Directions.down;
import static com.example.serega.first_project.Directions.left;
import static com.example.serega.first_project.Directions.up;
import static com.example.serega.first_project.Directions.right;

public class Point {
    private int x;
    private int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //task 3.5
    public Point move(Directions motion) {
        switch (motion) {
            case up:
                this.y++;
                break;
            case down:
                this.y--;
                break;
            case left:
                this.x--;
                break;
            case right:
                this.x++;
                break;
        }
        return this;
    }

    public void printPosition() {
        System.out.printf("coordinate: x = %d; y = %d;\n", this.x, this.y);
    }

    // task 3.6
    public void moving() {
        Point location = new Point();
        Directions[] route = new Directions[]{up, up, left, down, left, down, down, right, right, down, right};

        printPosition();
        for (int i = 0; i < route.length; i++) {
            location = move(route[i]);
            printPosition();
        }
    }
}
