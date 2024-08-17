package com.ai.in;

import java.util.Scanner;

public class SumOfAnArray {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Elements...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of An Array = " + sum);

	}
}
/* OutPut
 * Enter Array Size:
5
Enter 5 Elements...
12
32
43
15
65
Sum of An Array = 167
*/
