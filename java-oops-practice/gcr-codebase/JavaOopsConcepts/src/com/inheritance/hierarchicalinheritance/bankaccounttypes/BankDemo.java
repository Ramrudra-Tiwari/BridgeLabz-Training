package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.setDetails(101, 5000);
        savings.setInterestRate(4.5);
        savings.displayAccountType();
        savings.showBalance();

        System.out.println();

        CheckingAccount checking = new CheckingAccount();
        checking.setDetails(102, 3000);
        checking.setWithdrawalLimit(10000);
        checking.displayAccountType();
        checking.showBalance();

        System.out.println();

        FixedDepositAccount fixed = new FixedDepositAccount();
        fixed.setDetails(103, 100000);
        fixed.setLockPeriod(5);
        fixed.displayAccountType();
        fixed.showBalance();
    }
}
