package com.functionalInterfaces.SecurityApps;

public class SecurityApp {

	public static void main(String[] args) {
		   UserCredentials user = new UserCredentials("Titu", "secret123");
	        BankAccount account = new BankAccount("123456789");
	        String normalData = "Hello";

	        EncryptionService.encryptIfSensitive(user);
	        EncryptionService.encryptIfSensitive(account);
	        EncryptionService.encryptIfSensitive(normalData);
	}
}