package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficRoundabout {

    private Vehicle head;
    private Queue<String> waitingQueue;
    private int maxCapacity;
    private int currentCount;

    public TrafficRoundabout(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCount = 0;
        this.waitingQueue = new LinkedList<>();
    }

    // add vehicle to roundabout
    public void addVehicle(String number) {

        if (currentCount >= maxCapacity) {
            System.out.println("Roundabout full. Vehicle added to waiting queue.");
            waitingQueue.add(number);
            return;
        }

        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            head.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }

        currentCount++;
        System.out.println("Vehicle entered roundabout: " + number);
    }

    // remove vehicle from roundabout
    public void removeVehicle() {

        if (head == null) {
            System.out.println("No vehicles in roundabout.");
            return;
        }

        String removedVehicle = head.number;

        if (head.next == head) {
            head = null;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }

        currentCount--;
        System.out.println("Vehicle exited roundabout: " + removedVehicle);

        // move vehicle from waiting queue if available
        if (!waitingQueue.isEmpty()) {
            addVehicle(waitingQueue.poll());
        }
    }

    // show current state
    public void showRoundabout() {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout Vehicles: ");

        do {
            System.out.print(temp.number + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}
