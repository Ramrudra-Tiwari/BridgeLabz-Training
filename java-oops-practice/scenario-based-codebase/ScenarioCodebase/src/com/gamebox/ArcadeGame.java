package com.gamebox;

// ArcadeGame inherits from Game
public class ArcadeGame extends Game implements IDownloadable {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    // Polymorphic behavior
    @Override
    public void playDemo() {
        System.out.println("Playing fast-paced arcade demo of " + title);
    }
}
