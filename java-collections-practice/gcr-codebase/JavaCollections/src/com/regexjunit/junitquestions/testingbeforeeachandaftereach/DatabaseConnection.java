package com.regexjunit.junitquestions.testingbeforeeachandaftereach;

public class DatabaseConnection {
	static boolean check = false;
	
	//connect
	public void connect() {
		check = true;
		System.out.println("Connect databse.");
	}
	
	//disconnect
	public void disconnect() {
		check = false;
		System.out.println("Database disconnected.");
	}
	
	//status
	public boolean isConnected() {
		return check;
	}
}