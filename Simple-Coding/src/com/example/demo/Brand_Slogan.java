package com.example.demo;

import java.util.Scanner;

public class Brand_Slogan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shoe brand name:");
		String brandName = sc.next().trim().toLowerCase();
		switch (brandName) {
		case "nike":
			System.out.println("Nike Slogan: Just do it");
			break;
		case "adidas":
			System.out.println("Adidas Slogan: Impossible is nothing");
			break;
		case "puma":
			System.out.println("Puma Slogan : Forever Faster");
			break;
		case "reebok":
			System.out.println("Reebok Slogan : I Am What I Am");
			break;

		default:
			break;
		}
	}

}
