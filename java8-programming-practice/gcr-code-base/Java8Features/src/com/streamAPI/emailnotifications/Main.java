package com.streamAPI.emailnotifications;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = List.of(
					"MAster@gmail.com",
					"Titu@gmail.com",
					"wardhan@gmail.com",
					"arvind@gmail.com",
					"Merraz@gmail.com",
					"papu@gmail.com"
				);
		list.stream()
			.forEach(email-> sendEmailNotification(email));
		
	}
	public static void sendEmailNotification(String email) {
		System.out.println("Notification sent success to -> "+email);
	}
}