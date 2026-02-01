
package com.functionalInterfaces.backgroundjobexecution;

public class Main {

	public static void main(String[] args) {
		
		Runnable task = () -> {
		    System.out.println("Background job running");
		};
		
		//Thread t = new Thread(task);
		//t.start();
		System.out.println(task);
		System.out.println("Main thread continuee..");
	}
}
	