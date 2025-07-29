package com.example.array;

import java.util.Scanner;

public class Second_Max {
	public static void main(String[] args) {
		int temp,arr[] = {23,4,65,12,34,97,19,33};
		for(int i =0;i<=arr.length -1;i++) {
			for(int j=i+1;j <=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(" "+ arr[i]);
			
		}
		System.out.println("2nd Max : "+ arr[arr.length -2]);
		
		
	}
	

}
