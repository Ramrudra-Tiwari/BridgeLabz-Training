package com.campusconnect;

public class Faculty extends Person {

    private String department;

    // Constructor
    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    // Polymorphic method
    @Override
    public void printDetails() {
        System.out.println("Faculty ID: " + id + ", Name: " + name + ", Dept: " + department);
    }
}
