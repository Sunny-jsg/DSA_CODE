package com.pb.in;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Disk:");
		int n = sc.nextInt();
		Soham.towerOfHanoi(n, "S", "H", "D");

	}
}

class Soham {
	static void towerOfHanoi(int n, String src, String Helper, String Dest) {
		if (n == 1) {
			System.out.println("Move The Disk " + n + " from " + src + " to " + Dest);
			return;
		}
		towerOfHanoi(n - 1, src, Dest, Helper);
		System.out.println("Move The Disk " + n + " from " + src + " to " + Dest);
		towerOfHanoi(n - 1, Helper, src, Dest);
	}
}
/* Output
Enter Number Of Disk:
3
Move The Disk 1 from S to D
Move The Disk 2 from S to H
Move The Disk 1 from D to H
Move The Disk 3 from S to D
Move The Disk 1 from H to S
Move The Disk 2 from H to D
Move The Disk 1 from S to D
*/