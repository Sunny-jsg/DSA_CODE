package com.ai.in;

import java.util.Scanner;

public class SumNumberDivisibleBy2Or3 {
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
			if (a[i] % 2 == 0 || a[i] % 3 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.println("The sum of elements divisible by 2 or 3 is: " + sum);
	}

}
/* output
 * Enter Size Of An Array ::
10
Enter 10 Elements::
1
2
3
4
5
6
7
8
9
10
The sum of elements divisible by 2 or 3 is: 42
*/
