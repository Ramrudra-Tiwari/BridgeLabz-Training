package com.inheritance.singleinheritance.smarthome;

// creating an  Subclass
public class Thermostat extends Device {

    int temperatureSetting;

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
