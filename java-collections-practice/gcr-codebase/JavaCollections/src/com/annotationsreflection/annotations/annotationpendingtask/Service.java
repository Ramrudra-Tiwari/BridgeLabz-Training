package com.annotationsreflection.annotations.annotationpendingtask;

public class Service {
	@Todo(task = "ATM Software", assignedTo = "@llu")
	public void project1() {
		System.out.println("ATM Software");
	}
	
	
	@Todo(task = "Chat Application", assignedTo = "Titu", priority = "LOW")
	public void project2() {
		System.out.println("Chat application");
	}
	
}