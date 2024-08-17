package com.ai.in;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Element...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("Max Value::" + max);
	}

}
/* Output
 * Enter Array Size::
5
Enter 5 Element...
84773
47374
24847
48374
837464
Max Value::837464
*/
