package com.encapsulationandpolymorphism.librarymanagementsystem;

// Main class demonstrating polymorphism
public class LibraryMain {

    public static void main(String[] args) {

        // LibraryItem reference for Book
        LibraryItem item1 = new Book();
        item1.setItemId(1);
        item1.setTitle("Java Programming");
        item1.setAuthor("Ramrudra Tiwari");

        item1.getItemDetails();
        Reservable r1 = (Reservable) item1;
        r1.reserveItem("Anni");
        System.out.println("Available: " + r1.checkAvailability());

        System.out.println();

        // LibraryItem reference for Magazine
        LibraryItem item2 = new Magazine();
        item2.setItemId(2);
        item2.setTitle("Tech Today");
        item2.setAuthor("Editorial Team");

        item2.getItemDetails();
        Reservable r2 = (Reservable) item2;
        r2.reserveItem("Anvesh");
        System.out.println("Available: " + r2.checkAvailability());

        System.out.println();

        // LibraryItem reference for DVD
        LibraryItem item3 = new DVD();
        item3.setItemId(3);
        item3.setTitle("Inception");
        item3.setAuthor("Christopher Nolan");

        item3.getItemDetails();
        Reservable r3 = (Reservable) item3;
        r3.reserveItem("Anshika");
        System.out.println("Available: " + r3.checkAvailability());
    }
}
