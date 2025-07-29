package com.example.demo;

import java.util.Scanner;

public class Calculate_Provident_Fund {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Person Basic Salary :");
		double salary = sc.nextDouble();
		
		double providentFund = salary*12/100;
		System.out.println(providentFund);
	}

}
