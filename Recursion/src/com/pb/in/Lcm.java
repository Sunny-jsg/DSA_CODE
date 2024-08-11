package com.pb.in;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 Value:");
		int n1 = sc.nextInt();
		System.out.println("Enter n2 Value:");
		int n2 = sc.nextInt();
		System.out.println(Radha.lcm(n1, n2));
	}

}

class Radha {
	static int com = 1;

	static int lcm(int n1, int n2) {
		if (com % n1 == 0 && com % n2 == 0)
			return com;
		com++;
		lcm(n1, n2);
		return com;
	}
}
/* Output
 * Enter n1 Value:
12
Enter n2 Value:
3
12
*/
