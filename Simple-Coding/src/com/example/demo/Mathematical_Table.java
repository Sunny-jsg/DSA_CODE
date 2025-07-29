package com.example.demo;

import java.util.Scanner;

public class Mathematical_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		System.out.println("Multiplication Table of " + num + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
