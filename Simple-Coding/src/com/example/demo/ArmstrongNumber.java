package com.example.demo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt(); // Read the number from the user
		int originalNumber = number; // Store the original number to compare later

		int result = 0;
		int n = String.valueOf(number).length(); // Count how many digits in the number

		while (number != 0) {
			int digit = number % 10; // Get the last digit
			result += Math.pow(digit, n); // Raise digit to power n and add to result
			number /= 10; // Remove the last digit
		}
		if (result == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is NOT an Armstrong number.");
		}
	}

}
