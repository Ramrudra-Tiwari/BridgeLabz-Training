package com.generics.university;

// assignment based course
public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        this.evaluationMethod = "Assignments & Projects";
    }

    @Override
    public void showEvaluation() {
        System.out.println("Evaluation Type: " + evaluationMethod);
    }
}
