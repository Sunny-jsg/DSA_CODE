package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class SortingPredefinedMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int i, size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Elements...");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements Before Sorting:");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");
		//Arrays.sort(a);
		//Arrays.sort(a,0,size/2);
		Arrays.sort(a,size/2,size);
		System.out.println();
		System.out.println("Array Elements After Sorting:");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");
	}

}
