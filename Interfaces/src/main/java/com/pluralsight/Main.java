package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyables = { new Bird(), new Airplane(), new Drone()};

        for (Flyable things : flyables) {
            things.fly();
        }
    }
}
