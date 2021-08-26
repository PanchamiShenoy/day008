package com.yml.junit;

import java.util.Scanner;

public class VendingMachine {

	public void compute() {
		
		System.out.println("enter the amount");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int note_count = 0;

		for (int i = 8; i >= 0; i--) {
			if (arr[i] <= n) {
				note_count += n / arr[i];
				n %= arr[i];
			}
		}
		System.out.println(note_count);
	}

}
