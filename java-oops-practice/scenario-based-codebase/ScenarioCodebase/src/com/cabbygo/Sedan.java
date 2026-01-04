package com.cabbygo;

//Creating  Sedan vehicle
public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    public void bookRide(double distance) {
        double baseFare = 80;
        double rate = 15;
        setFare(baseFare + distance * rate);
        System.out.println("Sedan ride booked");
    }
}
