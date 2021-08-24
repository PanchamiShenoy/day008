package com.yml.core_java;

import java.util.Scanner;

public class Harmonic {

	public void compute() {
		float sum =0;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value of n");
		  int n = sc.nextInt();
		  sc.close();
		  for(float i=1;i<=n;i++) {
			  sum+=(1/i);
		  }
		  System.out.println(n+"th harmonic value = "+sum);
		  
		}
}
