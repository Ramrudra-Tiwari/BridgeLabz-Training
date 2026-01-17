package com.parceltracker;

public class ParcelStage {

    String stageName;
    ParcelStage next;

    public ParcelStage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}
