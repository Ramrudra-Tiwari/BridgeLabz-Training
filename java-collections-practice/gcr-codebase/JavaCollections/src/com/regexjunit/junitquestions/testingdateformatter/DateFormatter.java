package com.regexjunit.junitquestions.testingdateformatter;

public class DateFormatter {
	public String formatDate(String inputDate) {
		String regex = "\\d{4}/\\d{2}/\\d{2}";
		if(inputDate.matches(regex)) {
			String data[] = inputDate.split("/");
			String year = data[0];
			String month = data[1];
			String date = data[2];
			return date+"/"+month+"/"+year;//here return date/month/year
		}
		return null;
	}
}