package com.collections.Queue;

import java.util.PriorityQueue;

// Patient class
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {

        // PriorityQueue: higher severity first
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> p2.severity - p1.severity
        );

        // Adding patients
        pq.add(new Patient("Annni", 3));
        pq.add(new Patient("Karan", 5));
        pq.add(new Patient("Chota", 2));

        System.out.println("Treatment Order:");

        // Treat patients based on priority
        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
