package com.objectmodeling.assisted;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books
    public void displayLibraryBooks() {
        for (Book book : books) {
            book.displayBook();
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {

        // Books created independently
        Book b1 = new Book("Godan", "Premchand");
        Book b2 = new Book("Gunah", "Dharm");

        // Library object
        Library library = new Library();

        // Adding books to library (Aggregation)
        library.addBook(b1);
        library.addBook(b2);

        // Display books
        library.displayLibraryBooks();
    }
}
