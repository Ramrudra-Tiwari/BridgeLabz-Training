package com.annotationsreflection.reflection.dynamicallycreateobjects;

class Student {

    private String name;
    private int roll;

    public Student() {
        this.name = "Arvind";
        this.roll = 101;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}