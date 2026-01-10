package com.bookbazaar;

// Parent class for all book types
public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock; // inventory data → encapsulated

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Inventory update sirf method ke through
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("❌ Not enough stock available");
        }
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
