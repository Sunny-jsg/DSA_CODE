package com.pb.in;

import java.util.Scanner;

public class PrintNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER n VALUE::");
		int n = sc.nextInt();
		Prakash.print(n);

	}

}

class Prakash {
	static void print(int n) {
		if (n >= 1) {
			System.out.print(n + " ");
			print(n - 1);

			//System.out.print(n + " ");

		}

	}
}
