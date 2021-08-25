package com.yml.logic_program;

import java.util.Scanner;

public class Reverse {

	public void compute() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int new_num=0;
		System.out.println("the number before swapping"+num);
		while(num!=0) {
			int rem = num%10;
			new_num = new_num*10+rem;
			num=num/10;
		}
		System.out.println("the number after swapping"+new_num);
	}
}
