package com.collectors.employeesalarycategorization;

public class Employee {
	private long employeeId;
	private String name;
	private double salary;
	private String deperatment;
	
	public Employee(long employeeId, String name, double salary, String deperatment) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.deperatment = deperatment;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeperatment() {
		return deperatment;
	}

	public void setDeperatment(String deperatment) {
		this.deperatment = deperatment;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", deperatment="
				+ deperatment + "]";
	}
}