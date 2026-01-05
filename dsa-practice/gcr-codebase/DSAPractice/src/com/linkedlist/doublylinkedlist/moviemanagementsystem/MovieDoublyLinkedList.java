package com.linkedlist.doublylinkedlist.moviemanagementsystem;

//Creating  doubly linked list for movie management
public class MovieDoublyLinkedList {

    private MovieNode head;   // For first movie
    private MovieNode tail;   // For last movie

    // add movie at beginning of the node 
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add movie at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add movie at specific position
    public void addAtPosition(int pos, String title, String director, int year, double rating) {

        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // remove movie by title
    public void removeByTitle(String title) {

        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // search movie by director or rating
    public void searchMovie(String director, double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found");
        }
    }

    // update rating by movie title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // display movies forward
    public void displayForward() {
        MovieNode temp = head;

        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    // display movies in reverse
    public void displayReverse() {
        MovieNode temp = tail;

        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    // helper method to print movie
    private void printMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }
}
