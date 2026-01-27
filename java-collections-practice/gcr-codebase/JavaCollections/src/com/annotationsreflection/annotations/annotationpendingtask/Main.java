package com.annotationsreflection.annotations.annotationpendingtask;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
			Class<Service> clazz = Service.class;
			
			Method[] method = clazz.getDeclaredMethods();
			
			for(Method m : method) {
				if(m.isAnnotationPresent(Todo.class)) {
					Todo todo = m.getAnnotation(Todo.class);
					System.out.println("---------------------");
					System.out.println(todo.task());
					System.out.println(todo.assignedTo());
					System.out.println(todo.priority());
					System.out.println("---------------------");
				}
			}
		}
		catch(Exception e) {
			System.out.println(""+e.getMessage());
		}
	}
}