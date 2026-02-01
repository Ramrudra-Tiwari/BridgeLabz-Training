package com.streamAPI.IoTsensorreadings;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Sensor> list = List.of(
				new Sensor(23.3),
				new Sensor(73.2),
				new Sensor(13.2),
				new Sensor(31.2),
				new Sensor(43.2)
				);
		
		double threeshold = 20.5;
		
		list.stream()
			.filter(Sensor-> Sensor.getValue()>threeshold)
			.forEach(System.out::println);
	}
}