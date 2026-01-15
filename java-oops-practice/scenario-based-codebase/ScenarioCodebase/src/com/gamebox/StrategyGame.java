package com.gamebox;

// StrategyGame inherits from Game
public class StrategyGame extends Game implements IDownloadable {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    // Polymorphic behavior
    @Override
    public void playDemo() {
        System.out.println("Playing tactical strategy demo of " + title);
    }
}
