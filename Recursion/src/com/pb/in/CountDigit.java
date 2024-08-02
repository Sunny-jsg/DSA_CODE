package com.pb.in;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n = sc.nextInt();
		System.out.println(Rathi.count(n));

	}

}

class Rathi {
	static int c = 0;

	static int count(int n) {
		if (n != 0) {
			c++;
			count(n / 10);

		}
		return (c != 0) ? c : 1;
	}

}