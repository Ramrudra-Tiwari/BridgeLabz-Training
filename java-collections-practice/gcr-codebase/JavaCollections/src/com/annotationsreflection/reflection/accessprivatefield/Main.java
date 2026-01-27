package com.annotationsreflection.reflection.accessprivatefield;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);
            
            Person person = new Person();

            Class<?> clazz = person.getClass();
                        

            
            System.out.println("\nFields:");
            Field fields = clazz.getDeclaredField("age");
            
            fields.setAccessible(true);            
            fields.set(person, 39);
            
            System.out.println((int)fields.get(person));
            sc.close();

        } catch (Exception e) {
            System.out.println("Class not found!");
        }

	}
}