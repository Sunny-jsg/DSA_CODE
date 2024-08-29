package com.ai.in;

import java.util.Arrays;

public class TwoArrayComparision {

	public static void main(String[] args) {

		int a[] = { 12, 32, 45, 65, 95 };
		int b[] = { 32, 45, 65, 12, 95 };
		System.out.println(Demo2.equal(a, b));
		System.out.println(Arrays.equals(a, b));//using predefined method
          Arrays.sort(a);
          Arrays.sort(b);
          System.out.println(Demo2.equal(a, b));
      	System.out.println(Arrays.equals(a, b));//using predefined method
	}

}

class Demo2 {
	static boolean equal(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}
/* Output
false
false
true
true
*/