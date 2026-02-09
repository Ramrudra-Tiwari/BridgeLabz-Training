package com.multithreading.threadstatemonitoringsystem;

public class Main {

    public static void main(String[] args) {

        TaskRunner task = new TaskRunner();

        Thread task1 = new Thread(task, "Task-1");
        Thread task2 = new Thread(task, "Task-2");

        Thread monitor = new Thread(
                new StateMonitor(task1, task2),
                "State-Monitor"
        );

        // Start monitor first to capture NEW state
        monitor.start();

        // Small delay so monitor logs NEW state
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        task1.start();
        task2.start();
    }
}