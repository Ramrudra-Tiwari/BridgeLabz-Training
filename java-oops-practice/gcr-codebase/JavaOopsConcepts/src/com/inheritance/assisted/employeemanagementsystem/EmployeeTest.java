package com.inheritance.assisted.employeemanagementsystem;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager("Lucky", 101, 90000, 5);
        Employee e2 = new Developer("Meraaz", 102, 50000, "Java");
        Employee e3 = new Intern("vivek", 103, 10000, 6);

        e1.displayDetails();
        System.out.println("-------------------");

        e2.displayDetails();
        System.out.println("-------------------");

        e3.displayDetails();
    }
}
