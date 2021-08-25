package com.yml.logic_program;

import java.util.Scanner;

public class Fibonacci {

	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=1,first=0,second=1,next=0;
		System.out.println("The fibonacci series for "+num+" is");
		
		while(i<=num) {
			System.out.print(first+" ");
			next = first + second;
			first = second;
			second = next;
			i++;
		}
	}
}
