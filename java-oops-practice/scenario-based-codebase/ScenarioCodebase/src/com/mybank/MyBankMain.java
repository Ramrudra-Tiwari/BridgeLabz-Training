package com.mybank;

import java.util.Scanner;

// Creating an main  class
public class MyBankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();

        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Current Balance: ₹" + account.checkBalance());
        System.out.println("Interest Earned: ₹" + account.calculateInterest());

        sc.close();
    }
}
