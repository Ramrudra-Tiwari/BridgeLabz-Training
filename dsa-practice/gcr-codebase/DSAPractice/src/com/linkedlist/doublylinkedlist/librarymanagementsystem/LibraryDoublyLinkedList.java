package com.linkedlist.doublylinkedlist.librarymanagementsystem;

// Creating Doubly linked list implementation for library
public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    // Add book at beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add book at end
    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add book at specific position
    public void addAtPosition(int position, String title, String author, String genre, int id, boolean available) {
        if (position <= 1) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, available);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, id, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove book by book ID
    public void removeByBookId(int bookId) {
        if (head == null) return;

        BookNode temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Search book by title or author
    public void searchBook(String keyword) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Update availability status
    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    // Display books forward
    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display books in reverse order
    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print book details
    private void printBook(BookNode book) {
        System.out.println("ID: " + book.bookId +
                ", Title: " + book.bookTitle +
                ", Author: " + book.author +
                ", Genre: " + book.genre +
                ", Available: " + book.isAvailable);
    }
}
