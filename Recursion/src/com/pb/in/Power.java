package com.pb.in;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER a VALUE::");
		int a = sc.nextInt();
		System.out.println("ENTER b VALUE::");
		int b = sc.nextInt();
		System.out.println(John.power(a, b));
	}

}

class John {
	static int power(int a, int b) {
		if (b >= 1) {
			return a * power(a, b - 1);

		} else
			return 1;

			
	}

}
/* Output 
 * ENTER a VALUE::
2
ENTER b VALUE::
3
8
*/
