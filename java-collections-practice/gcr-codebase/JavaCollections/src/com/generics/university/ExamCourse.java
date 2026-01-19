package com.generics.university;

// exam based course
public class ExamCourse extends CourseType {

    public ExamCourse() {
        this.evaluationMethod = "Written Exams";
    }

    @Override
    public void showEvaluation() {
        System.out.println("Evaluation Type: " + evaluationMethod);
    }
}
