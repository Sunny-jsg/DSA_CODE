package in.bit;

import java.util.Iterator;
import java.util.Scanner;

public class CheckEvenOrOdd {
	public static String evenorodd(int n) {
		int bitMask = 1;
		if ((n & bitMask) == 0)
			return "Even Number";
		else
			return "Odd Number";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ...");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println(i + "\t" + evenorodd(i));
		}
	}

}
