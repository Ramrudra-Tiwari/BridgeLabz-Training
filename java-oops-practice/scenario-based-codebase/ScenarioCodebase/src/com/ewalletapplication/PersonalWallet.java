package com.ewalletapplication;

// Creating Personal wallet with no extra tax
public class PersonalWallet extends Wallet {

    public PersonalWallet(boolean referralBonus) {
        super(referralBonus);
    }

    // Generating Transfer logic for personal wallet
    @Override
    public void transferTo(User receiver, double amount) {
        if (getBalance() >= amount) {
            deduct(amount);
            receiver.getWallet().loadMoney(amount);
            history.add(new Transaction("Transfer Sent", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
