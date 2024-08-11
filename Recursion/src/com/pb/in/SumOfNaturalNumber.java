package com.pb.in;

import java.util.Scanner;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value:");
		int i = sc.nextInt();
		System.out.println(Natural.add(i));
	}
}

class Natural {
	static int add(int n) {
		if (n == 1)
			return 1;
		else
			return n + add(n - 1);
	}
}
/* Output
Enter n Value:
5
15
*/