package com.pb.in;

import java.util.Scanner;

public class NewCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Krishna.replace(s, s.length() - 1));

	}

}

class Krishna {
	static String replace(String s, int index) {
		if (index < 0)
			return "";
		if (s.charAt(index) == 'x')
			return replace(s, index - 1) + "y";
		else
			return replace(s, index - 1) + s.charAt(index);
	}

}
/* Output
Enter any String:
sxuxnxnxy
syuynynyy
*/