package com.smarthome;

// Creating Light class
public class Light extends Appliance {

    public Light(int power) {
        super(power);
    }

    public void turnOn() {
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}
