package com.inheritance.hybridinheritance.restaurant;

/*
 * Waiter class
 * - Inherits Person class
 * - Implements Worker interface
 */
public class Waiter extends Person implements Worker {

    private int tableCount;

    // Method to set number of tables handled
    public void setTableCount(int tableCount) {
        this.tableCount = tableCount;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Waiter is serving " + tableCount + " tables.");
    }
}
