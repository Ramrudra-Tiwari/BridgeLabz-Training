package com.bookshelfapp;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // to avoid duplicate books
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return title.equalsIgnoreCase(other.title)
                && author.equalsIgnoreCase(other.author);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode()
                + author.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
