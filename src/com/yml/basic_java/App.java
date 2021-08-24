package com.yml.basic_java;

import com.yml.core_java.*;


public class App {

	public static void main(String[] args) {
		int arg= Integer.parseInt(args[0]);
		Power f =new Power();
		f.compute(arg);
	}
}