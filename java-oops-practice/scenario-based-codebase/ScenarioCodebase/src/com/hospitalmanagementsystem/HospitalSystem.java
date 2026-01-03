package com.hospitalmanagementsystem;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Meena", 30, 5);
        Patient p2 = new OutPatient(102, "Abhi", 25, 500);

        Doctor d1 = new Doctor(1, "Dr. Tiwari", "Cardiology");

        Bill bill = new Bill(10000);

        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        d1.displayInfo();
        System.out.println();

        bill.getSummary();
    }
}
