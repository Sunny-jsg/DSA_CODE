package com.ai.in;

import java.util.Arrays;

public class InsertAtLocation {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(Demo4.insertAtLocation(a, 4, 3)));
	}

}

class Demo4 {
	static int[] insertAtLocation(int a[], int element, int location) {
		int i, k = 0, b[] = new int[a.length + 1];
		for (i = 0; i < location; i++)
			b[k++] = a[i];
		b[k++] = element;
		for (i = location; i < a.length; i++)
			b[k++] = a[i];
		return b;
	}
}
/* insert at given location
[10, 20, 30, 40, 50]
[10, 20, 30, 4, 40, 50]
*/