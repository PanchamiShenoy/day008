package com.yml.functional;

public class Distance {

	public void compute(int x,int y) {
		double d=Math.sqrt(Math.pow(x,x)+Math.pow(y,y)); 
		System.out.println("Distance is : "+d);
	}
}
