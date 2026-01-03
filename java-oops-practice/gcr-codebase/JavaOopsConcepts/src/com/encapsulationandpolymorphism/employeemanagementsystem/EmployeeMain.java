package com.encapsulationandpolymorphism.employeemanagementsystem;


// main class demonstrating of polymorphism
public class EmployeeMain {

    public static void main(String[] args) {

        // creating employee reference holding for full time employee object
        Employee emp1 = new FullTimeEmployee();
        emp1.setEmployeeId(101);
        emp1.setName("Yash ");
        emp1.setBaseSalary(50000);

        // Interface reference
        Department d1 = (Department) emp1;
        d1.assignDepartment("CSE");

        emp1.displayDetails();
        System.out.println("Department: " + d1.getDepartmentDetails());

        System.out.println();

        // PartTimeEmployee object
        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.setEmployeeId(102);
        emp2.setName("Ramrudra");
        emp2.setBaseSalary(500);
        emp2.setHoursWorked(40);
        emp2.assignDepartment("Support");

        emp2.displayDetails();
        System.out.println("Department: " + emp2.getDepartmentDetails());
    }
}
