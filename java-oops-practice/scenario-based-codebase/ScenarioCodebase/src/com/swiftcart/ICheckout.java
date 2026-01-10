package com.swiftcart;

public interface ICheckout {

    void generateBill();

    double applyDiscount(double coupon);
}
