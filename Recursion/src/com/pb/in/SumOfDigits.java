package com.pb.in;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value::");
		int n = sc.nextInt();
		System.out.println(Virat.sumofdigits(n));
	}
}

class Virat {
	static int sumofdigits(int n) {
		if (n == 0)
			return 0;
		else
			return (n % 10) + sumofdigits(n / 10);
	}
}