package com.yml.core_java;

import java.util.Scanner;

public class LeapYear {
	public void check()
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the year");
		  int year = sc.nextInt();
		  sc.close();
		if(year>999 && year<10000){
	
			if((year % 400 == 0) ||(year % 100 != 0) && (year % 4 == 0))
				System.out.println(year+":is a leap year");
			else
				System.out.println(year+":is not a leap year");
		}
    }

}
