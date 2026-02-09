package com.librarymanagementsystem;

public class Faculty implements IUser{
	protected String name;

	public Faculty(String name) {
		this.name = name;
	}

	@Override
	public void showRoles() {
		System.out.println(name+" is a faculty.");
	}
	
	//faculty get notified when book arrived
	public void getNotified(String message) {
		System.out.println(name+" notified-> "+message);
	}
}