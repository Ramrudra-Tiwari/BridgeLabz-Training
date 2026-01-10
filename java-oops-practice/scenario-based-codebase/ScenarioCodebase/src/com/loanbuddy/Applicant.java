package com.loanbuddy;

public class Applicant {

    private String name;
    private int creditScore;   // sensitive → encapsulated
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    // No setter for creditScore → protected
    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public String getName() {
        return name;
    }
}
