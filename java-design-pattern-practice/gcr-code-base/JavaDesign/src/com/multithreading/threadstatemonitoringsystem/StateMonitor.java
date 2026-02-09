package com.multithreading.threadstatemonitoringsystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor implements Runnable {

    private final Thread[] threads;
    private final Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(Thread... threads) {
        this.threads = threads;
        for (Thread t : threads) {
            stateHistory.put(t.getName(), new HashSet<>());
        }
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                stateHistory.get(t.getName()).add(state);

                System.out.printf(
                        "[Monitor] %s is in %s state at %s%n",
                        t.getName(),
                        state,
                        LocalTime.now().withNano(0)
                );

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        printSummary();
    }

    private void printSummary() {
        System.out.println("\n===== SUMMARY =====");
        stateHistory.forEach((name, states) ->
                System.out.println("Summary: " + name + " went through " + states.size() + " states -> " + states)
        );
    }
}