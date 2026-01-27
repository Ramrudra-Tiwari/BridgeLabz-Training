package com.annotationsreflection.annotations.annotationloggingmethod;


public class Service {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1_000_000; i++) {
            // simulate small work
        }
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 50_000_000; i++) {
            // simulate heavy work
        }
    }

    public void normalTask() {
        System.out.println("Normal task (no timing)");
    }
}