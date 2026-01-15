package com.bookself;

public class BookShelfApp {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Fantasy", new Book("101", "Harry Potter", "J.K. Rowling"));
        library.addBook("Fantasy", new Book("102", "The Hobbit", "J.R.R. Tolkien"));
        library.addBook("Science", new Book("201", "A Brief History of Time", "Stephen Hawking"));

        library.displayLibrary();

        library.removeBook("Fantasy", "101");
        library.displayLibrary();
    }
}