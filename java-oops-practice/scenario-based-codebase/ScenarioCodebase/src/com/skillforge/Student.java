package com.skillforge;

// Student user
public class Student extends User {

    private int progress; // percentage progress

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    // Progress update (operators used)
    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    public int getProgress() {
        return progress;
    }
}
