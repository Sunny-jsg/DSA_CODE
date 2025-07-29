package com.example.demo;

import java.util.Scanner;

public class Eligibility_For_Marriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		System.out.println("Enter Salary :");
		double salary = sc.nextDouble();
		if(salary >=100000 && age <=30) {
			System.out.println("Eligible For Marriage");
		}else {
			System.out.println("Not Eligible for Marriage");
		}
	}

}
