package com.annotationsreflection.reflection.retrieveannotations;

public class Main {

    public static void main(String[] args) {

        // Get Class object
        Class<Book> clazz = Book.class;

        // Check if annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {

            // Retrieve annotation
            Author author = clazz.getAnnotation(Author.class);

            // Access annotation value
            System.out.println("Author Name: " + author.name());
        }
    }
}