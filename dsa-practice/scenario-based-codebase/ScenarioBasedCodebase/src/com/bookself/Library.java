
package com.bookself;

import java.util.*;

class Library {
    private Map<String, LinkedList<Book>> catalog;
    private Set<String> isbnSet; // to avoid duplication (optional)

    public Library() {
        catalog = new HashMap<>();
        isbnSet = new HashSet<>();
    }

    public void addBook(String str, Book book) {
        if (isbnSet.contains(book.isbn)) {
            System.out.println("Duplicate book not allowed: " + book.isbn);
            return;
        }

        catalog.putIfAbsent(str, new LinkedList<>());
        catalog.get(str).add(book);

        isbnSet.add(book.isbn);
        System.out.println("Book added to " + str);
    }

    // Remove a book (borrowed or removed)
    public void removeBook(String str, String isbn) {
        LinkedList<Book> books = catalog.get(str);
        if (books == null) return;

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.isbn.equals(isbn)) {
                iterator.remove();
                isbnSet.remove(isbn);
                System.out.println("Book removed: " + isbn);
                break;
            }
        }

        // Remove str if empty
        if (books.isEmpty()) {
            catalog.remove(str);
        }
    }

    // Display all books
    public void displayLibrary() {
        for (String str : catalog.keySet()) {
            System.out.println("\nstr: " + str);
            for (Book book : catalog.get(str)) {
                System.out.println("  - " + book);
            }
        }
    }
}
