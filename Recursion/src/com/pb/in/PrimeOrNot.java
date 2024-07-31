package com.pb.in;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n = sc.nextInt();
		System.out.println(Rohit.isprime(n, n / 2));
	}
}

class Rohit {
	static boolean isprime(int n, int i) {
		if (i == 1)
			return true;
		else if (n % i == 0)
			return false;
		else
			return isprime(n, --i);
	}
}
