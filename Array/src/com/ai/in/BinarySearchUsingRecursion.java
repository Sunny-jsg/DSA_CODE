package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " Elements::");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the value to search:");
		int key = sc.nextInt();
		Arrays.sort(a);
		System.out.println(Test1.binarySearch(a, 0, a.length - 1, key));
	}

}

class Test1{
	static int binarySearch(int a[], int l, int h, int key) {
		if (l <= h) {
			int mid = (l + h) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				return binarySearch(a, mid + 1, h, key);
			else
				return binarySearch(a, l, mid - 1, key);
		}
		return -1;
	}
}
