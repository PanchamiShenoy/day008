package com.yml.core_java;

import java.util.Scanner;

public class QuotientRemainder {
	public void compute() {
		int quotient =0;
		int remainder=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter quotient and remainder");
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		
		quotient=dividend/divisor;
		remainder=dividend%divisor;
		
		System.out.println("quotient is "+quotient+"\n reminader is "+remainder);
		
	}
}
