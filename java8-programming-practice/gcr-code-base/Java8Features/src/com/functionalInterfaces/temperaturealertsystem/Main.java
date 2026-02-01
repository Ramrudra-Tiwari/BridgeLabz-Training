package com.functionalInterfaces.temperaturealertsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		double threeshold = 30.2;
		
		List<Temperature> list = new ArrayList<>();
		list.add(new Temperature(23.3));
		list.add(new Temperature(63.3));
		list.add(new Temperature(33.3));
		
		Predicate<Temperature> corss = temperature-> temperature.getValue()>threeshold;
		
		list.stream().filter(corss).forEach(x-> System.out.println("Temperature alert: "+ x.getValue()));
	}
}