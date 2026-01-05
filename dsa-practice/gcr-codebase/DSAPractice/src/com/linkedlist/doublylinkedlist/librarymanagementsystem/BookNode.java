package com.linkedlist.doublylinkedlist.librarymanagementsystem;

//Creating  Node class representing a book
public class BookNode {

    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    // Constructor to initialize book details
    public BookNode(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
