package com.ai.in;

import java.util.Scanner;

public class FindMaxOrMinValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ::");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " Element::");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorting Element::");
		for (int i = 0; i < size; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Minimum value:: " + a[1 - 1]);
		System.out.println("Maximum Value:: " + a[size - 1]);
		System.out.println("2nd Minimum value :: " + a[2 - 1]);
		System.out.println("2nd Maximum Value:: " + a[size - 2]);
		System.out.println("3rd Minimum value:: " + a[3 - 1]);
		System.out.println("3rd Maximum Value :: " + a[size - 3]);

	}

}
/* Output
 * Enter Array Size ::
5
Enter 5 Element::
2 5 1 4 3
Sorting Element::
1 2 3 4 5 
Minimum value:: 1
Maximum Value:: 5
2nd Minimum value :: 2
2nd Maximum Value:: 4
3rd Minimum value:: 3
3rd Maximum Value :: 3
*/
