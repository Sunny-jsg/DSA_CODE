package com.pb.in;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Airtel.count(s, s.length() - 1));
	}

}

class Airtel {
	static int count(String s, int index) {
		if (index < 0)
			return 0;
		if (s.charAt(index) == 'x')
			return 1 + count(s, index - 1);
		else
			return count(s, index - 1);

	}
}
/* output
Enter any String:
sxuxnxnxy
4
*/