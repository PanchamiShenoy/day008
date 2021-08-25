package com.yml.core_java;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public void flip()
	{
		Double head=0.00,tail=0.00;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to flip a coin");
		int num=sc.nextInt();
		sc.close();
		Random rand = new Random();
		for(int i=0;i<num;i++) {
			float result = rand.nextFloat(); 
			if(result <0.5) {
				tail++;
			}else {
				head++;
			}
		}
		System.out.println("Percentage of resulting in Heads is: "+(head/num)*100+"%"); //calculates percentage of heads and prints
		System.out.println("Percentage of resulting in Tails is: "+(tail/num)*100+"%");
	}
}
