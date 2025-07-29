package com.example.demo;

public class First_100_Prime_Number {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		System.out.println("First 100 Prime Numbers:");
		while (count < 100) {
			if (isPrime(number)) {
				System.out.println(number + " ");
				count++;
			}
			number++;
		}
		
	}

}
