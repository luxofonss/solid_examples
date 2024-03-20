package com.example.solid_example.dependency_inversion;

public class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
