package com.collectors.employeesalarycategorization;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = List.of(
					new Employee(101,"ram",29191,"IT"),
					new Employee(102,"kalu",90494,"IT"),
					new Employee(103,"allu",49493,"Pharma"),
					new Employee(104,"suro",39292,"HR"),
					new Employee(105,"ali",4933,"IT"),
					new Employee(106,"parti",282829,"HR")
				);
		
		
		System.out.println(
					list.stream()
						.collect(Collectors.groupingBy(Employee::getDeperatment,Collectors.averagingDouble(Employee::getSalary)))
				);
	}
}