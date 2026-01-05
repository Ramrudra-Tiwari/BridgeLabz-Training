package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//Creating  Main class to test library system
public class LibraryMain {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning("Java Basics", "Ramrudra Tiwari", "Programming", 101, true);
        library.addAtEnd("TheEnd", "Moh. Merraz", "Software", 102, true);
        library.addAtPosition(2, "DSA", "Suraj Kumar", "Computer Science", 103, false);

        System.out.println("All Books (Forward):");
        library.displayForward();

        System.out.println("\nAll Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch Result:");
        library.searchBook("Clean Code");

        library.updateAvailability(103, true);

        library.removeByBookId(101);

        System.out.println("\nAfter Removal:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
