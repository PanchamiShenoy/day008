package com.yml.core_java;

import java.util.Scanner;

public class Factor {
	public void compute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		sc.close();
		System.out.println("Prime factors of "+n+" are");
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
}}
