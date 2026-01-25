package com.collections.banking;

import java.util.*;

public class BankingSystem {

    private HashMap<Integer, Integer> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void addAccount(int accNo, int balance) {
        accounts.put(accNo, balance);
        System.out.println("Account created.");
    }

    public void requestWithdrawal(int accNo) {
        withdrawalQueue.add(accNo);
        System.out.println("Withdrawal request added.");
    }

    public void processWithdrawals(int amount) {
        while (!withdrawalQueue.isEmpty()) {
            int acc = withdrawalQueue.poll();
            accounts.put(acc, accounts.get(acc) - amount);
        }
        System.out.println("Withdrawals processed.");
    }

    public void showAccounts() {
        System.out.println(accounts);
    }

    public void showSortedByBalance() {
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        for (Map.Entry<Integer, Integer> e : accounts.entrySet()) {
            sorted.put(e.getValue(), e.getKey());
        }
        System.out.println("Sorted by Balance:");
        System.out.println(sorted);
    }
}
