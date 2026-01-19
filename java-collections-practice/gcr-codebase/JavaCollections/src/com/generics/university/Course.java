package com.generics.university;

//creating an  generic course class
public class Course<T extends CourseType> {

    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName +
                ", Department: " + department);
        courseType.showEvaluation();
    }

    public T getCourseType() {
        return courseType;
    }
}
