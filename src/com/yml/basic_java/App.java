package com.yml.basic_java;

import com.yml.core_java.*;

import java.util.Scanner;
import com.yml.functional.*;
import com.yml.logic_program.*;

public class App {

	public static void main(String[] args) {
		StopWatch s = new StopWatch(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start the timer");
		int choice = sc.nextInt();
		if (choice == 1)
			s.start();
		System.out.println("Press 2 to stop the timer");
		int choice2 = sc.nextInt();
		if (choice2 == 2) {
			s.stop();
			System.out.println("the elapsed time between start and end is " + s.getElapsedTime() + " milliseconds");
		}
	}
}