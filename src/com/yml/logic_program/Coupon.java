package com.yml.logic_program;

import java.util.*;

public class Coupon {
	public static Random r = new Random();  
	public static int n;
	public static ArrayList<Integer> alist=new ArrayList<>(); 
	
	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		System.out.println("Enter the " + n + " distinct coupon numbers");
		
		for (int i = 0; i < n; i++)
			alist.add(sc.nextInt()); 
		
		int count = 0; 
				
		int no_of_random= 0;
		
		while (count < n) 
		{
			while (true) {
				int x = r.nextInt(10);
				no_of_random++;
				boolean result =check(x);
				if (result)
					break;
			}
			count++;

		}
		System.out.println("Number of random numbers is " + no_of_random);
		sc.close();
	}
	
	public boolean check(int x)
    {
    	int index = alist.indexOf(x);
    	if(index != -1)
    	{
    		alist.remove(index);
    		return true;
    	}
    	else 
    		return false;
    }

}
