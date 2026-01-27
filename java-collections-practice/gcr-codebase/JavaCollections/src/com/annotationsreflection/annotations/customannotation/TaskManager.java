package com.annotationsreflection.annotations.customannotation;

public class TaskManager {
	@TaskInfo(priority=1,assignTo="Arvind")
	public void createTask() {
		System.out.println("Task created...");
 	}
}