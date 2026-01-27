package com.streams.employeelist;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	String department;
	double salary;
	
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	//this method help 'toString()' method to see the data easily later
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + department + ", salary=" + salary + "]";
    }
}