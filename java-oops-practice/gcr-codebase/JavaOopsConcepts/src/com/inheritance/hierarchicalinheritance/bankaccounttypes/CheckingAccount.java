package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {

    private int withdrawalLimit;

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
