package com.encapsulationandpolymorphism.bankingsystem;

// Creating  Main class to  demonstrating polymorphism
public class BankingMain {

    public static void main(String[] args) {

        // BankAccount reference for SavingsAccount
        BankAccount acc1 = new SavingsAccount();
        acc1.setAccountNumber("SA101");
        acc1.setHolderName("Ramrudra");
        acc1.deposit(50000);

        acc1.displayAccount();
        System.out.println("Interest: " + acc1.calculateInterest());

        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan(100000);
        System.out.println("Loan Eligibility: " + loan1.calculateLoanEligibility());

        System.out.println();

        // BankAccount reference for CurrentAccount
        BankAccount acc2 = new CurrentAccount();
        acc2.setAccountNumber("CA202");
        acc2.setHolderName("Titu");
        acc2.deposit(80000);

        acc2.displayAccount();
        System.out.println("Interest: " + acc2.calculateInterest());
    }
}
