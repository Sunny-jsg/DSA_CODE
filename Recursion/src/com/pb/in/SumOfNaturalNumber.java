package com.pb.in;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
		int i = Natural.add(5);
		System.out.println(i);
	}
}

class Natural {
	static int add(int n) {
		if (n == 1)
			return 1;
		else
			return n + add(n - 1);
	}
}
