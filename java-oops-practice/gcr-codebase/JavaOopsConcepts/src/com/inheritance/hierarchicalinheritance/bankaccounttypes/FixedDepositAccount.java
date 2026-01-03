package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {

    private int lockPeriod;

    public void setLockPeriod(int lockPeriod) {
        this.lockPeriod = lockPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock Period: " + lockPeriod + " years");
    }
}
