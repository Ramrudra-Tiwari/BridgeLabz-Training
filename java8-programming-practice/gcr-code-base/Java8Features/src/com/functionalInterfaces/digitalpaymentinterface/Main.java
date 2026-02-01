
package com.functionalInterfaces.digitalpaymentinterface;

public class Main {

	public static void main(String[] args) {
		Payment UPI  = () -> System.out.println("UPI Payment DONE");
		
		Payment Credit  = () -> System.out.println("Credit Payment DONE");
		
		Payment Wallet = () -> System.out.println("Wallet Payment DONE");
		

		UPI.pay();
		
		Credit.pay();
		
		Wallet.pay();
	}
}
