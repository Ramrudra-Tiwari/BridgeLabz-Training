package com.annotationsreflection.reflection.getclassinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
            Scanner sc = new Scanner(System.in);

            // 1. Load class at runtime
            Class<?> clazz = Class.forName("com.annotationsreflection.reflection.getclassinformation.Person");

            // 2. Methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }

            // 3. Fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }

            // 4. Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("Class not found!");
        }

	}
}