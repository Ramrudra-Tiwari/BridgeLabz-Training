package com.gamebox;

import java.util.ArrayList;
import java.util.List;

// User class with encapsulated owned games
public class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access to add games
    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to your library.");
    }

    public void showOwnedGames() {
        System.out.println("\nOwned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle());
        }
    }
}
