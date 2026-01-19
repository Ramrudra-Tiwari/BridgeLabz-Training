package com.generics.university;

// base class for all course types
public abstract class CourseType {

    protected String evaluationMethod;

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    // each course type explains evaluation
    public abstract void showEvaluation();
}
