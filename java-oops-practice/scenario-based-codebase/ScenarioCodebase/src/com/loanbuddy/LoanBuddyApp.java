package com.loanbuddy;

import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("   💰 Welcome to Titu LoanBuddy App   ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Enter applicant name: ");
        String name = sc.nextLine();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.println("\nChoose loan type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter loan term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;

        if (choice == 1) {
            loan = new HomeLoan(applicant, term);
        } else {
            loan = new AutoLoan(applicant, term);
        }

        boolean approved = loan.approveLoan();

        System.out.println("\nLoan Status: " + loan.getLoanStatus());

        if (approved) {
            double emi = loan.calculateEMI();
            System.out.println("✅ Loan Approved!");
            System.out.println("📅 Monthly EMI: ₹" + String.format("%.2f", emi));
        } else {
            System.out.println("❌ Loan Rejected due to eligibility criteria.");
        }

        sc.close();
    }
}
