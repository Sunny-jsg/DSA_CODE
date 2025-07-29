package com.example.array;

import java.util.Arrays;

public class Merge_Two_Array {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] result = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) result[i] = a[i];
		for (int i = 0; i < b.length; i++) result[a.length + i] = b[i];

		System.out.println(Arrays.toString(result));

	}

}
