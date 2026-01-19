package com.generics.resumescreening;

import java.util.List;

// utility class for screening
public class ResumeProcessor {

    // wildcard method to screen any job role resumes
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {

        for (Resume<? extends JobRole> r : resumes) {
            System.out.println("\n--- Screening Resume ---");
            r.displayResume();
        }
    }
}
