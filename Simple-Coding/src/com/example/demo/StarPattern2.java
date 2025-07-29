package com.example.demo;

public class StarPattern2 {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 0; i < rows; i++) {
		    int num = 1;
		    
		    // Print leading spaces
		    for (int j = 0; j < rows - i; j++) {
		        System.out.print(" ");
		    }
		    
		    // Print numbers in the row
		    for (int k = 0; k <= i; k++) {
		        System.out.print(num + " ");
		        num = num * (i - k) / (k + 1); // Update num using Pascal’s logic
		    }
		    
		    System.out.println(); // Move to next line
		}
	}

}
