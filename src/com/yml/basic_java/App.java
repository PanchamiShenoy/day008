package com.yml.basic_java;

import com.yml.core_java.*;
import com.yml.functional.*;

public class App {

	public static void main(String[] args) {
	
		Distance f =new Distance();
		int x=Integer.parseInt(args[0]); 
		int y=Integer.parseInt(args[1]);
		f.check(x,y);
	}
}