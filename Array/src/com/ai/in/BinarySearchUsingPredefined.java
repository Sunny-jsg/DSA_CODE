package com.ai.in;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingPredefined {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " Elements::");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		System.out.println("After sorting....");
		String s1 = Arrays.toString(a);
		System.out.println(s1);
		System.out.println("Enter the value to search:");
		int key = sc.nextInt();
		System.out.println(Arrays.binarySearch(a, key));
		
	}

}
/*Output
Enter Array Size::
5
Enter 5 Elements::
999 222 111 444 777
After sorting....
[111, 222, 444, 777, 999]
Enter the value to search:
444
2
*/
