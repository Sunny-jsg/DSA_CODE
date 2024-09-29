
import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList al = new ArrayList();

		int a = 0;
		int b = 1;
		al.add(a);
		al.add(b);
		for (int i = 0; i <= n; i++) {
			int c = a + b;
			al.add(c);
			a = b;
			b = c;

		}
		System.out.println(al);
	}

}
