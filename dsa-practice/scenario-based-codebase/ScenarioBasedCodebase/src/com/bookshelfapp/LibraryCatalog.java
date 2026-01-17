package com.bookshelfapp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class LibraryCatalog {

    // genre -> list of books
    private HashMap<String, LinkedList<Book>> genreMap = new HashMap<>();
    private HashSet<Book> uniqueBooks = new HashSet<>();

    // add book to library
    public void addBook(String genre, String title, String author) {

        Book book = new Book(title, author);

        if (uniqueBooks.contains(book)) {
            System.out.println("This book already exists.");
            return;
        }

        genreMap.putIfAbsent(genre, new LinkedList<>());
        genreMap.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println("Book added successfully.");
    }

    // borrow / remove book
    public void borrowBook(String genre, String title, String author) {

        if (!genreMap.containsKey(genre)) {
            System.out.println("Genre not found.");
            return;
        }

        Book book = new Book(title, author);

        if (genreMap.get(genre).remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // display library
    public void displayCatalog() {

        if (genreMap.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : genreMap.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : genreMap.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
