package com.multithreading.downloadmanager;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new FileThread(new FileDownloader("Document.pdf")));
		Thread t2 = new Thread(new FileThread(new FileDownloader("Image.png")));
		Thread t3 = new Thread(new FileThread(new FileDownloader("Video.mp4")));
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("---");
		System.out.println("All downloading completed.");
	}
}