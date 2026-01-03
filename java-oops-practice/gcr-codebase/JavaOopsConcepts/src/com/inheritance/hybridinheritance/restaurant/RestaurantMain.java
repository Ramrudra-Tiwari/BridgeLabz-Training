package com.inheritance.hybridinheritance.restaurant;

/*
 * Main class to test Hybrid Inheritance
 */
public class RestaurantMain {

    public static void main(String[] args) {

        // Creating Chef object
        Chef chef = new Chef();
        chef.setDetails("Manku", 101);     // inherited method in it
        chef.setSpeciality("Indian");    // chef specific
        chef.showDetails();
        chef.performDuties();             // interface method

        System.out.println();

        // Creating Waiter object
        Waiter waiter = new Waiter();
        waiter.setDetails("Titu", 201);  // inherited method
        waiter.setTableCount(5);          // waiter specific
        waiter.showDetails();
        waiter.performDuties();           // interface method
    }
}
