package com.example.array;

public class Min_Element {
	public static void main(String[] args) {
		int[] arr = { 32, 45, 2, 54, 19, 82, 23 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
