package com.parceltracker;

public class ParcelTracker {

    private ParcelStage head;

    // add initial stage
    public void addStage(String stageName) {

        ParcelStage newStage = new ParcelStage(stageName);

        if (head == null) {
            head = newStage;
            return;
        }

        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // add stage after a given stage
    public void addCheckpoint(String afterStage, String newStage) {

        ParcelStage temp = head;

        while (temp != null) {
            if (temp.stageName.equalsIgnoreCase(afterStage)) {
                ParcelStage checkpoint = new ParcelStage(newStage);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                System.out.println("Checkpoint added.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found.");
    }

    // display parcel journey
    public void trackParcel() {

        if (head == null) {
            System.out.println("Parcel is missing or not registered.");
            return;
        }

        ParcelStage temp = head;
        System.out.println("Parcel Tracking:");

        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // simulate lost parcel
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost.");
    }
}
