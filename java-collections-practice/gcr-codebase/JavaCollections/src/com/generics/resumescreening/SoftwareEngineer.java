package com.generics.resumescreening;

// software engineer role
public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        this.roleName = "Software Engineer";
    }

    @Override
    public void screeningCriteria() {
        System.out.println("Criteria: Java, DSA, OOPs, Problem Solving");
    }
}
