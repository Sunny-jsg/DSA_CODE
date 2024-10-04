package com.pb.in;

import java.util.*;

public class InsertionSortDesc {
	public class InsertionSortAsc {
		static void insertionDesc(int a[]) {
			int i, j, temp, n = a.length;
			for (i = 1; i < n; i++) {
				temp = a[i];
				j = i - 1;
				while (j >= 0 && a[j] < temp) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = temp;

			}
		}

		public static void main(String[] args) {
			Random r = new Random();
			int a[] = new int[10];
			for (int i = 0; i < a.length; i++)
				a[i] = r.nextInt(1000);

			System.out.println("Before Sorting::" + Arrays.toString(a));
			insertionDesc(a);
			System.out.println("After sorting::" + Arrays.toString(a));
		}
	}

}
