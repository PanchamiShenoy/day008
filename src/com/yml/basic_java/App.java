package com.yml.basic_java;

import com.yml.core_java.*;
import com.yml.junit.*;

import java.util.Scanner;
import com.yml.functional.*;
import com.yml.logic_program.*;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();

		String bits = Util.toBinary(num);
		System.out.println("After Padding:" + bits);

	}
}