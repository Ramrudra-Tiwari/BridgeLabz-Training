package com.encapsulationandpolymorphism.librarymanagementsystem;

// Book class
public class Book extends LibraryItem implements Reservable {

    // Private borrower details
    private String borrowerName;

    // Loan duration for books
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserve book
    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Book reserved by: " + borrowerName);
        }
    }

    // Check availability
    @Override
    public boolean checkAvailability() {
        return available;
    }
}
