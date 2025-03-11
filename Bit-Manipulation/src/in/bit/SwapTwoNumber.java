package in.bit;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value ::");
		int a = sc.nextInt();
		System.out.println("Enter b VAlue ::");
		int b = sc.nextInt();
		System.out.println("Before Swaping a = " +  a +  " and b = " +  b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swaping a = " +  a +  " and b = " +  b);

	}

}
/*Enter a Value ::
65
Enter b VAlue ::
98
Before Swaping a = 65 and b = 98
After Swaping a = 98 and b = 65

 * 
 */
