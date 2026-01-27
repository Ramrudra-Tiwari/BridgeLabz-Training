package com.annotationsreflection.annotations.annotationmaxlength;


public class User {

    private String username;

    public User(String username) {
        this.username = username;
        validate();
    }

    private void validate() {
        try {
            if (username.length() > 10) {
                throw new IllegalArgumentException(
                    "Username exceeds max length: 10"
                );
            }
        } catch (IllegalArgumentException e) {
            // log if needed
            System.out.println("Validation failed in User class");

            // IMPORTANT: rethrow SAME exception
            throw e;
        }
    }
}