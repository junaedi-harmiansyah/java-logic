package com.java.hackerrank;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class DateandTime {
	public static void main(String[] args) {
		DateandTime dateandTime = new DateandTime();
		System.out.println(dateandTime.findDay(8, 05, 2015));
		
	}

	public static String findDay(int month, int day, int year) {
		List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);

		int p = c.get(Calendar.DAY_OF_WEEK);
		String s = days.get(p - 1);
		return s;
	}
}
