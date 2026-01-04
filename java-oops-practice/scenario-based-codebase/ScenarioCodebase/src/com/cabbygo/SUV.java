package com.cabbygo;

// Creating SUV Which Extends Vehicle 
public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    public void bookRide(double distance) {
        double baseFare = 120;
        double rate = 20;
        setFare(baseFare + distance * rate);
        System.out.println("SUV ride booked");
    }
}
