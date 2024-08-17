package com.ai.in;

import java.util.Scanner;

public class CalculatePrimeNumber {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of An Array ::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter " + size + " Elements::");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of PrimeNumber =" + sum);
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // If divisible by any number other than 1 and itself, it's not prime
			}
		}
		return true; // Number is prime
	}
}
/* Output
 * Enter Size Of An Array ::
4
Enter 4 Elements::
1
2
3
4
The sum of the factorials of the elements in the array is:33
*/
