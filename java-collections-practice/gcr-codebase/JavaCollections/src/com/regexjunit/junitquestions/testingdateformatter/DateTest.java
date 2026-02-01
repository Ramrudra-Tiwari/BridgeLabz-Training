package com.regexjunit.junitquestions.testingdateformatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DateTest {
	DateFormatter date = new DateFormatter();
	
	@Test
	void Date() {
		assertEquals("09/12/2024",date.formatDate("2024/12/09"));
	}
}