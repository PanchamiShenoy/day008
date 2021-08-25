package com.yml.core_java;

public class Power {
	public void compute(int arg) {
		int n=arg; //received arg from command line from main method 
		if(n>0 && n<31)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println("2^"+i+"="+Math.pow(2,i));
			}
		}
		else
		{
			System.out.println("Enter number between 0 and 31");
		}
	}
}
