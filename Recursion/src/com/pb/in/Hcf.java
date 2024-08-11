package com.pb.in;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int a = sc.nextInt();
		System.out.println("Enter b Value:");
		int b = sc.nextInt();
		int i = Mohan.hcf(a, b);
		System.out.println(i);
	}
}

class Mohan {
	static int hcf(int a, int b) {
		while (a != b) {
			if (a > b)
				return hcf(a - b, b);
			else
				return hcf(a, b - a);
		}
		return a;
	}
}
/* Output
 * Enter a Value:
12
Enter b Value:
2
Result:
2
*/

