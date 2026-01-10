package com.campusconnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Course> courses;
    private double[] grades; // grades are private as required

    // Constructor
    public Student(int id, String name, String email) {
        super(id, name, email);
        courses = new ArrayList<>();
        grades = new double[5];
    }

    // Add grade
    public void setGrade(int index, double grade) {
        grades[index] = grade;
    }

    // Calculate GPA using operators
    public double calculateGPA() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    // Enroll in course
    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    // Drop course
    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Polymorphic method
    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + calculateGPA());
    }
}
