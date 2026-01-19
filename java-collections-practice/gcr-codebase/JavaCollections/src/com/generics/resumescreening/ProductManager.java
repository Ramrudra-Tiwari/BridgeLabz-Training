package com.generics.resumescreening;

// product manager role
public class ProductManager extends JobRole {

    public ProductManager() {
        this.roleName = "Product Manager";
    }

    @Override
    public void screeningCriteria() {
        System.out.println("Criteria: Communication, Strategy, Leadership");
    }
}
