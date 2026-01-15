package com.gamebox;

// Base Game class
public class Game {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for paid games
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free games
    public Game(String title, String genre) {
        this(title, genre, 0.0, 0.0);
    }

    // Seasonal offer using operators
    public void applySeasonalOffer(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
