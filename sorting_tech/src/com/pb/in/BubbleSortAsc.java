package com.pb.in;

import java.util.Arrays;

public class BubbleSortAsc {
	public static void main(String[] args) {
		int a[] = { 2, 4, 7, 5, 1, 8, 3, 6, 9 };
		System.out.println("Before Sorting =====>" + Arrays.toString(a));
		Demo.bubbleSortASC(a);
		System.out.println("After Sorting Asc===>" + Arrays.toString(a));

	}

}

class Demo {
	static void bubbleSortASC(int a[]) {
		int i, j, t;
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
}