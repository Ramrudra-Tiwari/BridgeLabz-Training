package com.regexjunit.junitquestions.testingtemperatureconverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureTest {
	TemperatureConverter temp  =  new TemperatureConverter();
	
	@Test
	void cTof() {
		assertEquals((32*1.8)+32,temp.celsiusToFahrenheit(32));
	}
	
	@Test
	void fToc() {
		assertEquals((98.8-32)/(1.8),temp.fahrenheitToCelsius(98.8));
	}
}