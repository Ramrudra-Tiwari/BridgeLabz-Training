package com.multithreading.threadstatemonitoringsystem;

public class TaskRunner implements Runnable {

    @Override
    public void run() {
        try {
            // RUNNABLE (computation)
            for (int i = 0; i < 1_000_000; i++) {
                Math.sqrt(i);
            }

            // TIMED_WAITING
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }
}