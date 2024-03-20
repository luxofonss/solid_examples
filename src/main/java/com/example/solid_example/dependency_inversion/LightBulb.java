package com.example.solid_example.dependency_inversion;

public class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
