package com.universitycourseenrollmentsystem;

// Undergraduate student with pass/fail grading
public class Undergraduate extends Student {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    // Pass/Fail grading logic
    @Override
    public void assignGrade(double marks) {
        if (marks >= 40) {
            setGpa(4.0);
        } else {
            setGpa(0.0);
        }
    }
}
