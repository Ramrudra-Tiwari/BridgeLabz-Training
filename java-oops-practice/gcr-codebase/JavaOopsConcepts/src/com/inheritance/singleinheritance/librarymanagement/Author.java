package com.inheritance.singleinheritance.librarymanagement;


// creating Subclass Author that  extends Book
// Author is-a Book (for learning an  inheritance)
public class Author extends Book {

    String name;
    String bio;

    // Method to display book and author details using displayinfo
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
