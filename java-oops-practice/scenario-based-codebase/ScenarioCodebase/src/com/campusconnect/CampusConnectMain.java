package com.campusconnect;

import java.util.Scanner;

public class CampusConnectMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty input
        System.out.print("Enter Faculty ID: ");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Faculty Email: ");
        String femail = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course creation
        Course course = new Course("Java Programming", faculty);

        // Student input
        System.out.print("Enter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String semail = sc.nextLine();

        Student student = new Student(sid, sname, semail);

        // Grades input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            student.setGrade(i, sc.nextDouble());
        }

        // Enroll student
        student.enrollCourse(course);

        System.out.println("\n--- Details ---");
        student.printDetails();
        faculty.printDetails();
        course.printCourseDetails();

        sc.close();
    }
}
