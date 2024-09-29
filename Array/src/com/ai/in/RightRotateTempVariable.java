package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateTempVariable {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rotation::");
		int r = sc.nextInt();
		System.out.println("Before Rotation::" + Arrays.toString(a));
		int[] rf = Test12.rightRotate(a, r);
		System.out.println("After Rotation::" + Arrays.toString(rf));
	}

}

class Test12 {
	static int[] rightRotate(int a[], int r) {
		r = r % a.length;
		for (int i = 0; i < r; i++) {
			int temp = a[a.length -1];
			for (int j = a.length -1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}

		return a;
	}

}
