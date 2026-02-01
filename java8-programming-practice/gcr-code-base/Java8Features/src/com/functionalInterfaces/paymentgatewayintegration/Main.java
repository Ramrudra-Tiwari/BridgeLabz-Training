package com.functionalInterfaces.paymentgatewayintegration;

public class Main{

	public static void main(String[] args) {
		OldProvider p = new OldProvider();
		p.pay(49423);
		
		NewProvider n = new NewProvider();
		n.pay(43345);
		n.refund(344);
	}
}