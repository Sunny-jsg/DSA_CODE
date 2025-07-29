package com.example.demo;

import java.util.Scanner;

public class Factorial {
	public static long factorial(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	}

}
