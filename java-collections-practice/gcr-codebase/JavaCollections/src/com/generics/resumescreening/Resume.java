package com.generics.resumescreening;

// generic resume class
public class Resume<T extends JobRole> {

    private String candidateName;
    private int experience;
    private T jobRole;

    public Resume(String candidateName, int experience, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void displayResume() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Applied Role: " + jobRole.getRoleName());
        jobRole.screeningCriteria();
    }
}
