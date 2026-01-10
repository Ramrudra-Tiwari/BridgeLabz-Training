package com.medistore;

// Selling & expiry related behavior
public interface ISellable {

    double sell(int quantity);
    boolean checkExpiry();
}
