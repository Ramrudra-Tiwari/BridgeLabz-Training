package com.inheritance.hybridinheritance.restaurant;

/*
 * Person is the parent, it is an  (superclass)
 * Common properties for all people in restaurant
 */
public class Person {

    protected String name;
    protected int id;

    // Method to set common details
    public void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common details
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
