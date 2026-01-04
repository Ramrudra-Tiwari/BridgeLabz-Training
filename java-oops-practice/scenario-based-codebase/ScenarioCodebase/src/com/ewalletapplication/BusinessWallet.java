package com.ewalletapplication;

// Creating a Business wallet with tax deduction
public class BusinessWallet extends Wallet {

    public BusinessWallet(boolean referralBonus) {
        super(referralBonus);
    }

    // Transfer logic with tax
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.05;
        double total = amount + tax;

        if (getBalance() >= total) {
            deduct(total);
            receiver.getWallet().loadMoney(amount);
            history.add(new Transaction("Business Transfer", amount));
            history.add(new Transaction("Tax Deducted", tax));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
