package com.collections.Map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Employee class
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));

        // Map: Department -> List of Employees
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Grouping logic
        for (Employee emp : employees) {
            if (!departmentMap.containsKey(emp.department)) {
                departmentMap.put(emp.department, new ArrayList<>());
            }
            departmentMap.get(emp.department).add(emp);
        }

        // Print result
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
