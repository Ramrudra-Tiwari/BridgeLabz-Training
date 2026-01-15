package com.homenest;

public class Lock extends Device {

    public Lock(int deviceId) {
        super(deviceId, 0.2);
    }

    @Override
    public void reset() {
        turnOff();
        updateFirmware("Lock security keys refreshed");
        System.out.println("Smart Lock reset completed");
    }
}
