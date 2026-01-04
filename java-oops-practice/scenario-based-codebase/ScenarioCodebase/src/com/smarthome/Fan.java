package com.smarthome;

// creating Fan class
public class Fan extends Appliance {

    public Fan(int power) {
        super(power);
    }

    public void turnOn() {
        System.out.println("Fan started");
    }

    public void turnOff() {
        System.out.println("Fan stopped");
    }
}
