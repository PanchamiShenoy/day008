package com.yml.basic_java;

import com.yml.core_java.*;
import com.yml.junit.*;

import java.util.Scanner;
import com.yml.functional.*;
import com.yml.logic_program.*;

public class App {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		Util.DaysOfWeek(month, day, year);
		

	}
}