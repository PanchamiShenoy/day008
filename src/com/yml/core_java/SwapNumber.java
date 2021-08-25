package com.yml.core_java;

import java.util.Scanner;

public class SwapNumber {
	public void compute() {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("two numbers before swapping is "+num1+" and "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("two numbers before swapping is "+num1+" and "+num2);
		
	}
}
