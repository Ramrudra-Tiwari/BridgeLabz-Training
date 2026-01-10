package com.campusconnect;

public class Person {

    protected int id;
    protected String name;
    protected String email;

    // Constructor to initialize common fields
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Method to be overridden
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}
