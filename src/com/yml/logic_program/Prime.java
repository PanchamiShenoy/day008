package com.yml.logic_program;

import java.util.Scanner;

public class Prime {

	public void check() {
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the numer");
		int num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
		
	}
}
