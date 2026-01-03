package com.encapsulationandpolymorphism.librarymanagementsystem;

// Interface for reserving library items
public interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
