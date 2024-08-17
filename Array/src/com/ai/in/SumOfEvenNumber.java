package com.ai.in;

import java.util.Scanner;

public class SumOfEvenNumber {
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
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of Even Number ::" + sum);
	}
}
/* OutPut
 * Enter Array Size:
3
Enter 3 Elements...
2
3
6
Sum of Even Number ::8
*/
