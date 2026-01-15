package com.homenest;

public class Light extends Device {

    public Light(int deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void reset() {
        turnOff();
        updateFirmware("Light firmware reset");
        System.out.println("Light reset completed");
    }
}
