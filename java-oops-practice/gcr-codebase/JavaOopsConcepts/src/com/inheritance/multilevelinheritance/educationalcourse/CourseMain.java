package com.inheritance.multilevelinheritance.educationalcourse;

public class CourseMain {

    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse();

        course.courseName = "Java Programming";
        course.duration = 60;
        course.platform = "BridgeLabz";
        course.isRecorded = true;
        course.fee = 5000;
        course.discount = 100;

        System.out.println("Course Name: " + course.courseName);
        System.out.println("Duration: " + course.duration + " days");
        System.out.println("Platform: " + course.platform);
        System.out.println("Recorded: " + course.isRecorded);
        System.out.println("Fee: " + course.fee);
        System.out.println("Discount: " + course.discount);
    }
}
