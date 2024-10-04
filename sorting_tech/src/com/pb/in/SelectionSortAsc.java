package com.pb.in;

import java.util.Arrays;

public class SelectionSortAsc {
	static void selectionSortASC(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;

			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 32, 56, 65, 89, 12, 43, 19, 10, 5, 9 };
		System.out.println("Before Sorting::" + Arrays.toString(a));
		selectionSortASC(a);
		System.out.println("After sorting::" + Arrays.toString(a));
	}

}
