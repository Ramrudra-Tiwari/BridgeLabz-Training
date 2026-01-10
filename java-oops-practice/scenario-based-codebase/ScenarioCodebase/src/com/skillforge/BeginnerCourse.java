package com.skillforge;

// Beginner level course
public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    // Polymorphism: beginner certificate
    @Override
    public void generateCertificate() {
        System.out.println("📜 Certificate of Completion (Beginner Level)");
    }
}
