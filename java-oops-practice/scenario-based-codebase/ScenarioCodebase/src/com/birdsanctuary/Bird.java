package com.birdsanctuary;

public abstract class Bird {

    private String id;
    private String name;
    private String species;

    public Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}
