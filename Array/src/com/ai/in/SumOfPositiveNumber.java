package com.ai.in;

import java.util.Scanner;

public class SumOfPositiveNumber {
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
			if (a[i] > 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of positive numbers: " + sum);
	}

}
/* Output
Enter Size Of An Array ::
5
Enter 5 Elements::
-2
-4
2
-6
10
Sum of positive numbers: 12
*/