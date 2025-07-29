package com.example.demo;

import java.util.Scanner;

public class Character_Is_Alphabet_Or_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println(ch + " is an Alphabet.");

		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a Digit.");
		}

		else {
			System.out.println(ch + " is neither an Alphabet nor a Digit.");
		}

	}

}
