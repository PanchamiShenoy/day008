package com.yml.functional;

public class WindChill {

	public void compute(int t,int v) {
		double w=((35.74)+(0.6215)*t)+((0.4275)*t-(35.75))*(Math.pow(v,0.16)); 
		System.out.println(w);
	}
}
