package com.universitycourseenrollmentsystem;

// Creating an Abstract Student class
public abstract class Student implements Graded {

    protected int studentId;
    protected String name;
    private double gpa;   // use of Encapsulation

    // Defining Constructor
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //For  GPA setter
    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Creating Public transcript access
    public void showTranscript() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("GPA        : " + gpa);
    }
}
