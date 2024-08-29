package com.ai.in;

import java.util.Arrays;

public class UpdatingTheArray {
	public static void main(String[] args) {
		int a[] = { 10, 11, 12, 13, 14, 15 };
		System.out.println(Arrays.toString(a));
		/*
		 * System.out.println(Arrays.toString(Demo6.updateArrayElement(a, 0, 999)));
		 * System.out.println(Arrays.toString(Demo6.updateArrayElement(a, 1, 999)));
		 * System.out.println(Arrays.toString(Demo6.updateArrayElement(a, 2, 999)));
		 * System.out.println(Arrays.toString(Demo6.updateArrayElement(a, 3, 999)));
		 * System.out.println(Arrays.toString(Demo6.updateArrayElement(a, 4, 999)));
		 */
		System.out.println(Arrays.toString(Demo6.updateElement(a, 10, 100)));
		System.out.println(Arrays.toString(Demo6.updateElement(a, 11, 110)));
		System.out.println(Arrays.toString(Demo6.updateElement(a, 12, 120)));
		System.out.println(Arrays.toString(Demo6.updateElement(a, 13, 130)));
		System.out.println(Arrays.toString(Demo6.updateElement(a, 14, 140)));
		System.out.println(Arrays.toString(Demo6.updateElement(a, 15, 150)));
	}

}

class Demo6 {
	static int[] updateArrayElement(int a[], int location, int element) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		if (location >= 0 && location < a.length)
			b[location] = element;
		return b;

	}

	static int[] updateElement(int a[], int oldElement, int newElement) {
		int i, b[] = new int[a.length];
		for (i = 0; i < a.length; i++)
			b[i] = a[i];
		for (i = 0; i < a.length; i++) {
			if (b[i] == oldElement) {
				b[i] = newElement;
				break;
			}

		}
		return b;
	}

}

/*
 * Output 
 * 
 * [10, 11, 12, 13, 14, 15] 
 * [999, 11, 12, 13, 14, 15] 
 * [10, 999, 12, 13, 14, 15]
 * [10, 11, 999, 13, 14, 15]
 * [10, 11, 12, 999, 14, 15] 
 * [10, 11, 12, 13,999, 15]
 * 2nd Output
 [10, 11, 12, 13, 14, 15]
[100, 11, 12, 13, 14, 15]
[10, 110, 12, 13, 14, 15]
[10, 11, 120, 13, 14, 15]
[10, 11, 12, 130, 14, 15]
[10, 11, 12, 13, 140, 15]
[10, 11, 12, 13, 14, 150]

 */
