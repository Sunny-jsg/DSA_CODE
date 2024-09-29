package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateUsingFormula {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rotation::");
		int r = sc.nextInt();
		System.out.println("Before Rotation::" + Arrays.toString(a));
		int[] rf = Demo11.leftRotate(a, r);
		System.out.println("After Rotation::" + Arrays.toString(rf));
	}
}

class Demo11 {
	static int[] leftRotate(int a[], int r) {
		r = r % a.length;
		int i, n = a.length;
		int temp[] = new int[n];
		for (i = 0; i < n; i++) 
			//temp[i] = a[(i + r) % n];LeftRotate Formula
			temp[(i + r) % n]= a[i];//RightRotate formula
			for (i = 0; i < n; i++) 
				 a[i] =temp[i];
			
		
		return a;
	}
}