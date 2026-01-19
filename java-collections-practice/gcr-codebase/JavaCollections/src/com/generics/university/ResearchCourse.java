package com.generics.university;

// research based course
public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        this.evaluationMethod = "Research & Thesis";
    }

    @Override
    public void showEvaluation() {
        System.out.println("Evaluation Type: " + evaluationMethod);
    }
}
