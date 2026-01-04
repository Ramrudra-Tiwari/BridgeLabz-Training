package com.smarthome;

// Creating an AC class
public class AC extends Appliance {

    public AC(int power) {
        super(power);
    }

    public void turnOn() {
        System.out.println("AC cooling started");
    }

    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}
