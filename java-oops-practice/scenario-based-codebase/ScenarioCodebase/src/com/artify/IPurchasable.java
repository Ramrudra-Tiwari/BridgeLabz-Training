package com.artify;

// Purchase & licensing related behavior
public interface IPurchasable {

    void purchase(User user);
    void license(User user);
}
