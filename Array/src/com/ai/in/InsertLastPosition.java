package com.ai.in;

import java.util.Arrays;

public class InsertLastPosition {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(Demo3.insertLastPosition(a, 60)));

	}

}

class Demo3 {
	static int[] insertLastPosition(int a[], int element) {
		int i, b[] = new int[a.length + 1];
		for (i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[i] = element;
		return b;
	}
}
/* insert element at last position of Array
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 60]
*/