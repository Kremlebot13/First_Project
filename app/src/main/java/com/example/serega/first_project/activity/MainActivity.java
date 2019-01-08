package com.example.serega.first_project.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.serega.first_project.lambda.Name;
import com.example.serega.first_project.R;
import com.example.serega.first_project.lambda.Runnable;
import com.example.serega.first_project.shapes.Circle;
import com.example.serega.first_project.shapes.Rectangle;
import com.example.serega.first_project.shapes.Square;
import com.example.serega.first_project.motion.Point;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        task1();
        Name person = new Name("Anton", "Petrov");
        person.print();
        task3();
        task4();
        System.out.println(task5("abc123"));

        // task 3.2
        Runnable task = s -> System.out.println(s);
        task.print("I love Java");
        repeatTask(10, task);


        // task 3.6
        Point coordinate = new Point(0, 0);
        coordinate.moving();

        // task 3.8
        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.perimeter();
        rectangle.area();

        // task 3.9
        Square square = new Square(5);
        square.perimeter();
        square.area();

        // task 3.10
        Circle circle = new Circle(10);
        circle.perimeter();
        circle.area();
    }

    //Problem 1
    static void task1() {
        final double a = 3.2567;
        final double b = 12.02342;
        double average = averageValue(a, b);
        System.out.println(average);
    }

    //arithmetic average of two numbers
    static double averageValue(double a, double b) {
        return (a + b) / 2;
    }

    //Problem 3
    static void task3() {
        for (int i = 0; i <= 15; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //Problem 4
    static void task4() {
        int array[] = {3, 17, 7, 9, 5, 1, -1, -6, 199, 435, 36};
        array = bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //problem 5
    static String task5(String str) {
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                index = i;
                break;
            }
        }

        String line = str.substring(0, index);
        String num = str.substring(index, str.length());

        try {
            int number = Integer.parseInt(num);
            number++;
            line += number;
        } catch (NumberFormatException e) {
            line = str;
        }
        return line;
    }

    //task 3.2
    static public void repeatTask(int times, Runnable task) {
        for (int i = 0; i < times; i++) {
            task.print("I love Java");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
