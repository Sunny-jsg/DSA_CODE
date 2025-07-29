package com.example.array;

public class Count_Even_Odd {
	public static void main(String[] args) {
		int[] arr = { 11, 20, 34, 25, 46 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Number : " + arr[i]);
				even++;
			} else {
				System.out.println("Odd Number : " + arr[i]);
				odd++;
			}
		}
		System.out.println("Even Count : " + even + " Odd Count : " + odd);
	}

}
