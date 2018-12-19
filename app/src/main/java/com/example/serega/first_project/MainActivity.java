package com.example.serega.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        task1();
        Name person = new Name("Anton", "Petrov");
        person.print();
        task3();
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
