package com.example.serega.first_project;

public class Name {
    private String firstName;
    private String lastName;

    Name() {
        firstName = "Ivan";
        lastName = "Ivanov";
    }

    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void print() {
        System.out.printf("Full name: %s %s \n", firstName, lastName);
    }
}
