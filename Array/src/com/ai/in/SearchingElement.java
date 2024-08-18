package com.ai.in;

import java.util.Scanner;

public class SearchingElement {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter array size:");
		int t, i, n = obj.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements...");
		for (i = 0; i < n; i++)
			a[i] = obj.nextInt();
		System.out.println("Enter the element to search:");
		int key = obj.nextInt();
		int index = -1;
		for (i = 0; i < n; i++) {
			if (key == a[i]) {
				index = i;
				break;
			}
		}
		System.out.println("position of number "+ index);
	}
}
/* Output 
 * Enter array size:
6
Enter 6 elements...
65 45 78 93 12 81
Enter the element to search:
93
position of number 3
*/
