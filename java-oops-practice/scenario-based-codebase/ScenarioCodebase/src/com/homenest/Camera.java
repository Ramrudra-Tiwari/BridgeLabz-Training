package com.homenest;

public class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId, 1.2);
    }

    @Override
    public void reset() {
        turnOff();
        updateFirmware("Camera storage cleared");
        System.out.println("Camera reset completed");
    }
}
