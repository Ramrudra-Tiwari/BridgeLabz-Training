package com.multithreading.restaurantprocessingsystem;

public class Main {

	public static void main(String[] args) {
		Chef chef1 = new Chef(500,"Ram","Pizza");
		Chef chef2 = new Chef(1000,"merraz","Coffie");
		
		Thread thread1 = new Thread(()->{
			chef1.chefWorking();
		});
		
		Thread thread2 = new Thread(()-> {
			chef2.chefWorking();
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("...\nKitchen closed - All orders completed");
	}
}