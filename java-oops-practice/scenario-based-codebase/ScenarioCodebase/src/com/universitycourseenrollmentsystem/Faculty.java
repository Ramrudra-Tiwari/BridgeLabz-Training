package com.universitycourseenrollmentsystem;

// Creating Faculty class
public class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    //assigns grade in Faculty
    public void gradeStudent(Graded student, double marks) {
        student.assignGrade(marks);
    }

    public void showFaculty() {
        System.out.println("Faculty     : " + facultyName);
    }
}
