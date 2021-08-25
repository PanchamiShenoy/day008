package com.yml.functional;

import java.util.Scanner;

public class Quadratic {
	
	public void compute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a b c :");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double delta = (b*b)-(4*a*c);
		double root1 = (-b+Math.sqrt(delta))/(2*a); //formula for calculating roots of a quadratic equations
		double root2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root1 of x =  "+root1);
		System.out.println("Root2 of x = "+root2);
	}

}
