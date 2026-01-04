package com.universitycourseenrollmentsystem;

//Creating an Course class
public class Course {

    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void showCourseDetails() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
    }
}
