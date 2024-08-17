package com.ai.in;

import java.util.Scanner;

public class SumOfFactorial {
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
			sum = sum + factorial(a[i]);
		}
		System.out.println("The sum of the factorials of the elements in the array is:" + sum);
	}

	// Method to calculate factorial of a number
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
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
