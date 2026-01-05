package com.linkedlist.doublylinkedlist.moviemanagementsystem;

// main class to test movie management system
public class MovieMain {

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Salaar", "Meraaz", 2022, 8.8);
        movies.addAtEnd("Iron man 1 ", "Meraaz", 2014, 8.6);
        movies.addAtEnd("Avatar", "Titu", 2025, 7.8);
        movies.addAtPosition(2, "Avenger Endgame", "Titu", 2020, 7.9);

        System.out.println("Forward Display:");
        movies.displayForward();

        System.out.println("\nReverse Display:");
        movies.displayReverse();

        System.out.println("\nSearch Result:");
        movies.searchMovie("Nolan", 0);

        movies.updateRating("Avatar", 8.0);
        movies.removeByTitle("Titanic");

        System.out.println("\nAfter Updates:");
        movies.displayForward();
    }
}
