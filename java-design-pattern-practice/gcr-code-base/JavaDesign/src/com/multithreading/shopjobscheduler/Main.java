package com.multithreading.shopjobscheduler;

public class Main {
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new PrintJob(new Job("Job1",10,5)));
		thread1.setPriority(Thread.NORM_PRIORITY);
		Thread thread2 = new Thread(new PrintJob(new Job("Job2",21,1)));
		thread2.setPriority(Thread.MIN_PRIORITY);
		Thread thread3 = new Thread(new PrintJob(new Job("Job3",53,3)));
		thread3.setPriority(Thread.MIN_PRIORITY);
		Thread thread4 = new Thread(new PrintJob(new Job("Job4",43,9)));
		thread4.setPriority(Thread.MAX_PRIORITY);
		Thread thread5 = new Thread(new PrintJob(new Job("Job5",5,7)));
		thread5.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Started Printing Job");
		
		long startTime = System.nanoTime();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("...\nAll jobs completed in "+(endTime-startTime));
	}
}