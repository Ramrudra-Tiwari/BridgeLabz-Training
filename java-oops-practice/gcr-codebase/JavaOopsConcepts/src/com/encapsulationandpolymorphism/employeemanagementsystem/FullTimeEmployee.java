package com.encapsulationandpolymorphism.employeemanagementsystem;


// FullTimeEmployee class extending Employee and implementing Department
public class FullTimeEmployee extends Employee implements Department {

    // Department name
    private String department;

    // Fixed salary calculation
    @Override
    public double calculateSalary() {
        return baseSalary;
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
