package com.multithreading.restaurantprocessingsystem;

import java.util.Random;

public class Chef {
	private long sleepTime;
	private String chefName;
	private String dish;
	
	private int percentage = 0;
	private Random random = new Random();
	
	public Chef(long sleepTime, String chefName, String dish) {
		super();
		this.sleepTime = sleepTime;
		this.chefName = chefName;
		this.dish = dish;
	}



	public void chefWorking() {
		System.out.println("[ "+chefName+ " ] Started Preparing "+ dish);
		
		while(percentage<100) {
			if(percentage>=100) {
				percentage = 100;
			}
			System.out.println("[ "+chefName+ " ] Started Preparing "+ dish + ": "+ percentage + "% completed");
			percentage+=random.nextInt(100)+1;
			try {
				Thread.sleep(sleepTime%percentage);
			}
			
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}		
	}
}