package com.skillforge;

// Advanced level course
public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    // Polymorphism: advanced certificate
    @Override
    public void generateCertificate() {
        System.out.println("🏆 Professional Certificate (Advanced Level)");
    }
}
