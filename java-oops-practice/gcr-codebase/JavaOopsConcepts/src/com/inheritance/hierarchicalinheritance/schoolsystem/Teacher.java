package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {

    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
