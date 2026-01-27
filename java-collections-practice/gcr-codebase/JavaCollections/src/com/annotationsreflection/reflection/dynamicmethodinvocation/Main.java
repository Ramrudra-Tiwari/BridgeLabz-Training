
package com.annotationsreflection.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Create object dynamically
        Class<?> clazz = Class.forName("com.annotationsreflection.reflection.dynamicmethodinvocation.MathOperations");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Get method dynamically
        Method method = clazz.getMethod(methodName, int.class, int.class);

        // Invoke method
        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);

        sc.close();
    }
}
