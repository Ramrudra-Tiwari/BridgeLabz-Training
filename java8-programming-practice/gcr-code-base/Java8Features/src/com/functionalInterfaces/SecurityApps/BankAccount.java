package com.functionalInterfaces.SecurityApps;

public class BankAccount implements SensitiveData{
	 private String accountNumber;

	    public BankAccount(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }
}