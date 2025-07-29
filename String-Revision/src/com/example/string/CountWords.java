package com.example.string;

public class CountWords {
	public static void main(String[] args) {
		String sentence = " java is very famous language";
		String[] words = sentence.trim().split("\\s");
		System.out.println(words.length);
	}

}
