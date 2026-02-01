package com.collectors.studentresultgrouping;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = List.of(
					new Student(101,"ravi",'A'),
					new Student(102,"kali",'D'),
					new Student(103,"arnav",'C'),
					new Student(104,"alice",'A'),
					new Student(105,"suriya",'B'),
					new Student(106,"amit",'E'),
					new Student(107,"vitor",'B')
				);

		
		System.out.println(
				studentList.stream()
							.collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName, Collectors.toList())))
				);
	}
}