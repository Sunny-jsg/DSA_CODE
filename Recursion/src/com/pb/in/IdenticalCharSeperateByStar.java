package com.pb.in;

import java.util.Scanner;

public class IdenticalCharSeperateByStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Cricket.newString(s, s.length() - 1));
	}

}

class Cricket {
	static String newString(String s, int index) {
		if (index < 1)
			return s.substring(0, index + 1);
		if (s.charAt(index - 1) == s.charAt(index))
			return newString(s, index - 1) + "*" + s.charAt(index);
		else
			return newString(s, index - 1) + s.charAt(index);
	}
}
/* Output
Enter any String:
sunny
sun*ny
*/