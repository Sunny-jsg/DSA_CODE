package com.pb.in;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER n VALUE::");
		int n = sc.nextInt();
		System.out.println(Smith.fact(n));
	}

}

class Smith {
	static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}
}
/* Output
ENTER n VALUE::
5
120
*/