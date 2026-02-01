package com.lambdaexpressions.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101,"ravi"));
		list.add(new Employee(102,"manku"));
		list.add(new Employee(103,"suriya"));
		list.add(new Employee(104,"Titu"));
		
		list.forEach(e-> e.setName(e.getName().toUpperCase()));
		for(Employee e: list)
		System.out.println(e.toString());
	}
}