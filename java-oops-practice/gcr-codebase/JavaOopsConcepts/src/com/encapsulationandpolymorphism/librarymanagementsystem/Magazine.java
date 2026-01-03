package com.encapsulationandpolymorphism.librarymanagementsystem;

// Magazine class
public class Magazine extends LibraryItem implements Reservable {

    // Private borrower details
    private String borrowerName;

    // Loan duration for magazines
    @Override
    public int getLoanDuration() {
        return 7;
    }

    // Reserve magazine
    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Magazine reserved by: " + borrowerName);
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
