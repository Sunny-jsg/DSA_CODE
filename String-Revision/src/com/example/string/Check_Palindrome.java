package com.example.string;

import java.util.Scanner;

public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		String reverse ="";
		for(int i = str.length()-1;i >=0;i--) {
			reverse = reverse + str.charAt(i);
			
		}
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
