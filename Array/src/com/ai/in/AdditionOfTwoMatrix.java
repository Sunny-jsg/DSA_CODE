package com.ai.in;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
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
		if (rsize1 == rsize2 && csize1 == csize2) {
			int i, j;
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
				for (j = 0; j < csize1; j++) {
					c[i][j] = a[i][j] + b[i][j];
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
				for (j = 0; j < csize1; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();

			}

		} else {
			System.out.println("Matrix Addition is not possible....");
		}
	}

}
/* Output
 * Enter Matrix-1 Row Size
3
Enter Matrix-1 Column Size
3
Enter Matrix-2 Row Size
3
Enter Matrix-2 Column Size
3
Enter Matrix-1 Element One by One
1
2
3
4
5
6
7
8
9
Enter Matrix-2 Element One by One
1
2
3
4
5
6
7
8
9
Matrix-1 Element Are:
1 2 3 
4 5 6 
7 8 9 
Matrix-2 Element Are:
1 2 3 
4 5 6 
7 8 9 
Matrix-3 Element Are:
2 4 6 
8 10 12 
14 16 18 
*/
