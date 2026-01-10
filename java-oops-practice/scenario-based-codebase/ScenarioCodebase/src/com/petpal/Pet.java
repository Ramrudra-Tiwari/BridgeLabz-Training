package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;  // encapsulated
    private int energy;  // encapsulated
    private String mood; // internal state

    // Random default constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;  // 30–80
        this.energy = r.nextInt(50) + 30;
        updateMood();
    }

    // Encapsulation: mood only updated internally
    protected void updateMood() {
        if (energy > 70 && hunger < 40) {
            mood = "Happy 😊";
        } else if (energy < 30) {
            mood = "Tired 😴";
        } else if (hunger > 70) {
            mood = "Hungry 😢";
        } else {
            mood = "Normal 🙂";
        }
    }

    public void showStatus() {
        System.out.println("\n🐾 Pet Status");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    // Operators used
    @Override
    public void feed() {
        hunger -= 20;
        energy += 10;
        updateMood();
        System.out.println(name + " has been fed 🍖");
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        updateMood();
        System.out.println(name + " played happily 🎾");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        updateMood();
        System.out.println(name + " is sleeping 😴");
    }

    // Polymorphism
    public abstract void makeSound();
}
