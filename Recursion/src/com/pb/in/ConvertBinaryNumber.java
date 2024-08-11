package com.pb.in;

import java.util.Scanner;

public class ConvertBinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value::");
		int n = sc.nextInt();
		System.out.println(Rahul.convert(n));
	}

}

class Rahul {
	static int convert(int n) {
		if (n == 0)
			return 0;
		else
			return (n % 2 + 10 * convert(n / 2));
	}
}
/* output
 * Enter n Value::
15
1111
*/
