package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolDemo {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setDetails("Mr. Khan", 40);
        teacher.setSubject("Mathematics");
        teacher.displayRole();
        teacher.showDetails();

        System.out.println();

        Student student = new Student();
        student.setDetails("Ram", 16);
        student.setGrade("10th");
        student.displayRole();
        student.showDetails();

        System.out.println();

        Staff staff = new Staff();
        staff.setDetails("Rudra", 35);
        staff.setDepartment("Administration");
        staff.displayRole();
        staff.showDetails();
    }
}
