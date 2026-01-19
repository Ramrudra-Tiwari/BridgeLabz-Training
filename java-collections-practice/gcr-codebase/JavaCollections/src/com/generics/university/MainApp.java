package com.generics.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    //creating an  wildcard method to display any course type
    public static void showAllCourses(List<? extends Course<?>> courses) {
        for (Course<?> c : courses) {
            c.displayCourse();
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Course<?>> courseList = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n==== University Course Management System ====");
            System.out.println("1. Add Exam Based Course");
            System.out.println("2. Add Assignment Based Course");
            System.out.println("3. Add Research Based Course");
            System.out.println("4. Display All Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String eName = sc.nextLine();

                    System.out.print("Enter department: ");
                    String eDept = sc.nextLine();

                    courseList.add(
                        new Course<>(eName, eDept, new ExamCourse())
                    );
                    System.out.println("Exam course added.");
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String aName = sc.nextLine();

                    System.out.print("Enter department: ");
                    String aDept = sc.nextLine();

                    courseList.add(
                        new Course<>(aName, aDept, new AssignmentCourse())
                    );
                    System.out.println("Assignment course added.");
                    break;

                case 3:
                    System.out.print("Enter course name: ");
                    String rName = sc.nextLine();

                    System.out.print("Enter department: ");
                    String rDept = sc.nextLine();

                    courseList.add(
                        new Course<>(rName, rDept, new ResearchCourse())
                    );
                    System.out.println("Research course added.");
                    break;

                case 4:
                    System.out.println("\n--- Course List ---");
                    showAllCourses(courseList);
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
