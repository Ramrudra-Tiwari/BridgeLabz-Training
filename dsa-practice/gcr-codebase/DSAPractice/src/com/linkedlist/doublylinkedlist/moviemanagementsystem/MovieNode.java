package com.linkedlist.doublylinkedlist.moviemanagementsystem;

// node to store movie details
public class MovieNode {

    String title;        // movie title
    String director;     // director name
    int year;            // release year
    double rating;       // movie rating
    MovieNode next;      // next node
    MovieNode prev;      // previous node

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
