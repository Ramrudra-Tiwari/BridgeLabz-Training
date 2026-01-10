package com.parkease;

import java.util.ArrayList;
import java.util.List;

// Parking logic yahin manage hoga
public class ParkingManager {

    private List<String> bookingLogs = new ArrayList<>();

    // Slot assign karna
    public void assignSlot(ParkingSlot slot, Vehicle vehicle) {

        if (!slot.isAvailable()) {
            System.out.println("❌ Slot already occupied");
            return;
        }

        if (!slot.getVehicleTypeAllowed()
                .equalsIgnoreCase(vehicle.getClass().getSimpleName())) {
            System.out.println("❌ Vehicle type not allowed in this slot");
            return;
        }

        slot.occupySlot();
        bookingLogs.add("Slot " + slot.getSlotId() +
                " booked for " + vehicle.getVehicleNumber());
    }

    // Logs sirf read-only
    public void showLogs() {
        System.out.println("\n📋 Booking Logs");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}
