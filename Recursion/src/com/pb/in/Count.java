package com.pb.in;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.nextLine();
		System.out.println(Rani.count(s, s.length() - 1));
	}

}

class Rani {
	static int count(String s, int index) {
		if (index < 3)
			return 0;
		if (s.substring(index - 3, index + 1).equals("very"))
			return 1 + count(s, index - 3);
		else
			return count(s, index - 1);

	}
}
/*output
Enter any String:
python is very very easy programming
2
*/