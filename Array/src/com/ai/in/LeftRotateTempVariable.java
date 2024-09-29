package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateTempVariable {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rotation::");
		int r = sc.nextInt();
         System.out.println("Before Rotation::"+Arrays.toString(a));
		int[] rf = Test11.rotateLeftVariable(a, r);
		System.out.println("After Rotation::" + Arrays.toString(rf));
	}

}

class Test11 {
	static int[] rotateLeftVariable(int a[], int r) {
		r = r % a.length;
		int temp, i, j;
		for (i = 0; i < r; i++) {
			temp = a[0];
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];

			}
			a[a.length - 1] = temp;

		}
		return a;
	}
}