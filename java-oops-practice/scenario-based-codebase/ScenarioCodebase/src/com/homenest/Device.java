package com.homenest;

public abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;          // encapsulated
    protected double energyUsage;    // units per hour
    protected String firmwareLog;    // secured log

    // Constructor to register device
    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware v1.0 installed";
    }

    // Turn device ON
    @Override
    public void turnOn() {
        status = true;
        System.out.println("Device " + deviceId + " turned ON");
    }

    // Turn device OFF
    @Override
    public void turnOff() {
        status = false;
        System.out.println("Device " + deviceId + " turned OFF");
    }

    // Status getter (no setter for encapsulation)
    public boolean isOn() {
        return status;
    }

    // Calculate energy usage using operators
    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    // Protected firmware access
    protected void updateFirmware(String log) {
        firmwareLog = log;
    }

    // Polymorphic method
    public abstract void reset();
}
