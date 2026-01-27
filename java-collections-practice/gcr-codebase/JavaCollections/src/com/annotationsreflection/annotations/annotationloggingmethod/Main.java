package com.annotationsreflection.annotations.annotationloggingmethod;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class<Service> clazz = Service.class;
            Service service = new Service();

            Method[] methods = clazz.getDeclaredMethods();

            for (Method m : methods) {

                if (m.isAnnotationPresent(LogExecutionTime.class)) {

                    long start = System.nanoTime();

                    // invoke method
                    m.invoke(service);

                    long end = System.nanoTime();

                    long duration = end - start;

                    System.out.println(
                        "Method: " + m.getName() +
                        " | Execution Time: " + duration + " ns"
                    );
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}