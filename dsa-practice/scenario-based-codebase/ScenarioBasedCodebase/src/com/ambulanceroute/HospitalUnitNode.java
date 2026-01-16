package com.ambulanceroute;

// node class for circular linked list
public class HospitalUnitNode {

    String unitName;
    boolean isAvailable;
    HospitalUnitNode next;

    // constructor
    public HospitalUnitNode(String unitName, boolean isAvailable) {
        this.unitName = unitName;
        this.isAvailable = isAvailable;
        this.next = null;
    }
}
