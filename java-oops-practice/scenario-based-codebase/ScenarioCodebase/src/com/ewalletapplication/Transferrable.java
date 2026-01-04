package com.ewalletapplication;

//Creating an  Interface for fund transfer
public interface Transferrable {
    void transferTo(User receiver, double amount);
}
