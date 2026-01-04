package com.smarthome;

//Creating  Parent class
public class Appliance implements Controllable {

    private boolean status;     // Using Encapsulation
    protected int power;        //making  Accessible to child classes

    // Creating Constructor
    public Appliance(int power) {
        this.power = power;
        this.status = false;
    }

    public void turnOn() {
        status = true;
        System.out.println("Appliance is ON");
    }

    public void turnOff() {
        status = false;
        System.out.println("Appliance is OFF");
    }

    public int getPower() {
        return power;
    }
}