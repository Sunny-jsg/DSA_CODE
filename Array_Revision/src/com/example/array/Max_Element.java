package com.example.array;

public class Max_Element {
	public static void main(String[] args) {
		int[] arr = { 32, 97, 103, 457, 123 };
		int max = arr[0];
		for (int i = 1; i <arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println(max);
	}

}
