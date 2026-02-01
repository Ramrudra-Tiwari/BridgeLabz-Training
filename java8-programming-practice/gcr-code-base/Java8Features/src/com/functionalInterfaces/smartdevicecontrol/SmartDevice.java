
package com.functionalInterfaces.smartdevicecontrol;

@FunctionalInterface
interface SmartDevice {
	void turnOn();
	
	default void turnOf() {
		System.out.println("Device Turn Of.");
	}
}
