package com.ai.in;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
		int a[] = { 10, 12, 34, 65, 49, 11 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(Demo5.deleteElementAtLocation(a, 0)));
		System.out.println(Arrays.toString(Demo5.deleteElementAtLocation(a, 1)));
		System.out.println(Arrays.toString(Demo5.deleteElementAtLocation(a, 2)));
		System.out.println(Arrays.toString(Demo5.deleteElementAtLocation(a, 3)));
		System.out.println(Arrays.toString(Demo5.deleteElementAtLocation(a, 4)));
		System.out.println(Arrays.toString(Demo5.deleteAll(a)));
	}
}

class Demo5 {
	static int[] deleteElementAtLocation(int a[], int location) {
		int k = 0, b[] = new int[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (i == location)
				continue;
			b[k++] = a[i];

		}
		return b;

	}
//   Delete all  the Array 
	static int[] deleteAll(int a[]) {
		int b[] = new int[0];
		return b;
	}
}
/*
 * Output 
[10, 12, 34, 65, 49, 11]
[12, 34, 65, 49, 11]
[10, 34, 65, 49, 11]
[10, 12, 65, 49, 11]
[10, 12, 34, 49, 11]
[10, 12, 34, 65, 11]
[]
 */