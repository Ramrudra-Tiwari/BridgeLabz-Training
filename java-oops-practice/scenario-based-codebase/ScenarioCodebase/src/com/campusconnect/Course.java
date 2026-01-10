package com.campusconnect;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove student from course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Display course details
    public void printCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students: " + students.size());
    }
}
