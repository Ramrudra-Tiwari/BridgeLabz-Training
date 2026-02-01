package com.regexjunit.junitquestions.testingtemperatureconverter;

public class TemperatureConverter {
	
	public double celsiusToFahrenheit(double celsius) {
		System.out.println((celsius*1.8)+32);
		return (celsius*1.8)+32;
	}
	
	public double fahrenheitToCelsius(double fahrenheit) {
		System.out.println((fahrenheit-32)/(1.8));
		return (fahrenheit-32)/(1.8);
	}
}