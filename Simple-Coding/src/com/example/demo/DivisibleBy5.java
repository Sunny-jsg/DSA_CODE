package com.example.demo;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :-");
		int num = sc.nextInt();
		if(num % 5== 0) {
			System.out.println("this number is divisible by 5 ...");
		}else {
			System.out.println("Not divisible by 5 ...!");
		}
	}
}