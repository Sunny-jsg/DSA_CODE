package com.example.array;

public class Calculate_Sum_Of_Array {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 87, 42, 98 };
		int sum =0;
		for(int i =0; i<=arr.length-1;i++) {
			sum =sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
