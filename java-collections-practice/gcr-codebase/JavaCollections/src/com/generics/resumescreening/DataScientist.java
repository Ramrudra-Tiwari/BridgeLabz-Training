package com.generics.resumescreening;

// data scientist role
public class DataScientist extends JobRole {

    public DataScientist() {
        this.roleName = "Data Scientist";
    }

    @Override
    public void screeningCriteria() {
        System.out.println("Criteria: Python, ML, Statistics, SQL");
    }
}
