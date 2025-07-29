package com.example.demo;

import java.util.Scanner;

public class Test {
	public static int sumOfDigit(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Digit :");
		int a = sc.nextInt();
		System.out.println("Enter Second Digit :");
		int b = sc.nextInt();
		System.out.println("Sum Of Digit = " +sumOfDigit(a, b));

		// for(int i =100 ;i >=1;i--) {
		// System.out.println(i);}
	}

}
