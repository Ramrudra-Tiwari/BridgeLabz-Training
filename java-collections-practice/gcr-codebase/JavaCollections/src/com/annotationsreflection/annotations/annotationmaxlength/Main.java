package com.annotationsreflection.annotations.annotationmaxlength;

public class Main {
    public static void main(String[] args) {

        try {
            User user = new User("verylongusername");
            System.out.println("User created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}