package com.yml.basic_java;

import com.yml.core_java.*;
import com.yml.functional.*;

public class App {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		WindChill wc=new WindChill();
		wc.compute(a, b);
	}
}