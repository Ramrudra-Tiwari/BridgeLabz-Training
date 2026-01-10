package com.bookbazaar;

// Printed book → physical copy
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism: Printed book pe kam discount
    @Override
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }
}
