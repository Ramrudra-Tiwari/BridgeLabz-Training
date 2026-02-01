
package com.functionalInterfaces.cloningprototypeobjects;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		Policy policy = new Policy(101,"Titu");
		
		Policy copy = (Policy)policy.clone();
		
		System.out.println(copy.policyHolder+"\n"+copy.policyId);
	}
}
