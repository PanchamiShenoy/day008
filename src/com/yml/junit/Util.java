package com.yml.junit;

public final class Util {

	private Util() {
		
	}
	
	public static void DaysOfWeek(int month,int day,int year) {
		
		int y1 = year - (14 - month) / 12;
		int temp = y1 + (y1 / 4) - (y1/100) + (y1/400);
		int m1 = month + (12 * ((14-month) / 12)) -2;
		int result = (day + temp + ((31 * m1)/12)) % 7;
		System.out.println("day of week is  "+result);
	}
}
