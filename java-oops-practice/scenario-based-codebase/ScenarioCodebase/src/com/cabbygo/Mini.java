package com.cabbygo;

// Creating Mini vehicle
public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini");
    }

    public void bookRide(double distance) {
        double baseFare = 50;
        double rate = 10;
        setFare(baseFare + distance * rate);
        System.out.println("Mini ride booked");
    }
}
