package com.example.array;

public class Search_Element {
	public static void main(String[] args) {
		int[] arr = { 11, 20, 34, 25, 46 };
		int key = 12;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
				break;

			}
		}
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found ");
		}
	}

}
