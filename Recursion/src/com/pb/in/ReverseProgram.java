package com.pb.in;

import java.util.Scanner;

public class ReverseProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value::");
		String s = sc.nextLine();
		System.out.println(Victor.rev(Integer.parseInt(s), s.length()));
	}

}

class Victor {
	static int rev(int n, int length) {
		if (n == 0)
			return 0;
		else
			return ((n % 10) * (int) Math.pow(10, length - 1)) + rev(n / 10, --length);
	}
}
/* Output
Enter n Value::
10023736
63732001
*/