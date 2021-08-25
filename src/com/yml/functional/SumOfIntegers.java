package com.yml.functional;

import java.util.Scanner;

public class SumOfIntegers {

	public void compute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt(); 
		int[] arr = new int[n]; 
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
	int count = 0;
	for(int i=0; i<n-2;i++) {
		for(int j=i+1;j<n-1;j++) {
			for(int k=j+1;k<n;k++) {
				if(arr[i]+arr[j]+arr[k]==0) {
					count++;
					System.out.println("Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
				}	
			}
		}
	}
	if(count == 0) {
		System.out.println("no triplets present");
	}
	
	}
}