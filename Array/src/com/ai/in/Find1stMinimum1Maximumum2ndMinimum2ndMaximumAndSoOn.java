package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class Find1stMinimum1Maximumum2ndMinimum2ndMaximumAndSoOn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " Elements...");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int low =0;
		int high =n-1;
		while(low <= high) {
			System.out.println(a[low]+" "+ a[high]+" ");
			low++;
			high--;
			
		}

	}

}
/* Output
 * Enter Array Size::
5
Enter 5 Elements...
3 4 1 5 2
1 5 
2 4 
3 3 

*/
 