package com.ai.in;

import java.util.Scanner;

public class MinValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Elements...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min value :: " + min);
	}

}
/* Output
 * Enter Array Size::
4
Enter 4 Elements...
15
20
5
84
Min value :: 5
*/
