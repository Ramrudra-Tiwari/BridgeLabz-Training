package com.multithreading.shopjobscheduler;

public class PrintJob implements Runnable{
	Job job;
	
	public PrintJob(Job job) {
		this.job = job;
	}

	@Override
	public void run() {
		print(job);
	}
	
	public synchronized void print(Job job) {
		String priority = findPriority(job.getPriority());
		try {
			System.out.println("[ "+priority+" Priority ] Printing "+job.getName()+" - "+ "pages 1 to "+job.getPage());
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public String findPriority(int priority) {
		if(priority>=1 && priority<=4) {
			return "LOW";
		}
		else if(priority>4 && priority<=6) {
			return "MEDIUM";
		}
		else if(priority>6 && priority<=10) {
			return "HIGHT";
		}
		else {
			return "Invalid Priority";
		}
	}
}