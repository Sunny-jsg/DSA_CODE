package com.ai.in;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix-1 Row Size");
		int rsize1 = sc.nextInt();
		System.out.println("Enter Matrix-1 Column Size");
		int csize1 = sc.nextInt();
		System.out.println("Enter Matrix-2 Row Size");
		int rsize2 = sc.nextInt();
		System.out.println("Enter Matrix-2 Column Size");
		int csize2 = sc.nextInt();
		if (rsize1 == csize2) {
			int i, j, k;
			int a[][] = new int[rsize1][csize1];
			int b[][] = new int[rsize2][csize2];
			int c[][] = new int[rsize1][csize1];
			System.out.println("Enter Matrix-1 Element One by One");
			for (i = 0; i < rsize1; i++) {
				for (j = 0; j < csize1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Matrix-2 Element One by One");
			for (i = 0; i < rsize2; i++) {
				for (j = 0; j < csize2; j++) {
					b[i][j] = sc.nextInt();
				}
			}

			for (i = 0; i < rsize1; i++) {
				for (j = 0; j < csize2; j++) {
					c[i][j] = 0;
					for (k = 0; k < csize1; k++) {
						c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
					}
				}
			}
			System.out.println("Matrix-1 Element Are:");
			for (i = 0; i < rsize1; i++) {
				for (j = 0; j < csize1; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();

			}
			System.out.println("Matrix-2 Element Are:");
			for (i = 0; i < rsize2; i++) {
				for (j = 0; j < csize2; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();

			}
			System.out.println("Matrix-3 Element Are:");
			for (i = 0; i < rsize1; i++) {
				for (j = 0; j < csize2; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();

			}

		} else {
			System.out.println("Matrix Multilication is not possible....");
		}
	}

}
