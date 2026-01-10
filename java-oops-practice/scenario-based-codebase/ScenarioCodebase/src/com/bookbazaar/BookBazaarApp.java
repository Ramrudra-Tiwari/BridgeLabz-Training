package com.bookbazaar;

import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   📚 Welcome to BookBazaar App  ");
        System.out.println("=================================");

        // Taking book type input
        System.out.println("Enter Book Type (1 = EBook, 2 = PrintedBook): ");
        int choice = sc.nextInt();
        sc.nextLine(); // buffer clear

        // Taking book details
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock = sc.nextInt();

        Book book;

        // Creating object using inheritance
        if (choice == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        // Taking quantity input
        System.out.print("Enter Quantity to Order: ");
        int quantity = sc.nextInt();

        Order order = new Order();

        // Adding book to order
        order.addBook(book, quantity);

        // Calculating total price
        double totalAmount = order.calculateTotal();

        System.out.println("\n🧾 Order Summary");
        System.out.println("Book Name: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount (After Discount): ₹" + totalAmount);
        System.out.println("Order Status: " + order.getOrderStatus());

        sc.close();
    }
}
