package com.encapsulationandpolymorphism.librarymanagementsystem;

// DVD class
public class DVD extends LibraryItem implements Reservable {

    // Private borrower details
    private String borrowerName;

    // Loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return 3;
    }

    // Reserve DVD
    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("DVD reserved by: " + borrowerName);
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
