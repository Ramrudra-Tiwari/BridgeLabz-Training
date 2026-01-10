package com.bookbazaar;

import java.util.ArrayList;
import java.util.List;

// Order user aur books ke beech relation banata hai
public class Order {

    private List<Book> books = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    private String orderStatus = "CREATED"; // restricted update

    // Book ko order me add karna
    public void addBook(Book book, int quantity) {
        if (book.getStock() >= quantity) {
            books.add(book);
            quantities.add(quantity);
            book.reduceStock(quantity); // inventory update
        } else {
            System.out.println("❌ Stock not available for " + book.getTitle());
        }
    }

    // Total cost calculate karna
    public double calculateTotal() {

        double total = 0;

        for (int i = 0; i < books.size(); i++) {

            Book b = books.get(i);
            int qty = quantities.get(i);

            // Operator usage: price × quantity
            double cost = b.getPrice() * qty;

            // Polymorphism: discount varies by book type
            cost = b.applyDiscount(cost);

            total += cost;
        }

        return total;
    }

    // Order status sirf andar se change hoga
    protected void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
