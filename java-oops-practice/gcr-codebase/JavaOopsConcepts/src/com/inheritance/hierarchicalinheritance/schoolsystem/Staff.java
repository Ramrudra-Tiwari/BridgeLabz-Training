package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Staff extends Person {

    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
