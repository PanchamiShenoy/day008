package com.yml.core_java;

import java.util.Scanner;

public class EvenOdd {
	public void compute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		sc.close();
		if(n % 2 == 0)
		{
			System.out.println("the entered number is even");
		}
		else
		{
			System.out.println("the entered number is odd");
		}
	}

}
