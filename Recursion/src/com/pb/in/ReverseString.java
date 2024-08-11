package com.pb.in;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String str = sc.next();
		String s = Ram.strrev(str);
		System.out.println(s);

	}

}

class Ram {
	static String strrev(String str) {
		if (str == null || str.length() <= 1)
			return str;
		return strrev(str.substring(1)) + str.charAt(0);
	}
}
/* Output
Enter any String:
sunny
ynnus
*/