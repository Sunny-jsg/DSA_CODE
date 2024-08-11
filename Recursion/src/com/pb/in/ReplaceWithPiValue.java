package com.pb.in;

import java.util.Scanner;

public class ReplaceWithPiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String :");
		String s = sc.nextLine();
		System.out.println(Raju.replace(s, s.length() - 1));
	}

}

class Raju {
	static String replace(String s, int index) {
		if (index < 1)
			return s.substring(0, index + 1);
		if (s.substring(index - 1, index + 1).equals("pi"))
			return replace(s, index - 2) + "3.147";
		else
			return replace(s, index - 1) + s.charAt(index);

	}
}
/* Output
Enter any String :
value of pi
value of 3.147
*/