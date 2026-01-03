package com.inheritance.singleinheritance.librarymanagement;


// Main class
public class LibraryMain {

    public static void main(String[] args) {

        Author m = new Author();

        m.title = "Java Core Basics";
        m.publicationYear = 2025;
        m.name = "Ramrudra Tiwari";
        m.bio = "Java Programmer";

        m.displayInfo();
    }
}
