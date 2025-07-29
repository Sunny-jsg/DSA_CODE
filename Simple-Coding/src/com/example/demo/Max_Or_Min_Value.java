package com.example.demo;

public class Max_Or_Min_Value {
	public static void main(String[] args) {
		int[] arr = { 12, 4, 32, 65, 13, 96 };
		int Max = arr[0];
		
		for(int i=1;i < arr.length;i++) {
			if(arr[i]>Max) {
				Max =arr[i];
			}
			
		}
		System.out.println(Max);
		
	}
	

}
