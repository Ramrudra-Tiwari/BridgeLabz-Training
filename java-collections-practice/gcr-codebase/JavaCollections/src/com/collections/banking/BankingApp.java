package com.collections.banking;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdrawal Request");
            System.out.println("3. Process Withdrawals");
            System.out.println("4. Show Accounts");
            System.out.println("5. Sort By Balance");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account No: ");
                    int acc = sc.nextInt();
                    System.out.print("Balance: ");
                    int bal = sc.nextInt();
                    bank.addAccount(acc, bal);
                    break;
                case 2:
                    System.out.print("Account No: ");
                    bank.requestWithdrawal(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Withdraw Amount: ");
                    bank.processWithdrawals(sc.nextInt());
                    break;
                case 4:
                    bank.showAccounts();
                    break;
                case 5:
                    bank.showSortedByBalance();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
