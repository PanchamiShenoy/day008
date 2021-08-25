package com.yml.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
	
	Scanner sc=new Scanner(System.in); 
	 int[][] array=new int[10][10];
	int row,col;
	
	public void read()	
	{
		System.out.println("Enter the row and col size");
		row=sc.nextInt();
		col=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				array[i][j]=sc.nextInt();
	}
	
	public void write()
	{
		System.out.println("elements are written into output.txt");
		try {
      			PrintWriter output = new PrintWriter("output.txt");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
					output.print(array[i][j]+" ");
				output.print("\n");
			}

      			output.close();
    		}
    		catch(Exception e) {
      			e.getStackTrace();
			}

	}
}
