package com.example.solid_example.dependency_inversion;

public class NonDIElectricPowerSwitch {
    public NonDILightBulb bulb;
    public boolean on;

    public NonDIElectricPowerSwitch(NonDILightBulb bulb) {
        this.bulb = bulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            bulb.turnOff();
            this.on = false;
        } else {
            bulb.turnOn();
            this.on = true;
        }
    }
}
