package com.homenest;

public class Thermostat extends Device {

    public Thermostat(int deviceId) {
        super(deviceId, 2.0);
    }

    @Override
    public void reset() {
        turnOff();
        updateFirmware("Temperature settings reset");
        System.out.println("Thermostat reset completed");
    }
}
