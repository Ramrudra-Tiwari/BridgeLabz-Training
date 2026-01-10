package com.bookbazaar;

// EBook → Book ka child
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Polymorphism: EBook pe zyada discount
    @Override
    public double applyDiscount(double price) {
        return price * 0.80; // 20% discount
    }
}
