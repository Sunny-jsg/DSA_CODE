package com.pb.in;

import java.util.Scanner;

public class NestingPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Pair.newString(s, 0, s.length() - 1));
	}

}

class Pair {
	static boolean newString(String s, int i, int j) {
		if (i > j)
			return true;
		if (s.charAt(i) == '(' && s.charAt(j) == ')')
			return newString(s, i + 1, j - 1);
		else
			return false;
	}
}
/* Output
Enter any String:
(())
true

Enter any String:
(;)
false
*/