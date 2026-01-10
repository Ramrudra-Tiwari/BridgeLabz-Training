package com.parkease;

// Parking slot details
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // Slot initialization
    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    // Slot availability externally change nahi ho sakti
    public boolean isAvailable() {
        return !isOccupied;
    }

    // Slot book karna (internal use)
    protected void occupySlot() {
        isOccupied = true;
    }

    protected void freeSlot() {
        isOccupied = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}
