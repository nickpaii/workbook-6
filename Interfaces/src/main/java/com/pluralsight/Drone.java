package com.pluralsight;

public class Drone implements Flyable {

    @Override
    public void fly() {
        System.out.println("The drone hovers and zips through the air.");
    }
}
