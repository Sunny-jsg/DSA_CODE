package com.pb.in;

import java.util.Arrays;

public class BubbleSortDesc {
	public static void main(String[] args) {
		int a[] = { 4, 3, 6, 7, 5, 9, 1, 2, 8 };
		System.out.println("Before Sorting =======>" + Arrays.toString(a));
		Demo1.bubbleSortDESC(a);
		System.out.println("After Sorting DESC ===>" + Arrays.toString(a));
	}

}

class Demo1 {
	static void bubbleSortDESC(int a[]) {
		int i, j, t;
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
}
