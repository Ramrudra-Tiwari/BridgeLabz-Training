package com.generics.resumescreening;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n==== AI-Driven Resume Screening System ====");
            System.out.println("1. Add Software Engineer Resume");
            System.out.println("2. Add Data Scientist Resume");
            System.out.println("3. Add Product Manager Resume");
            System.out.println("4. Screen All Resumes");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Candidate name: ");
                    String seName = sc.nextLine();

                    System.out.print("Experience (years): ");
                    int seExp = sc.nextInt();

                    resumeList.add(
                        new Resume<>(seName, seExp, new SoftwareEngineer())
                    );
                    System.out.println("Resume added.");
                    break;

                case 2:
                    System.out.print("Candidate name: ");
                    String dsName = sc.nextLine();

                    System.out.print("Experience (years): ");
                    int dsExp = sc.nextInt();

                    resumeList.add(
                        new Resume<>(dsName, dsExp, new DataScientist())
                    );
                    System.out.println("Resume added.");
                    break;

                case 3:
                    System.out.print("Candidate name: ");
                    String pmName = sc.nextLine();

                    System.out.print("Experience (years): ");
                    int pmExp = sc.nextInt();

                    resumeList.add(
                        new Resume<>(pmName, pmExp, new ProductManager())
                    );
                    System.out.println("Resume added.");
                    break;

                case 4:
                    ResumeProcessor.screenResumes(resumeList);
                    break;

                case 5:
                    System.out.println("Exiting system Thanks Buddy...");
                    break;

                default:
                    System.out.println("Invalid choice Soory Correct it Again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
