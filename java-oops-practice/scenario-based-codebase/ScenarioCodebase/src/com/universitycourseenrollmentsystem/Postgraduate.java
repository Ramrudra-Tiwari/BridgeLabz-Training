package com.universitycourseenrollmentsystem;

// Creating Postgraduate student class that extends Student 
public class Postgraduate extends Student {

    // Correct constructor
    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    // Letter grading logic
    @Override
    public void assignGrade(double marks) {
        double gpa = marks / 25;
        setGpa(gpa);
    }
}
