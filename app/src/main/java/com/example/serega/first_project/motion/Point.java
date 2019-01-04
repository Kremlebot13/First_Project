package com.example.serega.first_project.motion;

import static com.example.serega.first_project.motion.Directions.Down;
import static com.example.serega.first_project.motion.Directions.Left;
import static com.example.serega.first_project.motion.Directions.Up;
import static com.example.serega.first_project.motion.Directions.Right;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //task 3.5
    public Point move(Directions motion) {
        switch (motion) {
            case Up:
                this.y++;
                break;
            case Down:
                this.y--;
                break;
            case Left:
                this.x--;
                break;
            case Right:
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
        Point location = new Point(0, 0);
        Directions[] route = new Directions[]{Up, Up, Left, Down, Left, Down, Down, Right, Right, Down, Right};

        printPosition();
        for (int i = 0; i < route.length; i++) {
            location = move(route[i]);
            printPosition();
        }
    }
}
