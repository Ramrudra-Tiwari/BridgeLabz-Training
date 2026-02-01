package com.streamAPI.eventattendeewelcomemessage;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> message = List.of(
				"Aru",
				"Ramu",
				"Ali",
				"Kaliyug"
				);
		
		message.stream().forEach(name-> System.out.println("Welcome "+name+" to the event."));
	}
}