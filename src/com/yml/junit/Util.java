package com.yml.junit;

import java.util.*;

public final class Util {

	private Util() {

	}

	public static void DaysOfWeek(int month, int day, int year) {

		int y1 = year - (14 - month) / 12;
		int temp = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		int m1 = month + (12 * ((14 - month) / 12)) - 2;
		int result = (day + temp + ((31 * m1) / 12)) % 7;
		System.out.println("day of week is  " + result);
	}

	public static void temperatureConversion() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		double result;
		System.out.println("Enter \n1 -Convert Celsius to Fahrenheit\n 2-Convert Fahrenheit to Celsius");
		choice = scanner.nextInt();
		System.out.println("Enter Temperature");
		double temperature = scanner.nextDouble();
		scanner.close();

		switch (choice) {
		case 1:
			result = (temperature * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit = " + result);
			break;
		case 2:
			result = (temperature - 32) * 5 / 9;
			System.out.println("Temperature in Celsius = " + result);
			break;
		default:
			break;
		}
	}

	public static void monthyPayment(int principal, int rate, int year) {
		double n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
		System.out.println("Monthly Payment = " + payment);
	}

	public static void toBinary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();

		int temp = num;
		String remString;
		String bits = "";

		while (temp != 0) {
			int rem = temp % 2;
			remString = Integer.toString(rem);
			bits = remString + bits;
			temp = temp / 2;
		}
		System.out.println("Binary = " + bits);
	}

}
