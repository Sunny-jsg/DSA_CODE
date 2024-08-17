package com.ai.in;

import java.util.Scanner;

public class SortingArrayAsc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element::");
		int size = sc.nextInt();
		int i, j, temp, a[] = new int[size];
		System.out.println("Enter " + size + " Elements...");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements Before Sorting:");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");

		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
  			}
		}
		System.out.println();
		System.out.println("Array Elements After Sorting:");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");
	}

}
