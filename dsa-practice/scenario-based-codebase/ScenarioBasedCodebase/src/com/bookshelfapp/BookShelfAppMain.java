package com.bookshelfapp;

import java.util.Scanner;

public class BookShelfAppMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryCatalog library = new LibraryCatalog();
        int choice;

        do {
            System.out.println("\n=== BookShelf App ===");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(genre, title, author);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    genre = sc.nextLine();

                    System.out.print("Enter Title: ");
                    title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    author = sc.nextLine();

                    library.borrowBook(genre, title, author);
                    break;

                case 3:
                    library.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting BookShelf App.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
