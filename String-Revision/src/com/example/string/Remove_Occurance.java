package com.example.string;

public class Remove_Occurance {
	public static void main(String[] args) {
		String str = "banana";
		char removeChar = 'a';
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != removeChar) {
				result = result + str.charAt(i);
			}

		}
		System.out.println("After removal: " + result);
	}

}
