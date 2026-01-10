package com.skillforge;

import java.util.Scanner;

public class SkillForgeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" 🎓 Welcome to SkillForge Portal ");
        System.out.println("=================================");

        // Instructor input
        System.out.print("Enter Instructor Name: ");
        String instructorName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instructorEmail = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, instructorEmail);

        // Course input
        System.out.print("Enter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter Number of Modules: ");
        int moduleCount = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[moduleCount];
        for (int i = 0; i < moduleCount; i++) {
            System.out.print("Enter Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        System.out.println("Select Course Level:");
        System.out.println("1. Beginner");
        System.out.println("2. Advanced");

        int level = sc.nextInt();

        Course course;
        if (level == 1) {
            course = new BeginnerCourse(courseTitle, instructor, modules);
        } else {
            course = new AdvancedCourse(courseTitle, instructor, modules);
        }

        // Student input
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();

        Student student = new Student(studentName, studentEmail);

        System.out.print("Enter Completed Modules: ");
        int completed = sc.nextInt();

        // Progress calculation
        student.updateProgress(completed, course.getTotalModules());

        System.out.println("\n📘 Course Details");
        course.showCourseDetails();

        System.out.println("\n👨‍🎓 Student Progress: " + student.getProgress() + "%");

        if (student.getProgress() == 100) {
            course.generateCertificate();
        } else {
            System.out.println("❌ Course not completed yet. No certificate.");
        }

        sc.close();
    }
}
