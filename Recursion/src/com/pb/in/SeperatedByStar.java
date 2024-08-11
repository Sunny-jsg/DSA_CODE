package com.pb.in;

import java.util.Scanner;

public class SeperatedByStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		System.out.println(Game.newString(s, s.length() - 1));
	}

}

class Game {
	static String newString(String s, int index) {
		if (index < 1)
			return s.substring(0, index + 1);
		return newString(s, index - 1) + "*" + s.charAt(index);
	}
}
/* Output
Enter any String:
sunny
s*u*n*n*y
*/