package com.pb.in;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value::");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.print(Sonu.fib(i) + ",");
		}
	}

}

class Sonu {
	static int fib(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}
}
/* Output
Enter n Value::
4
0,1,1,2,3,
*/