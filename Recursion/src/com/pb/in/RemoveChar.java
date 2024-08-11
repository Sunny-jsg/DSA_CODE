package com.pb.in;

import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Play.removechar(s, s.length() - 1));
	}

}

class Play {
	static String removechar(String s, int index) {
		if (index < 0)
			return " ";
		else if (s.charAt(index) == 'x')
			return removechar(s, index - 1);
		else
			return removechar(s, index - 1) + s.charAt(index);
	}
}
/* Output
Enter any String:
sxuxnxnxy
 sunny
*/