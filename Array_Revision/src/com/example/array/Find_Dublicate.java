package com.example.array;

public class Find_Dublicate {
	public static void main(String[] args) {
		int [] arr = {1,4,3,8,3,2,5,1,4};
		
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j <arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Dublicate : "+ arr[i]);
				}
			}
		}
	}

}
