package com.encapsulationandpolymorphism.employeemanagementsystem;


// Creating PartTimeEmployee class with hourly salary calculation
public class PartTimeEmployee extends Employee implements Department {

    // Hours worked by employee
    private int hoursWorked;
    private String department;

    // Setter for hours worked
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Salary based on hours worked
    @Override
    public double calculateSalary() {
        return hoursWorked * baseSalary;
    }

    // Assign department
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    // Get department details
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
