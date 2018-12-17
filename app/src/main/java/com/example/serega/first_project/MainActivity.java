package com.example.serega.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        System.out.println(task5("abc123"));
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
            line = str.substring(0, str.length());
        }
        return line;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
