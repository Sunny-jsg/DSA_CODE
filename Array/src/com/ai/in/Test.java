package com.ai.in;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Elements...");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array Element using While Loop...");
		int index = 0;
		while (index < a.length) {
			System.out.println("index=" + index + " a[" + index + "]= " + a[index]);
			index++;
		}
		System.out.println("Array Element Using For Loop....");
		for (int i = 0; i < a.length; i++) {
			System.out.println("index=" + i + " a[" + i + "]= " + a[i]);
		}
		System.out.println("Array Element using For-Each Loop....");
		for (int x : a) {
			System.out.println("Array =" + x);
		}
	}

}
