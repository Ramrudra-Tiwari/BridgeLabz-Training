package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Student extends Person {

    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
