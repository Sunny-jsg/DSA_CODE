package com.pb.in;

import java.util.Scanner;

public class CountDuplicateChar {
	 static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String s = sc.next();
		char[] ch = s.toCharArray();
		for (int i = 0; i <= ch.length-1; i++) {
			for (int j = i+1; j <= ch.length-1; j++) {
				if (ch[i] == ch[j]) {
					count ++;
					
				}

			}
		}
		System.out.println(count);
		
	}

}
/* Output
Enter any String:
sunny
1
*/