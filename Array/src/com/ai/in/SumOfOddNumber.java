package com.ai.in;

import java.util.Scanner;

public class SumOfOddNumber {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of An Array ::");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter" + size + "Elements::");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];

			}
		}
		System.out.println("Sum of Odd Number = " + sum);
	}

}
/* Output
 * Enter Size Of An Array ::
3
Enter3Elements::
3
2
5
Sum of Odd Number = 8
*/
